package com.wookong.mall.controller.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.dto.SkuDTO;
import com.wookong.mall.common.dto.UserReciveAddressDTO;
import com.wookong.mall.domain.service.UserService;

/**
 * 会员管理
 * @author Administrator
 *
 */
@RestController
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	/**
	 * 会员收货地址
	 */
	 @RequestMapping(value = "/user/queryUserReceiveAddress", method = RequestMethod.POST)
	public BaseResp<List<UserReciveAddressDTO>> queryUserReceiveAddress(Long userId) {
		 logger.info("查询会员收货地址开始");
	        BaseResp<List<UserReciveAddressDTO>> resp = BaseResp.buildSuccessBaseResp();
	        try{
	            List<UserReciveAddressDTO> adreList=userService.queryUserReceiveAddress(userId);
	            resp.setData(adreList);
	            
	        }catch(Exception e){
	            logger.error("查询会员收货地址异常",e);
	            resp = BaseResp.buildFailResp("查询会员收货地址异常", BaseResp.class);
	        }finally{
	            logger.info("查询会员收货地址结束,resp:{}",resp);
	        }
	        
	        return resp;
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
