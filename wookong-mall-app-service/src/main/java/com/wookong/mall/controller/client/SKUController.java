package com.wookong.mall.controller.client;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
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
    @ResponseBody
    public BaseResp<List<SkuDTO>> queryAllSKUS() {
        logger.info("查询全部商品开始");
        BaseResp<List<SkuDTO>> resp = null;
        try{
            List<SkuDTO> skulist=skuService.queryAllSKUS();
            resp.setData(skulist);
            if (CollectionUtils.isEmpty(skulist)) {
                resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                resp.setReturnMsg("商品不存在");
            }
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
    @RequestMapping(value = "/sku/querySKUById", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<SkuDTO> querySKUById(Long skuId) {
        
        logger.info("根据商品ID查询商品开始",skuId);
        BaseResp<SkuDTO> resp = null;
        try{
            SkuDTO sku = skuService.querySKUById(skuId);
            if(null==sku){
                resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                resp.setReturnMsg("商品不存在");
            }
        }catch(Exception e){
            logger.error("根据商品ID查询商品异常",e);
            resp = BaseResp.buildFailResp("根据商品ID查询商品异常", BaseResp.class);
        }finally{
            logger.info("根据商品ID查询商品结束,resp:{}",resp);
        }
        return resp;
    }

    /**
     * 查询分类下全部sku
     */
    @RequestMapping(value = "/sku/queryCategorySKUS", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<List<SkuDTO>> queryCategorySKUS(Long categoryId) {
        
        logger.info("根据分类ID查询商品开始",categoryId);
        BaseResp<List<SkuDTO>> resp = null;
        try{
            List<SkuDTO> skulist = skuService.queryCategorySKUS(categoryId);
            if(CollectionUtils.isEmpty(skulist)){
                resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                resp.setReturnMsg("该分类下不存在商品");
            }
        }catch(Exception e){
            logger.error("根据分类ID查询商品异常",e);
            resp = BaseResp.buildFailResp("根据分类ID查询商品异常", BaseResp.class);
        }finally{
            logger.info("根据分类ID查询商品结束,resp:{}",resp);
        }
        return resp;
    }

    /**
     * 查询分类下全部分类
     */
    @RequestMapping(value = "/sku/queryAllCategorys", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<List<CategoryDTO>> queryAllCategorys() {
        logger.info("查询全部分类开始");
        BaseResp<List<CategoryDTO>> resp = null;
        try{
            List<CategoryDTO> list = categoryService.loadAllCategorys();
            resp = BaseResp.buildSuccessResp(BaseResp.class);
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
