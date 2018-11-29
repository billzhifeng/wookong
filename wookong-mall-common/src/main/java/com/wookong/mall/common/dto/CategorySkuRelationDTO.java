package com.wookong.mall.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategorySkuRelationDTO {
    private Long id;

    private Long skuId;

    private Long categoryId;
}
