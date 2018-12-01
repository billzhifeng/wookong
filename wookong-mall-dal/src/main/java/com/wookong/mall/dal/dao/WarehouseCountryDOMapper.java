package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.WarehouseCountryDO;
import com.wookong.mall.dal.dataobject.WarehouseCountryDOExample;
import java.util.List;

public interface WarehouseCountryDOMapper {
    long countByExample(WarehouseCountryDOExample example);

    int insertSelective(WarehouseCountryDO record);

    List<WarehouseCountryDO> selectByExample(WarehouseCountryDOExample example);

    WarehouseCountryDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WarehouseCountryDO record);

    int updateByPrimaryKey(WarehouseCountryDO record);
}