package com.wookong.mall.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.common.enums.ReturnCode;
import com.wookong.mall.controller.client.req.LoginReq;
import com.wookong.mall.domain.user.User;
import com.wookong.mall.domain.user.UserRepository;

/**
 * 管理员登录、退出
 * 
 * @author Administrator
 *
 */
@RestController
public class ManagerLoginController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserRepository userRepository;
	
	final static String userSessionKey = "manager";
	
	/**
	 * 登录
	 */
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public BaseResp<User> login(LoginReq req, HttpServletRequest request) {
    	 BaseResp<User> resp = BaseResp.buildSuccessResp(BaseResp.class);
         try {
             logger.info("登录请求:loginName:{}", req.getLoginName());
             User user = userRepository.loadByLoginName(req.getLoginName());
             if (null == user) {
                 resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                 resp.setReturnMsg("登录名为 " + req.getLoginName() + " 用户不存在");
                 return resp;
             }
             if (user.getPasswd().equals(req.getPasswd())) {
                 user.setPasswd(null);
                 HttpSession session = request.getSession();
                 session.setAttribute(userSessionKey, user);
             } else {
                 resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                 resp.setReturnMsg("用户名或密码不正确");
             }
             resp.setData(user);
             return resp;
         } catch (Exception e) {
             logger.error("登录异常,req:{}", req, e);
             return BaseResp.buildFailResp("登录失败", BaseResp.class);
         }
	}

	/**
	 * 退出
	 */
    @RequestMapping(value = "/admin/logout", method = RequestMethod.POST)
	public BaseResp logout(HttpServletRequest request) {
		BaseResp<User> resp = BaseResp.buildSuccessResp(BaseResp.class);
        try {
            logger.info("收到退出请求");
            HttpSession session = request.getSession();
            if(null!= session.getAttribute(userSessionKey)) {
            	logger.info("已登录,执行退出操作开始");
            	session.removeAttribute(userSessionKey);
            	logger.info("已登录,执行退出操作完成");
            }
            resp.setReturnMsg("退出成功");
            return resp;
        } catch (Exception e) {
            logger.error("退出异常", e);
            return BaseResp.buildFailResp("退出失败", BaseResp.class);
        }
	}

}
