package com.wookong.mall.controller.client;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.OrderDTO;

/**
 * 订单接口
 * @author Administrator
 */
@RestController
public class OrderController {
	 private final Logger logger = LoggerFactory.getLogger(getClass());

	 /**
	  * 查询会员订单
	  * @param userId 会员id
	  * @param orderType 订单类型：
	  */
	 @RequestMapping(value = "/order/queryUserOrders", method = RequestMethod.POST)
	 public BaseResp<List<OrderDTO>> queryUserOrders(HttpServletRequest request,Long userId,String orderType) {
	     
	     String token = request.getHeader("token");
		 return null;
	 }
	 
	 /**
	  * 预定
	  */
	 @RequestMapping(value = "/order/reserve", method = RequestMethod.POST)
	 public BaseResp<OrderDTO> reserve() {
		 
		 return null;
	 }
	 
	 /**
	  * 查询订单明细
	  * @param orderId
	  */
	 @RequestMapping(value = "/order/queryOrderDetail", method = RequestMethod.POST)
	 public BaseResp<OrderDTO> queryOrderDetail(Long orderId) {
		 
		 return null;
	 }
	 
	 /**
	  * 退款(不退预定款)
	  */
	 @RequestMapping(value = "/order/refund", method = RequestMethod.POST)
	 public BaseResp refund() {
		 return null;
	 }
	 
	 /**
	  * 查看退款明细
	  */
	 @RequestMapping(value = "/order/queryRefundDetail", method = RequestMethod.POST)
	 public BaseResp queryRefundDetail(Long refundId) {
		 return null;
	 }
	 

}
