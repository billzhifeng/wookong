package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.MallUserDO;
import com.wookong.mall.dal.dataobject.MallUserDOExample;
import java.util.List;

public interface MallUserDOMapper {
    long countByExample(MallUserDOExample example);

    int insertSelective(MallUserDO record);

    List<MallUserDO> selectByExample(MallUserDOExample example);

    MallUserDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserDO record);

    int updateByPrimaryKey(MallUserDO record);
}