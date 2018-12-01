package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.WarehouseDO;
import com.wookong.mall.dal.dataobject.WarehouseDOExample;
import java.util.List;

public interface WarehouseDOMapper {
    long countByExample(WarehouseDOExample example);

    int insertSelective(WarehouseDO record);

    List<WarehouseDO> selectByExample(WarehouseDOExample example);

    WarehouseDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WarehouseDO record);

    int updateByPrimaryKey(WarehouseDO record);
}