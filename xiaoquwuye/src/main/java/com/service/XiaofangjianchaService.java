package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofangjianchaEntity;
import java.util.Map;

/**
 * 消防检查 服务类
 */
public interface XiaofangjianchaService extends IService<XiaofangjianchaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}