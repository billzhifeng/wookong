package com.wookong.mall.controller.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.SkuDTO;

/**
 * 商品管理
 * @author Administrator
 *
 */
@Controller
public class SKUController {

	 private final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 查询全部sku
	 */
	 @RequestMapping(value = "/sku/queryAllSKUS", method = RequestMethod.GET)
	 @ResponseBody
	public BaseResp<List<SkuDTO>> queryAllSKUS() {
		return null;
	}
	
	
	/**
	 * 查询sku
	 * @param skuId
	 */
	 @RequestMapping(value = "/sku/querySKUById", method = RequestMethod.GET)
	 @ResponseBody
	public BaseResp<SkuDTO> querySKUById(Long skuId) {
		return null;
	}
	
	/**
	 * 查询分类下全部sku
	 */
	 @RequestMapping(value = "/sku/queryCategorySKUS", method = RequestMethod.GET)
	 @ResponseBody
	public BaseResp<List<SkuDTO>> queryCategorySKUS(Long categoryId) {
		return null;
	}

}