package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.ConfigFreightDO;
import com.wookong.mall.dal.dataobject.ConfigFreightDOExample;
import java.util.List;

public interface ConfigFreightDOMapper {
    long countByExample(ConfigFreightDOExample example);

    int insertSelective(ConfigFreightDO record);

    List<ConfigFreightDO> selectByExample(ConfigFreightDOExample example);

    ConfigFreightDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConfigFreightDO record);

    int updateByPrimaryKey(ConfigFreightDO record);
}