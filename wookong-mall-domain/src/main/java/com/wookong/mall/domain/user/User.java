package com.wookong.mall.domain.user;

import com.github.java.common.base.Printable;

/**
 * 会员
 * @author Administrator
 *
 */
public class User extends Printable {
	
	private static final long serialVersionUID = 1L;
	private String userName;
    private String passwd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
