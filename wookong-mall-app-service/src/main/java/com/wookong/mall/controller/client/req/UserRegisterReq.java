package com.wookong.mall.controller.client.req;


import com.wookong.mall.common.dto.BaseDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bill
 * @date 2018年12月2日 下午4:55:52
 */
@Setter
@Getter
public class UserRegisterReq extends BaseDTO {

    private static final long serialVersionUID = -3496528676849125159L;
    private String loginName;
    private String passwd;

}
