package com.wookong.mall.dal.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseDOExample {
    protected String orderByClause;

    protected Integer offSet;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseDOExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdIsNull() {
            addCriterion("located_country_id is null");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdIsNotNull() {
            addCriterion("located_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdEqualTo(Long value) {
            addCriterion("located_country_id =", value, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdNotEqualTo(Long value) {
            addCriterion("located_country_id <>", value, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdGreaterThan(Long value) {
            addCriterion("located_country_id >", value, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("located_country_id >=", value, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdLessThan(Long value) {
            addCriterion("located_country_id <", value, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("located_country_id <=", value, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdIn(List<Long> values) {
            addCriterion("located_country_id in", values, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdNotIn(List<Long> values) {
            addCriterion("located_country_id not in", values, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdBetween(Long value1, Long value2) {
            addCriterion("located_country_id between", value1, value2, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("located_country_id not between", value1, value2, "locatedCountryId");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIsNull() {
            addCriterion("located_country is null");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIsNotNull() {
            addCriterion("located_country is not null");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryEqualTo(String value) {
            addCriterion("located_country =", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryNotEqualTo(String value) {
            addCriterion("located_country <>", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryGreaterThan(String value) {
            addCriterion("located_country >", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryGreaterThanOrEqualTo(String value) {
            addCriterion("located_country >=", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryLessThan(String value) {
            addCriterion("located_country <", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryLessThanOrEqualTo(String value) {
            addCriterion("located_country <=", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryLike(String value) {
            addCriterion("located_country like", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryNotLike(String value) {
            addCriterion("located_country not like", value, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryIn(List<String> values) {
            addCriterion("located_country in", values, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryNotIn(List<String> values) {
            addCriterion("located_country not in", values, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryBetween(String value1, String value2) {
            addCriterion("located_country between", value1, value2, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryNotBetween(String value1, String value2) {
            addCriterion("located_country not between", value1, value2, "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeIsNull() {
            addCriterion("located_country_code is null");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeIsNotNull() {
            addCriterion("located_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeEqualTo(String value) {
            addCriterion("located_country_code =", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeNotEqualTo(String value) {
            addCriterion("located_country_code <>", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeGreaterThan(String value) {
            addCriterion("located_country_code >", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("located_country_code >=", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeLessThan(String value) {
            addCriterion("located_country_code <", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("located_country_code <=", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeLike(String value) {
            addCriterion("located_country_code like", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeNotLike(String value) {
            addCriterion("located_country_code not like", value, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeIn(List<String> values) {
            addCriterion("located_country_code in", values, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeNotIn(List<String> values) {
            addCriterion("located_country_code not in", values, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeBetween(String value1, String value2) {
            addCriterion("located_country_code between", value1, value2, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeNotBetween(String value1, String value2) {
            addCriterion("located_country_code not between", value1, value2, "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNull() {
            addCriterion("header is null");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNotNull() {
            addCriterion("header is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderEqualTo(String value) {
            addCriterion("header =", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotEqualTo(String value) {
            addCriterion("header <>", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThan(String value) {
            addCriterion("header >", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("header >=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThan(String value) {
            addCriterion("header <", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThanOrEqualTo(String value) {
            addCriterion("header <=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLike(String value) {
            addCriterion("header like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotLike(String value) {
            addCriterion("header not like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderIn(List<String> values) {
            addCriterion("header in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotIn(List<String> values) {
            addCriterion("header not in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderBetween(String value1, String value2) {
            addCriterion("header between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotBetween(String value1, String value2) {
            addCriterion("header not between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressIsNull() {
            addCriterion("located_address is null");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressIsNotNull() {
            addCriterion("located_address is not null");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressEqualTo(String value) {
            addCriterion("located_address =", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressNotEqualTo(String value) {
            addCriterion("located_address <>", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressGreaterThan(String value) {
            addCriterion("located_address >", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("located_address >=", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressLessThan(String value) {
            addCriterion("located_address <", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressLessThanOrEqualTo(String value) {
            addCriterion("located_address <=", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressLike(String value) {
            addCriterion("located_address like", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressNotLike(String value) {
            addCriterion("located_address not like", value, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressIn(List<String> values) {
            addCriterion("located_address in", values, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressNotIn(List<String> values) {
            addCriterion("located_address not in", values, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressBetween(String value1, String value2) {
            addCriterion("located_address between", value1, value2, "locatedAddress");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressNotBetween(String value1, String value2) {
            addCriterion("located_address not between", value1, value2, "locatedAddress");
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

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryLikeInsensitive(String value) {
            addCriterion("upper(located_country) like", value.toUpperCase(), "locatedCountry");
            return (Criteria) this;
        }

        public Criteria andLocatedCountryCodeLikeInsensitive(String value) {
            addCriterion("upper(located_country_code) like", value.toUpperCase(), "locatedCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andHeaderLikeInsensitive(String value) {
            addCriterion("upper(header) like", value.toUpperCase(), "header");
            return (Criteria) this;
        }

        public Criteria andLocatedAddressLikeInsensitive(String value) {
            addCriterion("upper(located_address) like", value.toUpperCase(), "locatedAddress");
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