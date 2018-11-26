package com.wookong.mall.facade.req;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;

/**
 * @author bill
 * @date 2018年5月27日 下午7:43:52
 */
@Setter
@Getter
public class SayHiReq implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6099687043566786842L;
	
	private String            name             = "scaffold";
}
