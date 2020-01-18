package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ThreeHairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreeHairExample() {
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbIsNull() {
            addCriterion("three_hair_thumb is null");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbIsNotNull() {
            addCriterion("three_hair_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbEqualTo(String value) {
            addCriterion("three_hair_thumb =", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbNotEqualTo(String value) {
            addCriterion("three_hair_thumb <>", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbGreaterThan(String value) {
            addCriterion("three_hair_thumb >", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbGreaterThanOrEqualTo(String value) {
            addCriterion("three_hair_thumb >=", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbLessThan(String value) {
            addCriterion("three_hair_thumb <", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbLessThanOrEqualTo(String value) {
            addCriterion("three_hair_thumb <=", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbLike(String value) {
            addCriterion("three_hair_thumb like", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbNotLike(String value) {
            addCriterion("three_hair_thumb not like", value, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbIn(List<String> values) {
            addCriterion("three_hair_thumb in", values, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbNotIn(List<String> values) {
            addCriterion("three_hair_thumb not in", values, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbBetween(String value1, String value2) {
            addCriterion("three_hair_thumb between", value1, value2, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairThumbNotBetween(String value1, String value2) {
            addCriterion("three_hair_thumb not between", value1, value2, "threeHairThumb");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlIsNull() {
            addCriterion("three_hair_url is null");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlIsNotNull() {
            addCriterion("three_hair_url is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlEqualTo(String value) {
            addCriterion("three_hair_url =", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlNotEqualTo(String value) {
            addCriterion("three_hair_url <>", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlGreaterThan(String value) {
            addCriterion("three_hair_url >", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlGreaterThanOrEqualTo(String value) {
            addCriterion("three_hair_url >=", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlLessThan(String value) {
            addCriterion("three_hair_url <", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlLessThanOrEqualTo(String value) {
            addCriterion("three_hair_url <=", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlLike(String value) {
            addCriterion("three_hair_url like", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlNotLike(String value) {
            addCriterion("three_hair_url not like", value, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlIn(List<String> values) {
            addCriterion("three_hair_url in", values, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlNotIn(List<String> values) {
            addCriterion("three_hair_url not in", values, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlBetween(String value1, String value2) {
            addCriterion("three_hair_url between", value1, value2, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairUrlNotBetween(String value1, String value2) {
            addCriterion("three_hair_url not between", value1, value2, "threeHairUrl");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameIsNull() {
            addCriterion("three_hair_name is null");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameIsNotNull() {
            addCriterion("three_hair_name is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameEqualTo(String value) {
            addCriterion("three_hair_name =", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameNotEqualTo(String value) {
            addCriterion("three_hair_name <>", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameGreaterThan(String value) {
            addCriterion("three_hair_name >", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameGreaterThanOrEqualTo(String value) {
            addCriterion("three_hair_name >=", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameLessThan(String value) {
            addCriterion("three_hair_name <", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameLessThanOrEqualTo(String value) {
            addCriterion("three_hair_name <=", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameLike(String value) {
            addCriterion("three_hair_name like", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameNotLike(String value) {
            addCriterion("three_hair_name not like", value, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameIn(List<String> values) {
            addCriterion("three_hair_name in", values, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameNotIn(List<String> values) {
            addCriterion("three_hair_name not in", values, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameBetween(String value1, String value2) {
            addCriterion("three_hair_name between", value1, value2, "threeHairName");
            return (Criteria) this;
        }

        public Criteria andThreeHairNameNotBetween(String value1, String value2) {
            addCriterion("three_hair_name not between", value1, value2, "threeHairName");
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