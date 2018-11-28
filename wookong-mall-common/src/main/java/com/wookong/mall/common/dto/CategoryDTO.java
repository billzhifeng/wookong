package com.wookong.mall.common.dto;

import java.io.Serializable;

import com.github.java.common.base.Printable;

import lombok.Getter;
import lombok.Setter;

/**
 * sku 分类
 * @author Administrator
 *
 */
@Getter
@Setter
public class CategoryDTO extends Printable implements Serializable{

    private static final long serialVersionUID = 631231073089624359L;

    private Long id;

    private String displayNameCn;

    private String displayNameEn;

    private Integer level;

    private Long parentId;

    private String addition;

    private String operator;

    private String visable;

}
