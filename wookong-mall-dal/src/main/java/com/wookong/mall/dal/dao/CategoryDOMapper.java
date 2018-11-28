package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.CategoryDO;
import com.wookong.mall.dal.dataobject.CategoryDOExample;
import java.util.List;

public interface CategoryDOMapper {
    long countByExample(CategoryDOExample example);

    int insertSelective(CategoryDO record);

    List<CategoryDO> selectByExample(CategoryDOExample example);

    CategoryDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategoryDO record);

    int updateByPrimaryKey(CategoryDO record);
}