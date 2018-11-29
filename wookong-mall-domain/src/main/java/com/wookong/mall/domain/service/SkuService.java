package com.wookong.mall.domain.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.wookong.mall.common.dto.CategoryDTO;
import com.wookong.mall.common.dto.CategorySkuRelationDTO;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.dal.dao.CategorySkuRelationDOMapper;
import com.wookong.mall.dal.dao.SkuDOMapper;
import com.wookong.mall.dal.dataobject.CategoryDO;
import com.wookong.mall.dal.dataobject.CategoryDOExample;
import com.wookong.mall.dal.dataobject.CategorySkuRelationDO;
import com.wookong.mall.dal.dataobject.CategorySkuRelationDOExample;
import com.wookong.mall.dal.dataobject.SkuDO;
import com.wookong.mall.dal.dataobject.SkuDOExample;


@Service
public class SkuService {
    @Autowired
    private SkuDOMapper dao;
    @Autowired
    private CategorySkuRelationDOMapper caSkuReMapperDao;
    
    /**
     * 查询全部商品
     * @return
     */
    public List<SkuDTO> queryAllSKUS(){
        SkuDOExample example = new SkuDOExample();
        SkuDOExample.Criteria cri = example.createCriteria();
        List<SkuDO> dos = dao.selectByExample(example);
        List<SkuDTO> list = new ArrayList<SkuDTO>();
        
        if(!CollectionUtils.isEmpty(dos)){
            for(SkuDO su:dos){
                list.add(convertToDTO(su));
            }
        }
        return list;
    }
    

    /**
     * 根据商品ID（skuID）查询商品
     * @param skuId
     * @return
     */
    public SkuDTO querySKUById(Long skuId) {
        SkuDTO sku = new SkuDTO();
        SkuDO dos = dao.selectByPrimaryKey(skuId);
        if(null!=sku ){
            sku = convertToDTO(dos);
        }
        return sku;
    }
    
    /**
     * 根据分类ID查询商品
     * @param categoryId
     * @return
     */
    public List<SkuDTO> queryCategorySKUS(Long categoryId) {
        List<SkuDTO> list=null;
        //根据CategoryId查询商品ID
        List<Long> skuIdList = null;
        CategorySkuRelationDOExample caSkuReexample = new CategorySkuRelationDOExample();
        CategorySkuRelationDOExample.Criteria caSkuRecri = caSkuReexample.createCriteria();
        caSkuRecri.andCategoryIdEqualTo(categoryId);
        
        List<CategorySkuRelationDO> caSkuRes = caSkuReMapperDao.selectByExample(caSkuReexample);
        if(!CollectionUtils.isEmpty(caSkuRes)){
            for(CategorySkuRelationDO su:caSkuRes){
                skuIdList.add(convertToCaSkuReDTO(su).getSkuId());
            }
        }
        if(!CollectionUtils.isEmpty(skuIdList)){
            SkuDOExample example = new SkuDOExample();
            SkuDOExample.Criteria cri = example.createCriteria();
            cri.andIdIn(skuIdList);
            List<SkuDO> dos = dao.selectByExample(example);
            if(!CollectionUtils.isEmpty(dos)){
                for(SkuDO su:dos){
                    list.add(convertToDTO(su));
                }
            }
        }
        return list;
    }
    
    private SkuDTO convertToDTO(SkuDO su){
        SkuDTO sut = new SkuDTO();
        BeanUtils.copyProperties(su, sut);
        return sut;
    }
    
    private CategorySkuRelationDTO convertToCaSkuReDTO(CategorySkuRelationDO su){
        CategorySkuRelationDTO sut = new CategorySkuRelationDTO();
        BeanUtils.copyProperties(su, sut);
        return sut;
    }
}
