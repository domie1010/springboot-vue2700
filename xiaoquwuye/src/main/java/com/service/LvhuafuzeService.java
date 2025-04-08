package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvhuafuzeEntity;
import java.util.Map;

/**
 * 绿化负责 服务类
 */
public interface LvhuafuzeService extends IService<LvhuafuzeEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}