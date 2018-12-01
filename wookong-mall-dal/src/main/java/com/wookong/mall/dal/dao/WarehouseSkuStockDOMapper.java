package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.WarehouseSkuStockDO;
import com.wookong.mall.dal.dataobject.WarehouseSkuStockDOExample;
import java.util.List;

public interface WarehouseSkuStockDOMapper {
    long countByExample(WarehouseSkuStockDOExample example);

    int insertSelective(WarehouseSkuStockDO record);

    List<WarehouseSkuStockDO> selectByExample(WarehouseSkuStockDOExample example);

    WarehouseSkuStockDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WarehouseSkuStockDO record);

    int updateByPrimaryKey(WarehouseSkuStockDO record);
}