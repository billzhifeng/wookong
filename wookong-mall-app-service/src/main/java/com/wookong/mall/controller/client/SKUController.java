package com.wookong.mall.controller.client;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.CategoryDTO;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.common.enums.ReturnCode;
import com.wookong.mall.domain.service.CategoryService;
import com.wookong.mall.domain.service.SkuService;

/**
 * 商品管理
 * 
 * @author Administrator
 */
@RestController
public class SKUController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    private SkuService skuService;
    
    /**
     * 查询全部sku
     */
    @RequestMapping(value = "/sku/queryAllSKUS", method = RequestMethod.POST)
    public BaseResp<List<SkuDTO>> queryAllSKUS() {
        logger.info("查询全部商品开始");
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessResp(BaseResp.class);
        try{
            List<SkuDTO> skulist=skuService.queryAllSKUS();
            resp.setData(skulist);
            
        }catch(Exception e){
            logger.error("查询全部商品异常",e);
            resp = BaseResp.buildFailResp("查询全部商品异常", BaseResp.class);
        }finally{
            logger.info("查询全部商品结束,resp:{}",resp);
        }
        
        return resp;
    }

    /**
     * 查询sku
     * 
     * @param skuId
     */
    @RequestMapping(value = "/sku/querySKUById/{skuId}", method = RequestMethod.POST)
    public BaseResp<SkuDTO> querySKUById(@PathVariable Long skuId) {
        
        logger.info("根据商品ID:{}查询商品开始",skuId);
        BaseResp<SkuDTO> resp = null;
        try{
            SkuDTO sku = skuService.querySKUById(skuId);
        }catch(Exception e){
            logger.error("根据商品ID查询商品异常,skuId:{}",skuId,e);
            resp = BaseResp.buildFailResp("商品ID="+skuId+"不存在", BaseResp.class);
        }finally{
            logger.info("根据商品ID：{},查询商品结束,resp:{}",skuId,resp);
        }
        return resp;
    }

    /**
     * 查询分类下全部sku
     */
    @RequestMapping(value = "/sku/queryCategorySKUS/{categoryId}", method = RequestMethod.POST)
    public BaseResp<List<SkuDTO>> queryCategorySKUS(@PathVariable Long categoryId) {
        
        logger.info("根据分类ID查询商品开始",categoryId);
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessResp(BaseResp.class);
        try{
            List<SkuDTO> skulist = skuService.queryCategorySKUS(categoryId);
            resp.setData(skulist);
        }catch(Exception e){
            logger.error("根据分类ID查询商品异常,categoryId:{}",categoryId,e);
            resp = BaseResp.buildFailResp("根据分类ID查询商品异常", BaseResp.class);
        }finally{
            logger.info("根据分类ID查询商品结束,resp:{}",resp);
        }
        return resp;
    }

    /**
     * 查询全部分类
     */
    @RequestMapping(value = "/sku/queryAllCategorys", method = RequestMethod.POST)
    public BaseResp<List<CategoryDTO>> queryAllCategorys() {
        logger.info("查询全部分类开始");
        BaseResp<List<CategoryDTO>> resp =  BaseResp.buildSuccessResp(BaseResp.class);
        try{
            List<CategoryDTO> list = categoryService.loadAllCategorys();
            resp.setData(list);
        }catch(Exception e){
            logger.error("查询全部分类异常",e);
            resp = BaseResp.buildFailResp("查询全部分类异常", BaseResp.class);
        }finally{
            logger.info("查询全部分类结束,resp:{}",resp);
        }
        return resp;
    }

}
