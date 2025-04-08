package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvhuagenghuanEntity;
import java.util.Map;

/**
 * 绿化更换 服务类
 */
public interface LvhuagenghuanService extends IService<LvhuagenghuanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}