package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.CategorySkuMappingDO;
import com.wookong.mall.dal.dataobject.CategorySkuMappingDOExample;
import java.util.List;

public interface CategorySkuMappingDOMapper {
    long countByExample(CategorySkuMappingDOExample example);

    int insertSelective(CategorySkuMappingDO record);

    List<CategorySkuMappingDO> selectByExample(CategorySkuMappingDOExample example);

    CategorySkuMappingDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategorySkuMappingDO record);

    int updateByPrimaryKey(CategorySkuMappingDO record);
}