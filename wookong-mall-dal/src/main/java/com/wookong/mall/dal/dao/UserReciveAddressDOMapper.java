package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.UserReciveAddressDO;
import com.wookong.mall.dal.dataobject.UserReciveAddressDOExample;
import java.util.List;

public interface UserReciveAddressDOMapper {
    long countByExample(UserReciveAddressDOExample example);

    int insertSelective(UserReciveAddressDO record);

    List<UserReciveAddressDO> selectByExample(UserReciveAddressDOExample example);

    UserReciveAddressDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserReciveAddressDO record);

    int updateByPrimaryKey(UserReciveAddressDO record);
}