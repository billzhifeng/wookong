package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.OrderRefundPaymentDO;
import com.wookong.mall.dal.dataobject.OrderRefundPaymentDOExample;
import java.util.List;

public interface OrderRefundPaymentDOMapper {
    long countByExample(OrderRefundPaymentDOExample example);

    int insertSelective(OrderRefundPaymentDO record);

    List<OrderRefundPaymentDO> selectByExample(OrderRefundPaymentDOExample example);

    OrderRefundPaymentDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderRefundPaymentDO record);

    int updateByPrimaryKey(OrderRefundPaymentDO record);
}