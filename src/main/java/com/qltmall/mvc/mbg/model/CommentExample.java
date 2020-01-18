package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andComTypeIsNull() {
            addCriterion("com_type is null");
            return (Criteria) this;
        }

        public Criteria andComTypeIsNotNull() {
            addCriterion("com_type is not null");
            return (Criteria) this;
        }

        public Criteria andComTypeEqualTo(Boolean value) {
            addCriterion("com_type =", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotEqualTo(Boolean value) {
            addCriterion("com_type <>", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeGreaterThan(Boolean value) {
            addCriterion("com_type >", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("com_type >=", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeLessThan(Boolean value) {
            addCriterion("com_type <", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("com_type <=", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeIn(List<Boolean> values) {
            addCriterion("com_type in", values, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotIn(List<Boolean> values) {
            addCriterion("com_type not in", values, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("com_type between", value1, value2, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("com_type not between", value1, value2, "comType");
            return (Criteria) this;
        }

        public Criteria andIdValueIsNull() {
            addCriterion("id_value is null");
            return (Criteria) this;
        }

        public Criteria andIdValueIsNotNull() {
            addCriterion("id_value is not null");
            return (Criteria) this;
        }

        public Criteria andIdValueEqualTo(Integer value) {
            addCriterion("id_value =", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotEqualTo(Integer value) {
            addCriterion("id_value <>", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueGreaterThan(Integer value) {
            addCriterion("id_value >", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_value >=", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLessThan(Integer value) {
            addCriterion("id_value <", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLessThanOrEqualTo(Integer value) {
            addCriterion("id_value <=", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueIn(List<Integer> values) {
            addCriterion("id_value in", values, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotIn(List<Integer> values) {
            addCriterion("id_value not in", values, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueBetween(Integer value1, Integer value2) {
            addCriterion("id_value between", value1, value2, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotBetween(Integer value1, Integer value2) {
            addCriterion("id_value not between", value1, value2, "idValue");
            return (Criteria) this;
        }

        public Criteria andConGradeIsNull() {
            addCriterion("con_grade is null");
            return (Criteria) this;
        }

        public Criteria andConGradeIsNotNull() {
            addCriterion("con_grade is not null");
            return (Criteria) this;
        }

        public Criteria andConGradeEqualTo(Boolean value) {
            addCriterion("con_grade =", value, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeNotEqualTo(Boolean value) {
            addCriterion("con_grade <>", value, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeGreaterThan(Boolean value) {
            addCriterion("con_grade >", value, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("con_grade >=", value, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeLessThan(Boolean value) {
            addCriterion("con_grade <", value, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeLessThanOrEqualTo(Boolean value) {
            addCriterion("con_grade <=", value, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeIn(List<Boolean> values) {
            addCriterion("con_grade in", values, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeNotIn(List<Boolean> values) {
            addCriterion("con_grade not in", values, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeBetween(Boolean value1, Boolean value2) {
            addCriterion("con_grade between", value1, value2, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConGradeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("con_grade not between", value1, value2, "conGrade");
            return (Criteria) this;
        }

        public Criteria andConDescIsNull() {
            addCriterion("con_desc is null");
            return (Criteria) this;
        }

        public Criteria andConDescIsNotNull() {
            addCriterion("con_desc is not null");
            return (Criteria) this;
        }

        public Criteria andConDescEqualTo(String value) {
            addCriterion("con_desc =", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescNotEqualTo(String value) {
            addCriterion("con_desc <>", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescGreaterThan(String value) {
            addCriterion("con_desc >", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescGreaterThanOrEqualTo(String value) {
            addCriterion("con_desc >=", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescLessThan(String value) {
            addCriterion("con_desc <", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescLessThanOrEqualTo(String value) {
            addCriterion("con_desc <=", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescLike(String value) {
            addCriterion("con_desc like", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescNotLike(String value) {
            addCriterion("con_desc not like", value, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescIn(List<String> values) {
            addCriterion("con_desc in", values, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescNotIn(List<String> values) {
            addCriterion("con_desc not in", values, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescBetween(String value1, String value2) {
            addCriterion("con_desc between", value1, value2, "conDesc");
            return (Criteria) this;
        }

        public Criteria andConDescNotBetween(String value1, String value2) {
            addCriterion("con_desc not between", value1, value2, "conDesc");
            return (Criteria) this;
        }

        public Criteria andComTimeIsNull() {
            addCriterion("com_time is null");
            return (Criteria) this;
        }

        public Criteria andComTimeIsNotNull() {
            addCriterion("com_time is not null");
            return (Criteria) this;
        }

        public Criteria andComTimeEqualTo(Date value) {
            addCriterionForJDBCDate("com_time =", value, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("com_time <>", value, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("com_time >", value, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("com_time >=", value, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeLessThan(Date value) {
            addCriterionForJDBCDate("com_time <", value, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("com_time <=", value, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeIn(List<Date> values) {
            addCriterionForJDBCDate("com_time in", values, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("com_time not in", values, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("com_time between", value1, value2, "comTime");
            return (Criteria) this;
        }

        public Criteria andComTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("com_time not between", value1, value2, "comTime");
            return (Criteria) this;
        }

        public Criteria andComImageIsNull() {
            addCriterion("com_image is null");
            return (Criteria) this;
        }

        public Criteria andComImageIsNotNull() {
            addCriterion("com_image is not null");
            return (Criteria) this;
        }

        public Criteria andComImageEqualTo(String value) {
            addCriterion("com_image =", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageNotEqualTo(String value) {
            addCriterion("com_image <>", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageGreaterThan(String value) {
            addCriterion("com_image >", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageGreaterThanOrEqualTo(String value) {
            addCriterion("com_image >=", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageLessThan(String value) {
            addCriterion("com_image <", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageLessThanOrEqualTo(String value) {
            addCriterion("com_image <=", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageLike(String value) {
            addCriterion("com_image like", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageNotLike(String value) {
            addCriterion("com_image not like", value, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageIn(List<String> values) {
            addCriterion("com_image in", values, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageNotIn(List<String> values) {
            addCriterion("com_image not in", values, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageBetween(String value1, String value2) {
            addCriterion("com_image between", value1, value2, "comImage");
            return (Criteria) this;
        }

        public Criteria andComImageNotBetween(String value1, String value2) {
            addCriterion("com_image not between", value1, value2, "comImage");
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