package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuFangwuEntity;
import java.util.Map;

/**
 * 房屋登记 服务类
 */
public interface YonghuFangwuService extends IService<YonghuFangwuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}