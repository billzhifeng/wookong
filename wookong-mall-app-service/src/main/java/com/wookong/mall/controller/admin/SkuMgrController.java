package com.wookong.mall.controller.admin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseException;
import com.github.java.common.base.BaseResp;
import com.github.java.common.utils.JavaAssert;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.common.enums.ReturnCode;
import com.wookong.mall.domain.service.SkuService;

/**
 * sku管理
 */
@RestController
public class SkuMgrController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private SkuService skuService;
    
    /**
     * 添加sku
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/admin/sku/addSku", method = RequestMethod.POST)
    public BaseResp addSku(SkuDTO req) {
        logger.info("添加商品开始,req:{}",req);
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessBaseResp();
        try{
            //验证添加sku参数
            validateAddSkuReq(req);
            
            //保存
            skuService.addSku(req);
        }catch(BaseException e){
            logger.info("添加商品发生自定义异常,req:{},异常:{}",req,e);
            resp = BaseResp.buildFailResp("添加商品异常", BaseResp.class);
        }catch(Exception e){
            logger.error("添加商品发生未知异常,req:{}",req,e);
            resp = BaseResp.buildFailResp("添加商品异常", BaseResp.class);
        }finally{
            logger.info("添加商品结束,resp:{}",resp);
        }
        return resp;
    }
    
    /**
     * 修改sku
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/admin/sku/modifySku", method = RequestMethod.POST)
    public BaseResp modifySku(SkuDTO req) {
        logger.info("修改商品开始,req:{}",req);
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessBaseResp();
        try{
            //验证修改sku参数
            validateModifySkuReq(req);
            //修改
            skuService.modifySku(req);
        }catch(BaseException e){
            logger.info("修改商品发生自定义异常,req:{},异常:{}",req,e);
            resp = BaseResp.buildFailResp("修改商品异常", BaseResp.class);
        }catch(Exception e){
            logger.error("修改商品发生未知异常,req:{}",req,e);
            resp = BaseResp.buildFailResp("修改商品异常", BaseResp.class);
        }finally{
            logger.info("修改品结束,resp:{}",resp);
        }
        return resp;
    }
    
    /**
     * 删除sku
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/admin/sku/deleteSku", method = RequestMethod.POST)
    public BaseResp deleteSku(SkuDTO req) {
        logger.info("删除商品开始,req:{}",req);
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessBaseResp();
        try{
            //验证删除参数
            validateDeleteSkuReq(req);
            //删除
            skuService.deleteSku(req);
        }catch(BaseException e){
            logger.info("删除商品发生自定义异常,req:{},异常:{}",req,e);
            resp = BaseResp.buildFailResp("删除商品异常", BaseResp.class);
        }catch(Exception e){
            logger.error("删除商品发生未知异常,req:{}",req,e);
            resp = BaseResp.buildFailResp("删除商品异常", BaseResp.class);
        }finally{
            logger.info("删除商品结束,resp:{}",resp);
        }
        return resp;
    }
    

    /**
     * 查询全部sku
     */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/admin/sku/queryAllSKUS", method = RequestMethod.POST)
    public BaseResp<List<SkuDTO>> queryAllSKUS() {
        logger.info("后台查询全部商品开始");
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessBaseResp();
        try{
            List<SkuDTO> skulist=skuService.queryAllSKUS();
            resp.setData(skulist);
            
        }catch(Exception e){
            logger.error("后台查询全部商品异常",e);
            resp = BaseResp.buildFailResp("后台查询全部商品异常", BaseResp.class);
        }finally{
            logger.info("后台查询全部商品结束,resp:{}",resp);
        }
        
        return resp;
    }
    
    /**
     * 查询sku
     * 
     * @param skuId
     */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/admin/sku/querySKUById/{skuId}", method = RequestMethod.POST)
    public BaseResp<SkuDTO> querySKUById(@PathVariable Long skuId) {
        
        logger.info("后台根据商品ID:{}查询商品开始",skuId);
        BaseResp<SkuDTO> resp = BaseResp.buildSuccessBaseResp();
        try{
            SkuDTO sku = skuService.querySKUById(skuId);
            resp.setData(sku);
            
        }catch(Exception e){
            
            logger.error("后台根据商品ID查询商品异常,skuId:{}",skuId,e);
            resp = BaseResp.buildFailResp("商品ID="+skuId+"不存在", BaseResp.class);
        }finally{
            logger.info("后台根据商品ID：{},查询商品结束,resp:{}",skuId,resp);
        }
        return resp;
    }

    
    //私有方法
    /**
     * 验证添加sku参数
     * @param req
     */
    private void validateAddSkuReq(SkuDTO req){
        JavaAssert.notNull(req, ReturnCode.PARAM_ILLEGLE, "参数为空", BaseException.class);
        //TODO 其他必填参数验证
    }
    
    /**
     * 验证修改sku参数
     * @param req
     */
    private void validateModifySkuReq(SkuDTO req){
        JavaAssert.notNull(req, ReturnCode.PARAM_ILLEGLE, "参数为空", BaseException.class);
        //TODO 其他必填参数验证
    }
    
    /**
     * 验证删除sku参数
     * @param req
     */
    private void validateDeleteSkuReq(SkuDTO req){
        JavaAssert.notNull(req, ReturnCode.PARAM_ILLEGLE, "参数为空", BaseException.class);
        //TODO 其他必填参数验证
    }
}
