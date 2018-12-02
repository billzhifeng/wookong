package com.wookong.mall.controller.admin;

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
import com.wookong.mall.domain.service.CategoryService;

/**
 * 商品分类管理
 * 
 * @author Administrator
 */
@Controller
public class SKUCategoryController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CategoryService categoryService;
    
    /**
     * 查询全部分类
     */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/admin/queryAllCategorys", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp<List<CategoryDTO>> queryAllCategorys() {

        logger.info("后台查询全部分类开始");
        BaseResp<List<CategoryDTO>> resp =  BaseResp.buildSuccessBaseResp();
        try{
            List<CategoryDTO> list = categoryService.loadAllCategorys();
            resp.setData(list);
        }catch(Exception e){
            logger.error("后台查询全部分类异常",e);
            resp = BaseResp.buildFailResp("后台查询全部分类异常", BaseResp.class);
        }finally{
            logger.info("后台查询全部分类结束,resp:{}",resp);
        }
        return resp;
    }
    
    /**
     * 新增分类
     */
    @RequestMapping(value = "/admin/addCategorySKUS", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp addCategorySKUS() {

        return null;
    }
    
    /**
     * 修改分类
     */
    @RequestMapping(value = "/admin/modifyCategorySKUS", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp modifyCategorySKUS() {

        return null;
    }
    
    /**
     * 删除分类
     */
    @RequestMapping(value = "/admin/deleteCategorySKUS", method = RequestMethod.POST)
    @ResponseBody
    public BaseResp deleteCategorySKUS() {

        return null;
    }

}
