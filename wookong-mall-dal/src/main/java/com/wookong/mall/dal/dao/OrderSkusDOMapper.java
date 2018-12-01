package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.OrderSkusDO;
import com.wookong.mall.dal.dataobject.OrderSkusDOExample;
import java.util.List;

public interface OrderSkusDOMapper {
    long countByExample(OrderSkusDOExample example);

    int insertSelective(OrderSkusDO record);

    List<OrderSkusDO> selectByExample(OrderSkusDOExample example);

    OrderSkusDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderSkusDO record);

    int updateByPrimaryKey(OrderSkusDO record);
}