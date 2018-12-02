package com.wookong.mall.controller.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付相关
 * @author Administrator
 *
 */
@RestController
public class PaymentController {
	
	 /**
	  * 支付订单预付款
	  */
    @RequestMapping(value = "/pay/payOrderReserve", method = RequestMethod.POST)
	 public void payOrderReserve() {
		 
	 }

	 /**
	  * 支付订单尾款
	  */
    @RequestMapping(value = "/pay/payOrderTail", method = RequestMethod.POST)
	 public void payOrderTail() {
		 
	 }
}
