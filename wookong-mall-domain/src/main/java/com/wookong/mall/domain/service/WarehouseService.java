package com.wookong.mall.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wookong.mall.common.dto.WarehouseDTO;
import com.wookong.mall.dal.dao.WarehouseDOMapper;

/**
 * 仓库
 * @author wangzhifeng
 *
 */
@Service
public class WarehouseService {
    
    @Autowired
    private WarehouseDOMapper dao;
    
    @Transactional
    public void add(WarehouseDTO req){
        
        dao.insertSelective(null);
    }
    
    @Transactional
    public void modify(WarehouseDTO req){
        
    }
    
    @Transactional
    public void delete(WarehouseDTO req){
        
    }
    
    public List<WarehouseDTO> loadAll( ){
        
        return null;
    }
}
