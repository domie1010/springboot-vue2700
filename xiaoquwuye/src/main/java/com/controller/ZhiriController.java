package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ZhiriEntity;

import com.service.ZhiriService;
import com.entity.view.ZhiriView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 值日
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhiri")
public class ZhiriController {
    private static final Logger logger = LoggerFactory.getLogger(ZhiriController.class);

    @Autowired
    private ZhiriService zhiriService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("业主".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("租户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("保安".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("员工".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("orderBy","id");
        PageUtils page = zhiriService.queryPage(params);

        //字典表数据转换
        List<ZhiriView> list =(List<ZhiriView>)page.getList();
        for(ZhiriView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhiriEntity zhiri = zhiriService.selectById(id);
        if(zhiri !=null){
            //entity转view
            ZhiriView view = new ZhiriView();
            BeanUtils.copyProperties( zhiri , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(zhiri.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiriEntity zhiri, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhiri:{}",this.getClass().getName(),zhiri.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("业主".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("租户".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("保安".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("员工".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<ZhiriEntity> queryWrapper = new EntityWrapper<ZhiriEntity>()
            .eq("yonghu_id", zhiri.getYonghuId())
            .eq("zhiri_time", zhiri.getZhiriTime())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhiriEntity zhiriEntity = zhiriService.selectOne(queryWrapper);
        if(zhiriEntity==null){
            zhiri.setInsertTime(new Date());
            zhiri.setCreateTime(new Date());
            zhiriService.insert(zhiri);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhiriEntity zhiri, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhiri:{}",this.getClass().getName(),zhiri.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("业主".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("租户".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("保安".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("员工".equals(role))
            zhiri.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ZhiriEntity> queryWrapper = new EntityWrapper<ZhiriEntity>()
            .notIn("id",zhiri.getId())
            .andNew()
            .eq("yonghu_id", zhiri.getYonghuId())
            .eq("zhiri_time", zhiri.getZhiriTime())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhiriEntity zhiriEntity = zhiriService.selectOne(queryWrapper);
        if(zhiriEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      zhiri.set
            //  }
            zhiriService.updateById(zhiri);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zhiriService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

