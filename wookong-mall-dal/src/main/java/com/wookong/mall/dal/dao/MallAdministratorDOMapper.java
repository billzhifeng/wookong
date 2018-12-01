package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.MallAdministratorDO;
import com.wookong.mall.dal.dataobject.MallAdministratorDOExample;
import java.util.List;

public interface MallAdministratorDOMapper {
    long countByExample(MallAdministratorDOExample example);

    int insertSelective(MallAdministratorDO record);

    List<MallAdministratorDO> selectByExample(MallAdministratorDOExample example);

    MallAdministratorDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallAdministratorDO record);

    int updateByPrimaryKey(MallAdministratorDO record);
}