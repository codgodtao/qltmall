package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ScienceUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScienceUrlExample() {
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

        public Criteria andUrlNameIsNull() {
            addCriterion("url_name is null");
            return (Criteria) this;
        }

        public Criteria andUrlNameIsNotNull() {
            addCriterion("url_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrlNameEqualTo(String value) {
            addCriterion("url_name =", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotEqualTo(String value) {
            addCriterion("url_name <>", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameGreaterThan(String value) {
            addCriterion("url_name >", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameGreaterThanOrEqualTo(String value) {
            addCriterion("url_name >=", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameLessThan(String value) {
            addCriterion("url_name <", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameLessThanOrEqualTo(String value) {
            addCriterion("url_name <=", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameLike(String value) {
            addCriterion("url_name like", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotLike(String value) {
            addCriterion("url_name not like", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameIn(List<String> values) {
            addCriterion("url_name in", values, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotIn(List<String> values) {
            addCriterion("url_name not in", values, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameBetween(String value1, String value2) {
            addCriterion("url_name between", value1, value2, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotBetween(String value1, String value2) {
            addCriterion("url_name not between", value1, value2, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlDescIsNull() {
            addCriterion("url_desc is null");
            return (Criteria) this;
        }

        public Criteria andUrlDescIsNotNull() {
            addCriterion("url_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUrlDescEqualTo(String value) {
            addCriterion("url_desc =", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotEqualTo(String value) {
            addCriterion("url_desc <>", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescGreaterThan(String value) {
            addCriterion("url_desc >", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescGreaterThanOrEqualTo(String value) {
            addCriterion("url_desc >=", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescLessThan(String value) {
            addCriterion("url_desc <", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescLessThanOrEqualTo(String value) {
            addCriterion("url_desc <=", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescLike(String value) {
            addCriterion("url_desc like", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotLike(String value) {
            addCriterion("url_desc not like", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescIn(List<String> values) {
            addCriterion("url_desc in", values, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotIn(List<String> values) {
            addCriterion("url_desc not in", values, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescBetween(String value1, String value2) {
            addCriterion("url_desc between", value1, value2, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotBetween(String value1, String value2) {
            addCriterion("url_desc not between", value1, value2, "urlDesc");
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

        public Criteria andUrlContentIsNull() {
            addCriterion("url_content is null");
            return (Criteria) this;
        }

        public Criteria andUrlContentIsNotNull() {
            addCriterion("url_content is not null");
            return (Criteria) this;
        }

        public Criteria andUrlContentEqualTo(String value) {
            addCriterion("url_content =", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentNotEqualTo(String value) {
            addCriterion("url_content <>", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentGreaterThan(String value) {
            addCriterion("url_content >", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentGreaterThanOrEqualTo(String value) {
            addCriterion("url_content >=", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentLessThan(String value) {
            addCriterion("url_content <", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentLessThanOrEqualTo(String value) {
            addCriterion("url_content <=", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentLike(String value) {
            addCriterion("url_content like", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentNotLike(String value) {
            addCriterion("url_content not like", value, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentIn(List<String> values) {
            addCriterion("url_content in", values, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentNotIn(List<String> values) {
            addCriterion("url_content not in", values, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentBetween(String value1, String value2) {
            addCriterion("url_content between", value1, value2, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlContentNotBetween(String value1, String value2) {
            addCriterion("url_content not between", value1, value2, "urlContent");
            return (Criteria) this;
        }

        public Criteria andUrlThumbIsNull() {
            addCriterion("url_thumb is null");
            return (Criteria) this;
        }

        public Criteria andUrlThumbIsNotNull() {
            addCriterion("url_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andUrlThumbEqualTo(String value) {
            addCriterion("url_thumb =", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbNotEqualTo(String value) {
            addCriterion("url_thumb <>", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbGreaterThan(String value) {
            addCriterion("url_thumb >", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbGreaterThanOrEqualTo(String value) {
            addCriterion("url_thumb >=", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbLessThan(String value) {
            addCriterion("url_thumb <", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbLessThanOrEqualTo(String value) {
            addCriterion("url_thumb <=", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbLike(String value) {
            addCriterion("url_thumb like", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbNotLike(String value) {
            addCriterion("url_thumb not like", value, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbIn(List<String> values) {
            addCriterion("url_thumb in", values, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbNotIn(List<String> values) {
            addCriterion("url_thumb not in", values, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbBetween(String value1, String value2) {
            addCriterion("url_thumb between", value1, value2, "urlThumb");
            return (Criteria) this;
        }

        public Criteria andUrlThumbNotBetween(String value1, String value2) {
            addCriterion("url_thumb not between", value1, value2, "urlThumb");
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