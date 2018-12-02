package com.wookong.mall.common.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 商城会员
 */
@Setter
@Getter
public class UserDTO extends BaseDTO {

    private static final long serialVersionUID = 8115846911503083575L;

    private Long id;

    private String loginName;

    private String addition;
    
    private String authToken;
}
