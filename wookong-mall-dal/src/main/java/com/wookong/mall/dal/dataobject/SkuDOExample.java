package com.wookong.mall.dal.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkuDOExample {
    protected String orderByClause;

    protected Integer offSet;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkuDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOffSet(Integer offSet) {
        this.offSet = offSet;
    }

    public Integer getOffSet() {
        return offSet;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
         return length;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceIsNull() {
            addCriterion("simple_introduce is null");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceIsNotNull() {
            addCriterion("simple_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceEqualTo(String value) {
            addCriterion("simple_introduce =", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceNotEqualTo(String value) {
            addCriterion("simple_introduce <>", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceGreaterThan(String value) {
            addCriterion("simple_introduce >", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("simple_introduce >=", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceLessThan(String value) {
            addCriterion("simple_introduce <", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceLessThanOrEqualTo(String value) {
            addCriterion("simple_introduce <=", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceLike(String value) {
            addCriterion("simple_introduce like", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceNotLike(String value) {
            addCriterion("simple_introduce not like", value, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceIn(List<String> values) {
            addCriterion("simple_introduce in", values, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceNotIn(List<String> values) {
            addCriterion("simple_introduce not in", values, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceBetween(String value1, String value2) {
            addCriterion("simple_introduce between", value1, value2, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceNotBetween(String value1, String value2) {
            addCriterion("simple_introduce not between", value1, value2, "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsIsNull() {
            addCriterion("head_url_imgs is null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsIsNotNull() {
            addCriterion("head_url_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsEqualTo(String value) {
            addCriterion("head_url_imgs =", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsNotEqualTo(String value) {
            addCriterion("head_url_imgs <>", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsGreaterThan(String value) {
            addCriterion("head_url_imgs >", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsGreaterThanOrEqualTo(String value) {
            addCriterion("head_url_imgs >=", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsLessThan(String value) {
            addCriterion("head_url_imgs <", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsLessThanOrEqualTo(String value) {
            addCriterion("head_url_imgs <=", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsLike(String value) {
            addCriterion("head_url_imgs like", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsNotLike(String value) {
            addCriterion("head_url_imgs not like", value, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsIn(List<String> values) {
            addCriterion("head_url_imgs in", values, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsNotIn(List<String> values) {
            addCriterion("head_url_imgs not in", values, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsBetween(String value1, String value2) {
            addCriterion("head_url_imgs between", value1, value2, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsNotBetween(String value1, String value2) {
            addCriterion("head_url_imgs not between", value1, value2, "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsIsNull() {
            addCriterion("body_url_imgs is null");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsIsNotNull() {
            addCriterion("body_url_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsEqualTo(String value) {
            addCriterion("body_url_imgs =", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsNotEqualTo(String value) {
            addCriterion("body_url_imgs <>", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsGreaterThan(String value) {
            addCriterion("body_url_imgs >", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsGreaterThanOrEqualTo(String value) {
            addCriterion("body_url_imgs >=", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsLessThan(String value) {
            addCriterion("body_url_imgs <", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsLessThanOrEqualTo(String value) {
            addCriterion("body_url_imgs <=", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsLike(String value) {
            addCriterion("body_url_imgs like", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsNotLike(String value) {
            addCriterion("body_url_imgs not like", value, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsIn(List<String> values) {
            addCriterion("body_url_imgs in", values, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsNotIn(List<String> values) {
            addCriterion("body_url_imgs not in", values, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsBetween(String value1, String value2) {
            addCriterion("body_url_imgs between", value1, value2, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsNotBetween(String value1, String value2) {
            addCriterion("body_url_imgs not between", value1, value2, "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNull() {
            addCriterion("currency_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNotNull() {
            addCriterion("currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeEqualTo(String value) {
            addCriterion("currency_type =", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotEqualTo(String value) {
            addCriterion("currency_type <>", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThan(String value) {
            addCriterion("currency_type >", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_type >=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThan(String value) {
            addCriterion("currency_type <", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("currency_type <=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLike(String value) {
            addCriterion("currency_type like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotLike(String value) {
            addCriterion("currency_type not like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIn(List<String> values) {
            addCriterion("currency_type in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotIn(List<String> values) {
            addCriterion("currency_type not in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeBetween(String value1, String value2) {
            addCriterion("currency_type between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("currency_type not between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andOriAmountIsNull() {
            addCriterion("ori_amount is null");
            return (Criteria) this;
        }

        public Criteria andOriAmountIsNotNull() {
            addCriterion("ori_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOriAmountEqualTo(Long value) {
            addCriterion("ori_amount =", value, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountNotEqualTo(Long value) {
            addCriterion("ori_amount <>", value, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountGreaterThan(Long value) {
            addCriterion("ori_amount >", value, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("ori_amount >=", value, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountLessThan(Long value) {
            addCriterion("ori_amount <", value, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountLessThanOrEqualTo(Long value) {
            addCriterion("ori_amount <=", value, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountIn(List<Long> values) {
            addCriterion("ori_amount in", values, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountNotIn(List<Long> values) {
            addCriterion("ori_amount not in", values, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountBetween(Long value1, Long value2) {
            addCriterion("ori_amount between", value1, value2, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andOriAmountNotBetween(Long value1, Long value2) {
            addCriterion("ori_amount not between", value1, value2, "oriAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(Long value) {
            addCriterion("sale_amount =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(Long value) {
            addCriterion("sale_amount <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(Long value) {
            addCriterion("sale_amount >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_amount >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(Long value) {
            addCriterion("sale_amount <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(Long value) {
            addCriterion("sale_amount <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<Long> values) {
            addCriterion("sale_amount in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<Long> values) {
            addCriterion("sale_amount not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(Long value1, Long value2) {
            addCriterion("sale_amount between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(Long value1, Long value2) {
            addCriterion("sale_amount not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(String value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(String value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(String value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(String value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(String value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLike(String value) {
            addCriterion("sale_status like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotLike(String value) {
            addCriterion("sale_status not like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<String> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<String> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(String value1, String value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(String value1, String value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleModeIsNull() {
            addCriterion("sale_mode is null");
            return (Criteria) this;
        }

        public Criteria andSaleModeIsNotNull() {
            addCriterion("sale_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSaleModeEqualTo(String value) {
            addCriterion("sale_mode =", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeNotEqualTo(String value) {
            addCriterion("sale_mode <>", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeGreaterThan(String value) {
            addCriterion("sale_mode >", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_mode >=", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeLessThan(String value) {
            addCriterion("sale_mode <", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeLessThanOrEqualTo(String value) {
            addCriterion("sale_mode <=", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeLike(String value) {
            addCriterion("sale_mode like", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeNotLike(String value) {
            addCriterion("sale_mode not like", value, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeIn(List<String> values) {
            addCriterion("sale_mode in", values, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeNotIn(List<String> values) {
            addCriterion("sale_mode not in", values, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeBetween(String value1, String value2) {
            addCriterion("sale_mode between", value1, value2, "saleMode");
            return (Criteria) this;
        }

        public Criteria andSaleModeNotBetween(String value1, String value2) {
            addCriterion("sale_mode not between", value1, value2, "saleMode");
            return (Criteria) this;
        }

        public Criteria andReserveAmountIsNull() {
            addCriterion("reserve_amount is null");
            return (Criteria) this;
        }

        public Criteria andReserveAmountIsNotNull() {
            addCriterion("reserve_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReserveAmountEqualTo(Long value) {
            addCriterion("reserve_amount =", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountNotEqualTo(Long value) {
            addCriterion("reserve_amount <>", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountGreaterThan(Long value) {
            addCriterion("reserve_amount >", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("reserve_amount >=", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountLessThan(Long value) {
            addCriterion("reserve_amount <", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountLessThanOrEqualTo(Long value) {
            addCriterion("reserve_amount <=", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountIn(List<Long> values) {
            addCriterion("reserve_amount in", values, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountNotIn(List<Long> values) {
            addCriterion("reserve_amount not in", values, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountBetween(Long value1, Long value2) {
            addCriterion("reserve_amount between", value1, value2, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountNotBetween(Long value1, Long value2) {
            addCriterion("reserve_amount not between", value1, value2, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountIsNull() {
            addCriterion("tail_amount is null");
            return (Criteria) this;
        }

        public Criteria andTailAmountIsNotNull() {
            addCriterion("tail_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTailAmountEqualTo(Long value) {
            addCriterion("tail_amount =", value, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountNotEqualTo(Long value) {
            addCriterion("tail_amount <>", value, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountGreaterThan(Long value) {
            addCriterion("tail_amount >", value, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("tail_amount >=", value, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountLessThan(Long value) {
            addCriterion("tail_amount <", value, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountLessThanOrEqualTo(Long value) {
            addCriterion("tail_amount <=", value, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountIn(List<Long> values) {
            addCriterion("tail_amount in", values, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountNotIn(List<Long> values) {
            addCriterion("tail_amount not in", values, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountBetween(Long value1, Long value2) {
            addCriterion("tail_amount between", value1, value2, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andTailAmountNotBetween(Long value1, Long value2) {
            addCriterion("tail_amount not between", value1, value2, "tailAmount");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeIsNull() {
            addCriterion("reserve_start_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeIsNotNull() {
            addCriterion("reserve_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeEqualTo(Date value) {
            addCriterion("reserve_start_time =", value, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeNotEqualTo(Date value) {
            addCriterion("reserve_start_time <>", value, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeGreaterThan(Date value) {
            addCriterion("reserve_start_time >", value, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reserve_start_time >=", value, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeLessThan(Date value) {
            addCriterion("reserve_start_time <", value, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("reserve_start_time <=", value, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeIn(List<Date> values) {
            addCriterion("reserve_start_time in", values, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeNotIn(List<Date> values) {
            addCriterion("reserve_start_time not in", values, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeBetween(Date value1, Date value2) {
            addCriterion("reserve_start_time between", value1, value2, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("reserve_start_time not between", value1, value2, "reserveStartTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeIsNull() {
            addCriterion("reserve_end_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeIsNotNull() {
            addCriterion("reserve_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeEqualTo(Date value) {
            addCriterion("reserve_end_time =", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeNotEqualTo(Date value) {
            addCriterion("reserve_end_time <>", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeGreaterThan(Date value) {
            addCriterion("reserve_end_time >", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reserve_end_time >=", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeLessThan(Date value) {
            addCriterion("reserve_end_time <", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("reserve_end_time <=", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeIn(List<Date> values) {
            addCriterion("reserve_end_time in", values, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeNotIn(List<Date> values) {
            addCriterion("reserve_end_time not in", values, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeBetween(Date value1, Date value2) {
            addCriterion("reserve_end_time between", value1, value2, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("reserve_end_time not between", value1, value2, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeIsNull() {
            addCriterion("pay_tail_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeIsNotNull() {
            addCriterion("pay_tail_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeEqualTo(Date value) {
            addCriterion("pay_tail_start_time =", value, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeNotEqualTo(Date value) {
            addCriterion("pay_tail_start_time <>", value, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeGreaterThan(Date value) {
            addCriterion("pay_tail_start_time >", value, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_tail_start_time >=", value, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeLessThan(Date value) {
            addCriterion("pay_tail_start_time <", value, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_tail_start_time <=", value, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeIn(List<Date> values) {
            addCriterion("pay_tail_start_time in", values, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeNotIn(List<Date> values) {
            addCriterion("pay_tail_start_time not in", values, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeBetween(Date value1, Date value2) {
            addCriterion("pay_tail_start_time between", value1, value2, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_tail_start_time not between", value1, value2, "payTailStartTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeIsNull() {
            addCriterion("pay_tail_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeIsNotNull() {
            addCriterion("pay_tail_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeEqualTo(Date value) {
            addCriterion("pay_tail_end_time =", value, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeNotEqualTo(Date value) {
            addCriterion("pay_tail_end_time <>", value, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeGreaterThan(Date value) {
            addCriterion("pay_tail_end_time >", value, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_tail_end_time >=", value, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeLessThan(Date value) {
            addCriterion("pay_tail_end_time <", value, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_tail_end_time <=", value, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeIn(List<Date> values) {
            addCriterion("pay_tail_end_time in", values, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeNotIn(List<Date> values) {
            addCriterion("pay_tail_end_time not in", values, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeBetween(Date value1, Date value2) {
            addCriterion("pay_tail_end_time between", value1, value2, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andPayTailEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_tail_end_time not between", value1, value2, "payTailEndTime");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNull() {
            addCriterion("addition is null");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNotNull() {
            addCriterion("addition is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionEqualTo(String value) {
            addCriterion("addition =", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotEqualTo(String value) {
            addCriterion("addition <>", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThan(String value) {
            addCriterion("addition >", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThanOrEqualTo(String value) {
            addCriterion("addition >=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThan(String value) {
            addCriterion("addition <", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThanOrEqualTo(String value) {
            addCriterion("addition <=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLike(String value) {
            addCriterion("addition like", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotLike(String value) {
            addCriterion("addition not like", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionIn(List<String> values) {
            addCriterion("addition in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotIn(List<String> values) {
            addCriterion("addition not in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionBetween(String value1, String value2) {
            addCriterion("addition between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotBetween(String value1, String value2) {
            addCriterion("addition not between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andLanguageLikeInsensitive(String value) {
            addCriterion("upper(language) like", value.toUpperCase(), "language");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLikeInsensitive(String value) {
            addCriterion("upper(display_name) like", value.toUpperCase(), "displayName");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroduceLikeInsensitive(String value) {
            addCriterion("upper(simple_introduce) like", value.toUpperCase(), "simpleIntroduce");
            return (Criteria) this;
        }

        public Criteria andHeadUrlImgsLikeInsensitive(String value) {
            addCriterion("upper(head_url_imgs) like", value.toUpperCase(), "headUrlImgs");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andBodyUrlImgsLikeInsensitive(String value) {
            addCriterion("upper(body_url_imgs) like", value.toUpperCase(), "bodyUrlImgs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLikeInsensitive(String value) {
            addCriterion("upper(currency_type) like", value.toUpperCase(), "currencyType");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLikeInsensitive(String value) {
            addCriterion("upper(sale_status) like", value.toUpperCase(), "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleModeLikeInsensitive(String value) {
            addCriterion("upper(sale_mode) like", value.toUpperCase(), "saleMode");
            return (Criteria) this;
        }

        public Criteria andAdditionLikeInsensitive(String value) {
            addCriterion("upper(addition) like", value.toUpperCase(), "addition");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(operator) like", value.toUpperCase(), "operator");
            return (Criteria) this;
        }

        public Criteria andDeletedLikeInsensitive(String value) {
            addCriterion("upper(deleted) like", value.toUpperCase(), "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}