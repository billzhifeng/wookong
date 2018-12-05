package com.wookong.mall.controller.client;

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
import com.wookong.mall.common.dto.UserDTO;
import com.wookong.mall.common.enums.ReturnCode;
import com.wookong.mall.controller.client.req.LoginReq;
import com.wookong.mall.controller.client.req.UserRegisterReq;
import com.wookong.mall.domain.user.User;
import com.wookong.mall.domain.user.UserRepository;
import com.wookong.mall.web.token.TokenHelper;

/**
 * 会员登录、退出
 * @author Administrator
 *
 */
@RestController
public class UserLoginController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserRepository userRepository;
	/**
	 * 登录
	 */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
	public BaseResp<UserDTO> login(LoginReq req, HttpServletRequest request) {
    	 BaseResp<UserDTO> resp = BaseResp.buildSuccessBaseResp();
         try {
             JavaAssert.notNull(req, ReturnCode.PARAM_ILLEGLE, "登录请求为空", BaseException.class);
             JavaAssert.isTrue(StringUtils.isNotBlank(req.getLoginName()), ReturnCode.PARAM_ILLEGLE, "登录名为空", BaseException.class);
             JavaAssert.isTrue(StringUtils.isNotBlank(req.getPasswd()), ReturnCode.PARAM_ILLEGLE, "登录密码为空", BaseException.class);
             String passwd = req.getPasswd();
             req.setPasswd(null);
             
             logger.info("会员登录请求:loginName:{}", req.getLoginName());
             User user = userRepository.loadByLoginName(req.getLoginName());
             if (null == user) {
                 resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                 resp.setReturnMsg("登录名为 " + req.getLoginName() + " 用户不存在");
                 return resp;
             }
             if (!user.getPassword().equals(passwd)) {
                 resp.setReturnCode(ReturnCode.DATA_NOT_EXIST.getCode());
                 resp.setReturnMsg("用户名或密码不正确");
             }
             
             String token = TokenHelper.getToken(user.getId(),user.getLoginName());
             logger.info("会员:{},生成登录token:{}",req.getLoginName(),token);
             //TODO 放到缓冲中，多久失效
             
             UserDTO userDTO = new UserDTO();
             userDTO.setId(user.getId());
             userDTO.setLoginName(user.getLoginName());
             userDTO.setAuthToken(token);
             resp.setData(userDTO);
         }catch(BaseException e){
             logger.info("登录发生自定义异常,req:{}", req, e);
             resp = BaseResp.buildFailResp(e, BaseResp.class);
             
         } catch (Exception e) {
             logger.error("登录异常,req:{}", req, e);
             resp =  BaseResp.buildFailResp("登录失败", BaseResp.class);
             
         }finally{
             logger.info("会员登录返回:{},登录请求：{}",resp,req);
         }
         return resp;
	}

	/**
	 * 注册
	 */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
	public void register(UserRegisterReq req) {
		//TODO
	}  

	/**
	 * 获取用户登录信息,从token获取
	 */
	@SuppressWarnings("unchecked")
    @RequestMapping(value = "/user/getUserInfo", method = RequestMethod.POST)
	public BaseResp<UserDTO> checkUserSession(HttpServletRequest request) {
	    logger.info("获取用户登录信息开始");
	    BaseResp<UserDTO> resp = BaseResp.buildSuccessBaseResp();
	    try {
	        UserDTO u = (UserDTO)request.getAttribute("user");
	        resp.setData(u);
	        
	    }catch(BaseException e){
            logger.info("获取用户登录信息,发生自定义异常,req:{}", e);
            resp = BaseResp.buildFailResp(e, BaseResp.class);
            
        } catch (Exception e) {
            logger.error("获取用户登录信息,发生未知异常,req:{}", e);
            resp = BaseResp.buildFailResp("登录失败", BaseResp.class);
            
        }finally{
            logger.info("会员登录返回:{},登录请求：{}",resp);
        }
	    return resp;
	}
}
