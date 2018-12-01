package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.OrderShoppingDO;
import com.wookong.mall.dal.dataobject.OrderShoppingDOExample;
import java.util.List;

public interface OrderShoppingDOMapper {
    long countByExample(OrderShoppingDOExample example);

    int insertSelective(OrderShoppingDO record);

    List<OrderShoppingDO> selectByExample(OrderShoppingDOExample example);

    OrderShoppingDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderShoppingDO record);

    int updateByPrimaryKey(OrderShoppingDO record);
}