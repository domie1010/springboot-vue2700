package com.dao;

import com.entity.ZhiriEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiriView;

/**
 * 值日 Dao 接口
 *
 * @author 
 */
public interface ZhiriDao extends BaseMapper<ZhiriEntity> {

   List<ZhiriView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
