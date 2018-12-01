package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.ConfigCountryDO;
import com.wookong.mall.dal.dataobject.ConfigCountryDOExample;
import java.util.List;

public interface ConfigCountryDOMapper {
    long countByExample(ConfigCountryDOExample example);

    int insertSelective(ConfigCountryDO record);

    List<ConfigCountryDO> selectByExample(ConfigCountryDOExample example);

    ConfigCountryDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConfigCountryDO record);

    int updateByPrimaryKey(ConfigCountryDO record);
}