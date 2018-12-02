package com.wookong.mall.domain.user;

import org.springframework.stereotype.Service;
/**
 * 会员
 * @author Administrator
 *
 */
@Service
public class UserRepository {

	/**
	 * 查询会员根据登录会员名称
	 * @param userName
	 * @return
	 */
	public User loadByLoginName(String userName) {
	    User u = new User();
	    u.setId(999888L);
	    u.setLoginName("billzhifeng");
	    u.setPassword("123456");
		return u;
	}
}
