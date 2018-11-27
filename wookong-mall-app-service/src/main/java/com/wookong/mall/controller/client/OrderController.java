package com.wookong.mall.controller.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.OrderDTO;

/**
 * 订单接口
 * @author Administrator
 */
@Controller
public class OrderController {
	 private final Logger logger = LoggerFactory.getLogger(getClass());

	 /**
	  * 查询会员订单
	  * @param userId 会员id
	  * @param orderType 订单类型：
	  */
	 @RequestMapping(value = "/order/queryUserOrders", method = RequestMethod.GET)
	 @ResponseBody
	 public BaseResp<List<OrderDTO>> queryUserOrders(Long userId,String orderType) {
		 return null;
	 }
	 
	 /**
	  * 预定
	  */
	 @RequestMapping(value = "/order/reserve", method = RequestMethod.GET)
	 @ResponseBody
	 public BaseResp<OrderDTO> reserve() {
		 
		 return null;
	 }
	 
	 /**
	  * 查询订单明细
	  * @param orderId
	  */
	 @RequestMapping(value = "/order/queryOrderDetail", method = RequestMethod.GET)
	 @ResponseBody
	 public BaseResp<OrderDTO> queryOrderDetail(Long orderId) {
		 
		 return null;
	 }
	 
	 /**
	  * 退款(不退预定款)
	  */
	 @RequestMapping(value = "/order/refund", method = RequestMethod.GET)
	 @ResponseBody
	 public BaseResp refund() {
		 return null;
	 }
	 
	 /**
	  * 查看退款明细
	  */
	 @RequestMapping(value = "/order/queryRefundDetail", method = RequestMethod.GET)
	 @ResponseBody
	 public BaseResp queryRefundDetail(Long refundId) {
		 return null;
	 }
	 

}
