package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.DiantijianchaDao;
import com.entity.DiantijianchaEntity;
import com.service.DiantijianchaService;
import com.entity.view.DiantijianchaView;

/**
 * 电梯监测 服务实现类
 */
@Service("diantijianchaService")
@Transactional
public class DiantijianchaServiceImpl extends ServiceImpl<DiantijianchaDao, DiantijianchaEntity> implements DiantijianchaService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DiantijianchaView> page =new Query<DiantijianchaView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
