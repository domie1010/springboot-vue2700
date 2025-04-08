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

import com.entity.LvhuagenghuanEntity;

import com.service.LvhuagenghuanService;
import com.entity.view.LvhuagenghuanView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 绿化更换
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/lvhuagenghuan")
public class LvhuagenghuanController {
    private static final Logger logger = LoggerFactory.getLogger(LvhuagenghuanController.class);

    @Autowired
    private LvhuagenghuanService lvhuagenghuanService;


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
        PageUtils page = lvhuagenghuanService.queryPage(params);

        //字典表数据转换
        List<LvhuagenghuanView> list =(List<LvhuagenghuanView>)page.getList();
        for(LvhuagenghuanView c:list){
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
        LvhuagenghuanEntity lvhuagenghuan = lvhuagenghuanService.selectById(id);
        if(lvhuagenghuan !=null){
            //entity转view
            LvhuagenghuanView view = new LvhuagenghuanView();
            BeanUtils.copyProperties( lvhuagenghuan , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(lvhuagenghuan.getYonghuId());
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
    public R save(@RequestBody LvhuagenghuanEntity lvhuagenghuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lvhuagenghuan:{}",this.getClass().getName(),lvhuagenghuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("业主".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("租户".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("保安".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("员工".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<LvhuagenghuanEntity> queryWrapper = new EntityWrapper<LvhuagenghuanEntity>()
            .eq("yonghu_id", lvhuagenghuan.getYonghuId())
            .eq("lvhuagenghuan_name", lvhuagenghuan.getLvhuagenghuanName())
            .eq("lvhuagenghuan_jijie", lvhuagenghuan.getLvhuagenghuanJijie())
            .eq("lvhuagenghuan_zhibei", lvhuagenghuan.getLvhuagenghuanZhibei())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LvhuagenghuanEntity lvhuagenghuanEntity = lvhuagenghuanService.selectOne(queryWrapper);
        if(lvhuagenghuanEntity==null){
            lvhuagenghuan.setInsertTime(new Date());
            lvhuagenghuan.setCreateTime(new Date());
            lvhuagenghuanService.insert(lvhuagenghuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LvhuagenghuanEntity lvhuagenghuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,lvhuagenghuan:{}",this.getClass().getName(),lvhuagenghuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("业主".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("租户".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("保安".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("员工".equals(role))
            lvhuagenghuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<LvhuagenghuanEntity> queryWrapper = new EntityWrapper<LvhuagenghuanEntity>()
            .notIn("id",lvhuagenghuan.getId())
            .andNew()
            .eq("yonghu_id", lvhuagenghuan.getYonghuId())
            .eq("lvhuagenghuan_name", lvhuagenghuan.getLvhuagenghuanName())
            .eq("lvhuagenghuan_jijie", lvhuagenghuan.getLvhuagenghuanJijie())
            .eq("lvhuagenghuan_zhibei", lvhuagenghuan.getLvhuagenghuanZhibei())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LvhuagenghuanEntity lvhuagenghuanEntity = lvhuagenghuanService.selectOne(queryWrapper);
        if(lvhuagenghuanEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      lvhuagenghuan.set
            //  }
            lvhuagenghuanService.updateById(lvhuagenghuan);//根据id更新
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
        lvhuagenghuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

