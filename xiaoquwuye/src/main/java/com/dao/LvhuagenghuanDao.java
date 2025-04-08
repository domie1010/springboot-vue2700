package com.dao;

import com.entity.LvhuagenghuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvhuagenghuanView;

/**
 * 绿化更换 Dao 接口
 *
 * @author 
 */
public interface LvhuagenghuanDao extends BaseMapper<LvhuagenghuanEntity> {

   List<LvhuagenghuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
