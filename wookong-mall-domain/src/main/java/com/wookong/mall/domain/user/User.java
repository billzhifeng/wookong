package com.wookong.mall.domain.user;

import java.util.Date;

import com.github.java.common.base.Printable;

import lombok.Getter;
import lombok.Setter;

/**
 * 会员
 * 
 * @author Administrator
 */
@Setter
@Getter
public class User extends Printable {

    private static final long serialVersionUID = 1L;
    private Long              id;

    private String            loginName;

    private String            password;

    private Date              redisterTime;

    private String            addition;

    private String            operator;

    private Date              createdTime;

    private Date              updatedTime;

    private String            deleted;
}
