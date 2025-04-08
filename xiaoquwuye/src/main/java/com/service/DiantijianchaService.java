package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiantijianchaEntity;
import java.util.Map;

/**
 * 电梯监测 服务类
 */
public interface DiantijianchaService extends IService<DiantijianchaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}