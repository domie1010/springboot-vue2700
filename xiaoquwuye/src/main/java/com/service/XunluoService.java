package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XunluoEntity;
import java.util.Map;

/**
 * 巡逻 服务类
 */
public interface XunluoService extends IService<XunluoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}