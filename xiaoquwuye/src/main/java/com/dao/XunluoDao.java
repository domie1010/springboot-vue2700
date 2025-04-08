package com.dao;

import com.entity.XunluoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XunluoView;

/**
 * 巡逻 Dao 接口
 *
 * @author 
 */
public interface XunluoDao extends BaseMapper<XunluoEntity> {

   List<XunluoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
