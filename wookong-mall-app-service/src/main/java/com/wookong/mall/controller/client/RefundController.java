package com.wookong.mall.controller.client;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseResp;

/**
 * 退货退款接口
 * @author Administrator
 */
@RestController
public class RefundController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 会员退货申请
     */
    @RequestMapping(value = "/refund/queryUserOrders", method = RequestMethod.POST)
    public BaseResp refundApply(HttpServletRequest request) {
        
       
        return null;
    }
}
