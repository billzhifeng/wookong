package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.CategorySkuRelationDO;
import com.wookong.mall.dal.dataobject.CategorySkuRelationDOExample;
import java.util.List;

public interface CategorySkuRelationDOMapper {
    long countByExample(CategorySkuRelationDOExample example);

    int insertSelective(CategorySkuRelationDO record);

    List<CategorySkuRelationDO> selectByExample(CategorySkuRelationDOExample example);

    CategorySkuRelationDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategorySkuRelationDO record);

    int updateByPrimaryKey(CategorySkuRelationDO record);
}