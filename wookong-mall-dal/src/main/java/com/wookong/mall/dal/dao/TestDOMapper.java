package com.wookong.mall.dal.dao;

import com.wookong.mall.dal.dataobject.TestDO;
import com.wookong.mall.dal.dataobject.TestDOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDOMapper {
    long countByExample(TestDOCondition example);

    int deleteByPrimaryKey(Long id);

    int insert(TestDO record);

    int insertSelective(TestDO record);

    List<TestDO> selectByExample(TestDOCondition example);

    int updateByExampleSelective(@Param("record") TestDO record, @Param("example") TestDOCondition example);

    int updateByExample(@Param("record") TestDO record, @Param("example") TestDOCondition example);
    
    TestDO selectByPrimaryKey(Long id);
}