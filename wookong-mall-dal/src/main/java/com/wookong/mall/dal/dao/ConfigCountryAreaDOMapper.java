package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.ConfigCountryAreaDO;
import com.wookong.mall.dal.dataobject.ConfigCountryAreaDOExample;
import java.util.List;

public interface ConfigCountryAreaDOMapper {
    long countByExample(ConfigCountryAreaDOExample example);

    int insertSelective(ConfigCountryAreaDO record);

    List<ConfigCountryAreaDO> selectByExample(ConfigCountryAreaDOExample example);

    ConfigCountryAreaDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConfigCountryAreaDO record);

    int updateByPrimaryKey(ConfigCountryAreaDO record);
}