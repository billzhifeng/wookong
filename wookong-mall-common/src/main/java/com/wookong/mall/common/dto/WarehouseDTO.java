package com.wookong.mall.common.dto;

import java.util.Date;
/**
 * 仓库
 * @author bill
 *
 */
public class WarehouseDTO {
    private Long id;

    private String name;

    private Long locatedCountryId;

    private String locatedCountry;

    private String locatedCountryCode;

    private String mobile;

    private String header;

    private String locatedAddress;

    private String addition;

    private String operator;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getLocatedCountryId() {
        return locatedCountryId;
    }

    public void setLocatedCountryId(Long locatedCountryId) {
        this.locatedCountryId = locatedCountryId;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry == null ? null : locatedCountry.trim();
    }

    public String getLocatedCountryCode() {
        return locatedCountryCode;
    }

    public void setLocatedCountryCode(String locatedCountryCode) {
        this.locatedCountryCode = locatedCountryCode == null ? null : locatedCountryCode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getLocatedAddress() {
        return locatedAddress;
    }

    public void setLocatedAddress(String locatedAddress) {
        this.locatedAddress = locatedAddress == null ? null : locatedAddress.trim();
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition == null ? null : addition.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

}