package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgStartIsNull() {
            addCriterion("org_start is null");
            return (Criteria) this;
        }

        public Criteria andOrgStartIsNotNull() {
            addCriterion("org_start is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStartEqualTo(Date value) {
            addCriterionForJDBCDate("org_start =", value, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("org_start <>", value, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartGreaterThan(Date value) {
            addCriterionForJDBCDate("org_start >", value, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("org_start >=", value, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartLessThan(Date value) {
            addCriterionForJDBCDate("org_start <", value, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("org_start <=", value, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartIn(List<Date> values) {
            addCriterionForJDBCDate("org_start in", values, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("org_start not in", values, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("org_start between", value1, value2, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("org_start not between", value1, value2, "orgStart");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("org_address is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("org_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("org_address =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("org_address <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("org_address >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("org_address >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("org_address <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("org_address <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("org_address like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("org_address not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("org_address in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("org_address not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("org_address between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("org_address not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIsNull() {
            addCriterion("org_province is null");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIsNotNull() {
            addCriterion("org_province is not null");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceEqualTo(String value) {
            addCriterion("org_province =", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotEqualTo(String value) {
            addCriterion("org_province <>", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceGreaterThan(String value) {
            addCriterion("org_province >", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("org_province >=", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLessThan(String value) {
            addCriterion("org_province <", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLessThanOrEqualTo(String value) {
            addCriterion("org_province <=", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLike(String value) {
            addCriterion("org_province like", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotLike(String value) {
            addCriterion("org_province not like", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIn(List<String> values) {
            addCriterion("org_province in", values, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotIn(List<String> values) {
            addCriterion("org_province not in", values, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceBetween(String value1, String value2) {
            addCriterion("org_province between", value1, value2, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotBetween(String value1, String value2) {
            addCriterion("org_province not between", value1, value2, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgCityIsNull() {
            addCriterion("org_city is null");
            return (Criteria) this;
        }

        public Criteria andOrgCityIsNotNull() {
            addCriterion("org_city is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCityEqualTo(String value) {
            addCriterion("org_city =", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotEqualTo(String value) {
            addCriterion("org_city <>", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityGreaterThan(String value) {
            addCriterion("org_city >", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityGreaterThanOrEqualTo(String value) {
            addCriterion("org_city >=", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLessThan(String value) {
            addCriterion("org_city <", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLessThanOrEqualTo(String value) {
            addCriterion("org_city <=", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLike(String value) {
            addCriterion("org_city like", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotLike(String value) {
            addCriterion("org_city not like", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityIn(List<String> values) {
            addCriterion("org_city in", values, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotIn(List<String> values) {
            addCriterion("org_city not in", values, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityBetween(String value1, String value2) {
            addCriterion("org_city between", value1, value2, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotBetween(String value1, String value2) {
            addCriterion("org_city not between", value1, value2, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgThumbIsNull() {
            addCriterion("org_thumb is null");
            return (Criteria) this;
        }

        public Criteria andOrgThumbIsNotNull() {
            addCriterion("org_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andOrgThumbEqualTo(String value) {
            addCriterion("org_thumb =", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbNotEqualTo(String value) {
            addCriterion("org_thumb <>", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbGreaterThan(String value) {
            addCriterion("org_thumb >", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbGreaterThanOrEqualTo(String value) {
            addCriterion("org_thumb >=", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbLessThan(String value) {
            addCriterion("org_thumb <", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbLessThanOrEqualTo(String value) {
            addCriterion("org_thumb <=", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbLike(String value) {
            addCriterion("org_thumb like", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbNotLike(String value) {
            addCriterion("org_thumb not like", value, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbIn(List<String> values) {
            addCriterion("org_thumb in", values, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbNotIn(List<String> values) {
            addCriterion("org_thumb not in", values, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbBetween(String value1, String value2) {
            addCriterion("org_thumb between", value1, value2, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgThumbNotBetween(String value1, String value2) {
            addCriterion("org_thumb not between", value1, value2, "orgThumb");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoIsNull() {
            addCriterion("org_photo is null");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoIsNotNull() {
            addCriterion("org_photo is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoEqualTo(String value) {
            addCriterion("org_photo =", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotEqualTo(String value) {
            addCriterion("org_photo <>", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoGreaterThan(String value) {
            addCriterion("org_photo >", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("org_photo >=", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoLessThan(String value) {
            addCriterion("org_photo <", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoLessThanOrEqualTo(String value) {
            addCriterion("org_photo <=", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoLike(String value) {
            addCriterion("org_photo like", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotLike(String value) {
            addCriterion("org_photo not like", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoIn(List<String> values) {
            addCriterion("org_photo in", values, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotIn(List<String> values) {
            addCriterion("org_photo not in", values, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoBetween(String value1, String value2) {
            addCriterion("org_photo between", value1, value2, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotBetween(String value1, String value2) {
            addCriterion("org_photo not between", value1, value2, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Boolean value) {
            addCriterion("org_type =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Boolean value) {
            addCriterion("org_type <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Boolean value) {
            addCriterion("org_type >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("org_type >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Boolean value) {
            addCriterion("org_type <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("org_type <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Boolean> values) {
            addCriterion("org_type in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Boolean> values) {
            addCriterion("org_type not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("org_type between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("org_type not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTelIsNull() {
            addCriterion("org_tel is null");
            return (Criteria) this;
        }

        public Criteria andOrgTelIsNotNull() {
            addCriterion("org_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTelEqualTo(String value) {
            addCriterion("org_tel =", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelNotEqualTo(String value) {
            addCriterion("org_tel <>", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelGreaterThan(String value) {
            addCriterion("org_tel >", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelGreaterThanOrEqualTo(String value) {
            addCriterion("org_tel >=", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelLessThan(String value) {
            addCriterion("org_tel <", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelLessThanOrEqualTo(String value) {
            addCriterion("org_tel <=", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelLike(String value) {
            addCriterion("org_tel like", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelNotLike(String value) {
            addCriterion("org_tel not like", value, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelIn(List<String> values) {
            addCriterion("org_tel in", values, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelNotIn(List<String> values) {
            addCriterion("org_tel not in", values, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelBetween(String value1, String value2) {
            addCriterion("org_tel between", value1, value2, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgTelNotBetween(String value1, String value2) {
            addCriterion("org_tel not between", value1, value2, "orgTel");
            return (Criteria) this;
        }

        public Criteria andOrgDescIsNull() {
            addCriterion("org_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrgDescIsNotNull() {
            addCriterion("org_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDescEqualTo(String value) {
            addCriterion("org_desc =", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotEqualTo(String value) {
            addCriterion("org_desc <>", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescGreaterThan(String value) {
            addCriterion("org_desc >", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescGreaterThanOrEqualTo(String value) {
            addCriterion("org_desc >=", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescLessThan(String value) {
            addCriterion("org_desc <", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescLessThanOrEqualTo(String value) {
            addCriterion("org_desc <=", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescLike(String value) {
            addCriterion("org_desc like", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotLike(String value) {
            addCriterion("org_desc not like", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescIn(List<String> values) {
            addCriterion("org_desc in", values, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotIn(List<String> values) {
            addCriterion("org_desc not in", values, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescBetween(String value1, String value2) {
            addCriterion("org_desc between", value1, value2, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotBetween(String value1, String value2) {
            addCriterion("org_desc not between", value1, value2, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgPriceIsNull() {
            addCriterion("org_price is null");
            return (Criteria) this;
        }

        public Criteria andOrgPriceIsNotNull() {
            addCriterion("org_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPriceEqualTo(String value) {
            addCriterion("org_price =", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceNotEqualTo(String value) {
            addCriterion("org_price <>", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceGreaterThan(String value) {
            addCriterion("org_price >", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceGreaterThanOrEqualTo(String value) {
            addCriterion("org_price >=", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceLessThan(String value) {
            addCriterion("org_price <", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceLessThanOrEqualTo(String value) {
            addCriterion("org_price <=", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceLike(String value) {
            addCriterion("org_price like", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceNotLike(String value) {
            addCriterion("org_price not like", value, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceIn(List<String> values) {
            addCriterion("org_price in", values, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceNotIn(List<String> values) {
            addCriterion("org_price not in", values, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceBetween(String value1, String value2) {
            addCriterion("org_price between", value1, value2, "orgPrice");
            return (Criteria) this;
        }

        public Criteria andOrgPriceNotBetween(String value1, String value2) {
            addCriterion("org_price not between", value1, value2, "orgPrice");
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