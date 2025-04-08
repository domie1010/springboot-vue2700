package com.dao;

import com.entity.YonghuFangwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuFangwuView;

/**
 * 房屋登记 Dao 接口
 *
 * @author 
 */
public interface YonghuFangwuDao extends BaseMapper<YonghuFangwuEntity> {

   List<YonghuFangwuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
