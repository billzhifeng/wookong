package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.OrderPaymentDO;
import com.wookong.mall.dal.dataobject.OrderPaymentDOExample;
import java.util.List;

public interface OrderPaymentDOMapper {
    long countByExample(OrderPaymentDOExample example);

    int insertSelective(OrderPaymentDO record);

    List<OrderPaymentDO> selectByExample(OrderPaymentDOExample example);

    OrderPaymentDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPaymentDO record);

    int updateByPrimaryKey(OrderPaymentDO record);
}