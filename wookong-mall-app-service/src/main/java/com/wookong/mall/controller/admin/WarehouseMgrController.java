package com.wookong.mall.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseException;
import com.github.java.common.base.BaseResp;
import com.github.java.common.utils.JavaAssert;
import com.github.java.common.utils.StringUtils;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.common.dto.WarehouseDTO;
import com.wookong.mall.common.enums.ReturnCode;
import com.wookong.mall.domain.service.WarehouseService;

/**
 * Warehouse管理
 */
@RestController
public class WarehouseMgrController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private WarehouseService warehouseService;
    /**
     * 添加Warehouse
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/admin/warehouse/addWarehouse", method = RequestMethod.POST)
    public BaseResp addWarehouse(WarehouseDTO req,HttpServletRequest request) {
        logger.info("添加仓库开始,req:{}",req);
        BaseResp<List<SkuDTO>> resp = BaseResp.buildSuccessBaseResp();
        try{
            //验证添加sku参数
            validateAddWarehouseReq(req);
            
            warehouseService.add(req);
        }catch(BaseException e){
            logger.info("添加仓库发生自定义异常,req:{},异常:{}",req,e);
            resp = BaseResp.buildFailResp("添加仓库异常", BaseResp.class);
        }catch(Exception e){
            logger.error("添加仓库发生未知异常,req:{}",req,e);
            resp = BaseResp.buildFailResp("添加仓库异常", BaseResp.class);
        }finally{
            logger.info("添加仓库结束,resp:{}",resp);
        }
        return resp;
    }
    
    /**
     * validateAddWarehouseReq
     */
    private void validateAddWarehouseReq(WarehouseDTO req){
        JavaAssert.notNull(req, ReturnCode.PARAM_ILLEGLE, "参数为空", BaseException.class);
        JavaAssert.isTrue(StringUtils.isNotBlank(req.getName()), ReturnCode.PARAM_ILLEGLE, "仓库名为空", BaseException.class);
    }
}
