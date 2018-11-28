package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.SkuDO;
import com.wookong.mall.dal.dataobject.SkuDOExample;
import java.util.List;

public interface SkuDOMapper {
    long countByExample(SkuDOExample example);

    int insertSelective(SkuDO record);

    List<SkuDO> selectByExample(SkuDOExample example);

    SkuDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SkuDO record);

    int updateByPrimaryKey(SkuDO record);
}