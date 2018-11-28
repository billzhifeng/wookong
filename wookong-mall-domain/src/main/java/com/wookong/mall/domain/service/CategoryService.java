package com.wookong.mall.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.CategoryDTO;
import com.wookong.mall.dal.dao.CategoryDOMapper;
import com.wookong.mall.dal.dataobject.CategoryDO;
import com.wookong.mall.dal.dataobject.CategoryDOExample;

/**
 * 分类
 */
@Service
public class CategoryService {
    
    @Autowired
    private CategoryDOMapper dao;

    /**
     * 查询全部
     * @return
     */
    public List<CategoryDTO> loadAllCategorys(){
        CategoryDOExample example = new CategoryDOExample();
        List<CategoryDO> dos = dao.selectByExample(example);
        
        List<CategoryDTO> list = new ArrayList<CategoryDTO>();
        
        if(!CollectionUtils.isEmpty(dos)){
            for(CategoryDO src:dos){
                list.add(convertToDTO(src));
            }
        }
        return list;
    }
    
    private CategoryDTO convertToDTO(CategoryDO src){
        CategoryDTO tar = new CategoryDTO();
        BeanUtils.copyProperties(src, tar);
        return tar;
    }
}
