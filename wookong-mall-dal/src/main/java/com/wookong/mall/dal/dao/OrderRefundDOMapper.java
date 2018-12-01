package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.OrderRefundDO;
import com.wookong.mall.dal.dataobject.OrderRefundDOExample;
import java.util.List;

public interface OrderRefundDOMapper {
    long countByExample(OrderRefundDOExample example);

    int insertSelective(OrderRefundDO record);

    List<OrderRefundDO> selectByExample(OrderRefundDOExample example);

    OrderRefundDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderRefundDO record);

    int updateByPrimaryKey(OrderRefundDO record);
}