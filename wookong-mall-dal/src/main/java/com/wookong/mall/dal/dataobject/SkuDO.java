package com.wookong.mall.dal.dataobject;

import java.util.Date;

public class SkuDO {
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

    private String visable;

    private Date createdTime;

    private Date updatedTime;

    private String deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getSimpleIntroduce() {
        return simpleIntroduce;
    }

    public void setSimpleIntroduce(String simpleIntroduce) {
        this.simpleIntroduce = simpleIntroduce == null ? null : simpleIntroduce.trim();
    }

    public String getHeadUrlImgs() {
        return headUrlImgs;
    }

    public void setHeadUrlImgs(String headUrlImgs) {
        this.headUrlImgs = headUrlImgs == null ? null : headUrlImgs.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getBodyUrlImgs() {
        return bodyUrlImgs;
    }

    public void setBodyUrlImgs(String bodyUrlImgs) {
        this.bodyUrlImgs = bodyUrlImgs == null ? null : bodyUrlImgs.trim();
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public Long getOriAmount() {
        return oriAmount;
    }

    public void setOriAmount(Long oriAmount) {
        this.oriAmount = oriAmount;
    }

    public Long getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Long saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus == null ? null : saleStatus.trim();
    }

    public String getSaleMode() {
        return saleMode;
    }

    public void setSaleMode(String saleMode) {
        this.saleMode = saleMode == null ? null : saleMode.trim();
    }

    public Long getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(Long reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    public Long getTailAmount() {
        return tailAmount;
    }

    public void setTailAmount(Long tailAmount) {
        this.tailAmount = tailAmount;
    }

    public Date getReserveStartTime() {
        return reserveStartTime;
    }

    public void setReserveStartTime(Date reserveStartTime) {
        this.reserveStartTime = reserveStartTime;
    }

    public Date getReserveEndTime() {
        return reserveEndTime;
    }

    public void setReserveEndTime(Date reserveEndTime) {
        this.reserveEndTime = reserveEndTime;
    }

    public Date getPayTailStartTime() {
        return payTailStartTime;
    }

    public void setPayTailStartTime(Date payTailStartTime) {
        this.payTailStartTime = payTailStartTime;
    }

    public Date getPayTailEndTime() {
        return payTailEndTime;
    }

    public void setPayTailEndTime(Date payTailEndTime) {
        this.payTailEndTime = payTailEndTime;
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

    public String getVisable() {
        return visable;
    }

    public void setVisable(String visable) {
        this.visable = visable == null ? null : visable.trim();
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

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}