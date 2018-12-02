package com.wookong.mall.controller.client.req;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import com.github.java.common.base.Printable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bill
 * @date 2018年12月2日 下午4:55:52
 */
@Setter
@Getter
public class LoginReq extends Printable implements Serializable {

	private static final long serialVersionUID = -8713759835176313628L;
	private String loginName;
	
    private String passwd;

}
