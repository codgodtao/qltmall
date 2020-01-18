package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterionForJDBCDate("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterionForJDBCDate("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterionForJDBCDate("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIsNull() {
            addCriterion("is_attention is null");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIsNotNull() {
            addCriterion("is_attention is not null");
            return (Criteria) this;
        }

        public Criteria andIsAttentionEqualTo(Boolean value) {
            addCriterion("is_attention =", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotEqualTo(Boolean value) {
            addCriterion("is_attention <>", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionGreaterThan(Boolean value) {
            addCriterion("is_attention >", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_attention >=", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionLessThan(Boolean value) {
            addCriterion("is_attention <", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_attention <=", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIn(List<Boolean> values) {
            addCriterion("is_attention in", values, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotIn(List<Boolean> values) {
            addCriterion("is_attention not in", values, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_attention between", value1, value2, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_attention not between", value1, value2, "isAttention");
            return (Criteria) this;
        }

        public Criteria andColTypeIsNull() {
            addCriterion("col_type is null");
            return (Criteria) this;
        }

        public Criteria andColTypeIsNotNull() {
            addCriterion("col_type is not null");
            return (Criteria) this;
        }

        public Criteria andColTypeEqualTo(Boolean value) {
            addCriterion("col_type =", value, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeNotEqualTo(Boolean value) {
            addCriterion("col_type <>", value, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeGreaterThan(Boolean value) {
            addCriterion("col_type >", value, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("col_type >=", value, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeLessThan(Boolean value) {
            addCriterion("col_type <", value, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("col_type <=", value, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeIn(List<Boolean> values) {
            addCriterion("col_type in", values, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeNotIn(List<Boolean> values) {
            addCriterion("col_type not in", values, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("col_type between", value1, value2, "colType");
            return (Criteria) this;
        }

        public Criteria andColTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("col_type not between", value1, value2, "colType");
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