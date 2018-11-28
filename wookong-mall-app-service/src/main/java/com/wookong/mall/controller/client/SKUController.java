package com.wookong.mall.controller.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.CategoryDTO;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.domain.service.CategoryService;

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
    
    /**
     * 查询全部sku
     */
    @RequestMapping(value = "/sku/queryAllSKUS", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<List<SkuDTO>> queryAllSKUS() {
        return null;
    }

    /**
     * 查询sku
     * 
     * @param skuId
     */
    @RequestMapping(value = "/sku/querySKUById", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<SkuDTO> querySKUById(Long skuId) {
        return null;
    }

    /**
     * 查询分类下全部sku
     */
    @RequestMapping(value = "/sku/queryCategorySKUS", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<List<SkuDTO>> queryCategorySKUS(Long categoryId) {
        return null;
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
