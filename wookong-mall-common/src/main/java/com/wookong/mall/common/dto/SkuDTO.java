package com.wookong.mall.common.dto;

import java.io.Serializable;
import java.util.Date;

import com.github.java.common.base.Printable;

import lombok.Getter;
import lombok.Setter;

/**
 * sku信息
 * @author Administrator
 */
@Getter
@Setter
public class SkuDTO extends Printable implements Serializable{

    private static final long serialVersionUID = -6485150297101121024L;

    private Long id;

    private String language;

    private String displayName;

    private String simpleIntroduce;

    private String headUrlImgs;

    private String description;

    private String bodyUrlImgs;

    private String currencyType;

    private Long oriAmount;

    private Long saleAmount;

    private String saleStatus;

    private String saleMode;

    private Long reserveAmount;

    private Long tailAmount;

    private Date reserveStartTime;

    private Date reserveEndTime;

    private Date payTailStartTime;

    private Date payTailEndTime;

    private String addition;

    private String operator;

    private Date createdTime;

    private Date updatedTime;

    private String deleted;


}
