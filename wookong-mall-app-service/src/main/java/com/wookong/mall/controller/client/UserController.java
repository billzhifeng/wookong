package com.wookong.mall.controller.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseResp;

/**
 * 会员管理
 * @author Administrator
 *
 */
@RestController
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 会员收货地址
	 */
	 @RequestMapping(value = "/user/queryUserReceiveAddress", method = RequestMethod.POST)
	public BaseResp<Object> queryUserReceiveAddress(Long userId) {
		
		return null;
	}
	
	/**
	 * 新增
	 * @return
	 */
	 @RequestMapping(value = "/user/addUserReceiveAddress", method = RequestMethod.POST)
	public BaseResp addUserReceiveAddress() {
		
		return null;
	}
	
	/**
	 * 修改
	 * @return
	 */
	 @RequestMapping(value = "/user/modifyUserReceiveAddress", method = RequestMethod.POST)
	public BaseResp modifyUserReceiveAddress() {
		
		return null;
	}
	
	/**
	 * 删除
	 * @return
	 */
	 @RequestMapping(value = "/user/deleteUserReceiveAddress", method = RequestMethod.POST)
	public BaseResp deleteUserReceiveAddress(Long addressId) {
		
		return null;
	}
	
	/**
	 * 修改密码
	 */
	 @RequestMapping(value = "/user/modifyUserPassword", method = RequestMethod.POST)
	public BaseResp modifyUserPassword() {
		
		return null;
	}
}
