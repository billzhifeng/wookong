package com.wookong.mall.common.dto;

import java.io.Serializable;
import java.util.Date;

import com.github.java.common.base.Printable;

import lombok.Getter;
import lombok.Setter;

/**
 * 收货地址
 * @author Administrator
 */
@Getter
@Setter
public class UserReciveAddressDTO extends Printable implements Serializable{

	 private Long id;

	    private String userId;

	    private String receverName;

	    private String mobile;

	    private String country;

	    private String countryCode;

	    private String provice;

	    private String provinceCode;

	    private String homeAddress;

	    private String defaultAddress;

	    private String addition;

	    private String operator;

	    private Date createdTime;

	    private Date updatedTime;

	    private String deleted;
}
