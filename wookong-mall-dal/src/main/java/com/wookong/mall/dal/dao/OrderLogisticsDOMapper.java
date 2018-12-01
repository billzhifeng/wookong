package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.OrderLogisticsDO;
import com.wookong.mall.dal.dataobject.OrderLogisticsDOExample;
import java.util.List;

public interface OrderLogisticsDOMapper {
    long countByExample(OrderLogisticsDOExample example);

    int insertSelective(OrderLogisticsDO record);

    List<OrderLogisticsDO> selectByExample(OrderLogisticsDOExample example);

    OrderLogisticsDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLogisticsDO record);

    int updateByPrimaryKey(OrderLogisticsDO record);
}