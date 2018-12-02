package com.wookong.mall.common.enums;

import com.github.java.common.base.BaseEnum;

/**
 * @author bill
 * @date 2018年12月1日 下午10:38:03
 */
public enum ReturnCode implements BaseEnum {
    DATA_NOT_EXIST(100, "数据不存在"),
    
    DB_ERROR(102, "DB异常"),
    
    PARAM_ILLEGLE(103, "参数异常"),
    
    NOT_LOGIN(104, "未登录"),
    
    NO_AUTH(403, "无权限"),
    
    SYSTEM_ERROR(999,"系统异常"),;
    ReturnCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int    code;
    private String desc;

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return null;
    }

}
