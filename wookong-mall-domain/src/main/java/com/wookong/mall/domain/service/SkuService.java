package com.wookong.mall.domain.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.java.common.base.BaseException;
import com.github.java.common.utils.JavaAssert;
import com.wookong.mall.common.dto.CategorySkuMappingDTO;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.common.enums.ReturnCode;
import com.wookong.mall.dal.dao.CategorySkuMappingDOMapper;
import com.wookong.mall.dal.dao.SkuDOMapper;
import com.wookong.mall.dal.dataobject.CategorySkuMappingDO;
import com.wookong.mall.dal.dataobject.CategorySkuMappingDOExample;
import com.wookong.mall.dal.dataobject.SkuDO;
import com.wookong.mall.dal.dataobject.SkuDOExample;

/**
 * 商品管理
 */
@Service
public class SkuService {
    @Autowired
    private SkuDOMapper skuDao;
    @Autowired
    private CategorySkuMappingDOMapper mapMapper;
    
    /**
     * 新增
     * @param src
     */
    @Transactional(rollbackFor = Throwable.class)
    public void addSku(SkuDTO src){
        //TODO
    }
    
    /**
     * 修改
     * @param src
     */
    @Transactional(rollbackFor = Throwable.class)
    public void modifySku(SkuDTO src){
        //TODO
    }
    
    /**
     * 删除
     * @param src
     */
    @Transactional(rollbackFor = Throwable.class)
    public void deleteSku(SkuDTO src){
        //TODO
    }
    
    /**
     * 查询全部商品
     * @return
     */
    public List<SkuDTO> queryAllSKUS(){
        SkuDOExample example = new SkuDOExample();
        //SkuDOExample.Criteria cri = example.createCriteria();
        List<SkuDO> dos = skuDao.selectByExample(example);
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
        SkuDO dos = skuDao.selectByPrimaryKey(skuId);
        JavaAssert.notNull(dos, ReturnCode.DATA_NOT_EXIST, "商品ID="+skuId+"不存在", BaseException.class);
        SkuDTO sku = convertToDTO(dos);
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
        CategorySkuMappingDOExample caSkuReexample = new CategorySkuMappingDOExample();
        CategorySkuMappingDOExample.Criteria caSkuRecri = caSkuReexample.createCriteria();
        caSkuRecri.andCategoryIdEqualTo(categoryId);
        
        List<CategorySkuMappingDO> caSkuRes = mapMapper.selectByExample(caSkuReexample);
        if(!CollectionUtils.isEmpty(caSkuRes)){
            for(CategorySkuMappingDO su:caSkuRes){
                skuIdList.add(convertToCaSkuReDTO(su).getSkuId());
            }
        }
        if(!CollectionUtils.isEmpty(skuIdList)){
            SkuDOExample example = new SkuDOExample();
            SkuDOExample.Criteria cri = example.createCriteria();
            cri.andIdIn(skuIdList);
            List<SkuDO> dos = skuDao.selectByExample(example);
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
    
    private CategorySkuMappingDTO convertToCaSkuReDTO(CategorySkuMappingDO su){
        CategorySkuMappingDTO sut = new CategorySkuMappingDTO();
        BeanUtils.copyProperties(su, sut);
        return sut;
    }
}
