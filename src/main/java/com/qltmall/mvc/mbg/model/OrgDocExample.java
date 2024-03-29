package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class OrgDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgDocExample() {
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

        public Criteria andDocNameIsNull() {
            addCriterion("doc_name is null");
            return (Criteria) this;
        }

        public Criteria andDocNameIsNotNull() {
            addCriterion("doc_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocNameEqualTo(String value) {
            addCriterion("doc_name =", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotEqualTo(String value) {
            addCriterion("doc_name <>", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameGreaterThan(String value) {
            addCriterion("doc_name >", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("doc_name >=", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLessThan(String value) {
            addCriterion("doc_name <", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLessThanOrEqualTo(String value) {
            addCriterion("doc_name <=", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLike(String value) {
            addCriterion("doc_name like", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotLike(String value) {
            addCriterion("doc_name not like", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameIn(List<String> values) {
            addCriterion("doc_name in", values, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotIn(List<String> values) {
            addCriterion("doc_name not in", values, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameBetween(String value1, String value2) {
            addCriterion("doc_name between", value1, value2, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotBetween(String value1, String value2) {
            addCriterion("doc_name not between", value1, value2, "docName");
            return (Criteria) this;
        }

        public Criteria andDocImageIsNull() {
            addCriterion("doc_image is null");
            return (Criteria) this;
        }

        public Criteria andDocImageIsNotNull() {
            addCriterion("doc_image is not null");
            return (Criteria) this;
        }

        public Criteria andDocImageEqualTo(String value) {
            addCriterion("doc_image =", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageNotEqualTo(String value) {
            addCriterion("doc_image <>", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageGreaterThan(String value) {
            addCriterion("doc_image >", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageGreaterThanOrEqualTo(String value) {
            addCriterion("doc_image >=", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageLessThan(String value) {
            addCriterion("doc_image <", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageLessThanOrEqualTo(String value) {
            addCriterion("doc_image <=", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageLike(String value) {
            addCriterion("doc_image like", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageNotLike(String value) {
            addCriterion("doc_image not like", value, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageIn(List<String> values) {
            addCriterion("doc_image in", values, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageNotIn(List<String> values) {
            addCriterion("doc_image not in", values, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageBetween(String value1, String value2) {
            addCriterion("doc_image between", value1, value2, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocImageNotBetween(String value1, String value2) {
            addCriterion("doc_image not between", value1, value2, "docImage");
            return (Criteria) this;
        }

        public Criteria andDocEduIsNull() {
            addCriterion("doc_edu is null");
            return (Criteria) this;
        }

        public Criteria andDocEduIsNotNull() {
            addCriterion("doc_edu is not null");
            return (Criteria) this;
        }

        public Criteria andDocEduEqualTo(String value) {
            addCriterion("doc_edu =", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduNotEqualTo(String value) {
            addCriterion("doc_edu <>", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduGreaterThan(String value) {
            addCriterion("doc_edu >", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduGreaterThanOrEqualTo(String value) {
            addCriterion("doc_edu >=", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduLessThan(String value) {
            addCriterion("doc_edu <", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduLessThanOrEqualTo(String value) {
            addCriterion("doc_edu <=", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduLike(String value) {
            addCriterion("doc_edu like", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduNotLike(String value) {
            addCriterion("doc_edu not like", value, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduIn(List<String> values) {
            addCriterion("doc_edu in", values, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduNotIn(List<String> values) {
            addCriterion("doc_edu not in", values, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduBetween(String value1, String value2) {
            addCriterion("doc_edu between", value1, value2, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocEduNotBetween(String value1, String value2) {
            addCriterion("doc_edu not between", value1, value2, "docEdu");
            return (Criteria) this;
        }

        public Criteria andDocDescIsNull() {
            addCriterion("doc_desc is null");
            return (Criteria) this;
        }

        public Criteria andDocDescIsNotNull() {
            addCriterion("doc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDocDescEqualTo(String value) {
            addCriterion("doc_desc =", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescNotEqualTo(String value) {
            addCriterion("doc_desc <>", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescGreaterThan(String value) {
            addCriterion("doc_desc >", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescGreaterThanOrEqualTo(String value) {
            addCriterion("doc_desc >=", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescLessThan(String value) {
            addCriterion("doc_desc <", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescLessThanOrEqualTo(String value) {
            addCriterion("doc_desc <=", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescLike(String value) {
            addCriterion("doc_desc like", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescNotLike(String value) {
            addCriterion("doc_desc not like", value, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescIn(List<String> values) {
            addCriterion("doc_desc in", values, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescNotIn(List<String> values) {
            addCriterion("doc_desc not in", values, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescBetween(String value1, String value2) {
            addCriterion("doc_desc between", value1, value2, "docDesc");
            return (Criteria) this;
        }

        public Criteria andDocDescNotBetween(String value1, String value2) {
            addCriterion("doc_desc not between", value1, value2, "docDesc");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
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