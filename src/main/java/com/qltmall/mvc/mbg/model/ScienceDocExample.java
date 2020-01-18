package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScienceDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScienceDocExample() {
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

        public Criteria andDocContentIsNull() {
            addCriterion("doc_content is null");
            return (Criteria) this;
        }

        public Criteria andDocContentIsNotNull() {
            addCriterion("doc_content is not null");
            return (Criteria) this;
        }

        public Criteria andDocContentEqualTo(String value) {
            addCriterion("doc_content =", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentNotEqualTo(String value) {
            addCriterion("doc_content <>", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentGreaterThan(String value) {
            addCriterion("doc_content >", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentGreaterThanOrEqualTo(String value) {
            addCriterion("doc_content >=", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentLessThan(String value) {
            addCriterion("doc_content <", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentLessThanOrEqualTo(String value) {
            addCriterion("doc_content <=", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentLike(String value) {
            addCriterion("doc_content like", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentNotLike(String value) {
            addCriterion("doc_content not like", value, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentIn(List<String> values) {
            addCriterion("doc_content in", values, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentNotIn(List<String> values) {
            addCriterion("doc_content not in", values, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentBetween(String value1, String value2) {
            addCriterion("doc_content between", value1, value2, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocContentNotBetween(String value1, String value2) {
            addCriterion("doc_content not between", value1, value2, "docContent");
            return (Criteria) this;
        }

        public Criteria andDocAuthorIsNull() {
            addCriterion("doc_author is null");
            return (Criteria) this;
        }

        public Criteria andDocAuthorIsNotNull() {
            addCriterion("doc_author is not null");
            return (Criteria) this;
        }

        public Criteria andDocAuthorEqualTo(String value) {
            addCriterion("doc_author =", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorNotEqualTo(String value) {
            addCriterion("doc_author <>", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorGreaterThan(String value) {
            addCriterion("doc_author >", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("doc_author >=", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorLessThan(String value) {
            addCriterion("doc_author <", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorLessThanOrEqualTo(String value) {
            addCriterion("doc_author <=", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorLike(String value) {
            addCriterion("doc_author like", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorNotLike(String value) {
            addCriterion("doc_author not like", value, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorIn(List<String> values) {
            addCriterion("doc_author in", values, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorNotIn(List<String> values) {
            addCriterion("doc_author not in", values, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorBetween(String value1, String value2) {
            addCriterion("doc_author between", value1, value2, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocAuthorNotBetween(String value1, String value2) {
            addCriterion("doc_author not between", value1, value2, "docAuthor");
            return (Criteria) this;
        }

        public Criteria andDocTimeIsNull() {
            addCriterion("doc_time is null");
            return (Criteria) this;
        }

        public Criteria andDocTimeIsNotNull() {
            addCriterion("doc_time is not null");
            return (Criteria) this;
        }

        public Criteria andDocTimeEqualTo(Date value) {
            addCriterionForJDBCDate("doc_time =", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("doc_time <>", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("doc_time >", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("doc_time >=", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeLessThan(Date value) {
            addCriterionForJDBCDate("doc_time <", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("doc_time <=", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeIn(List<Date> values) {
            addCriterionForJDBCDate("doc_time in", values, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("doc_time not in", values, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("doc_time between", value1, value2, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("doc_time not between", value1, value2, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocThumbIsNull() {
            addCriterion("doc_thumb is null");
            return (Criteria) this;
        }

        public Criteria andDocThumbIsNotNull() {
            addCriterion("doc_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andDocThumbEqualTo(String value) {
            addCriterion("doc_thumb =", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbNotEqualTo(String value) {
            addCriterion("doc_thumb <>", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbGreaterThan(String value) {
            addCriterion("doc_thumb >", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbGreaterThanOrEqualTo(String value) {
            addCriterion("doc_thumb >=", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbLessThan(String value) {
            addCriterion("doc_thumb <", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbLessThanOrEqualTo(String value) {
            addCriterion("doc_thumb <=", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbLike(String value) {
            addCriterion("doc_thumb like", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbNotLike(String value) {
            addCriterion("doc_thumb not like", value, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbIn(List<String> values) {
            addCriterion("doc_thumb in", values, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbNotIn(List<String> values) {
            addCriterion("doc_thumb not in", values, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbBetween(String value1, String value2) {
            addCriterion("doc_thumb between", value1, value2, "docThumb");
            return (Criteria) this;
        }

        public Criteria andDocThumbNotBetween(String value1, String value2) {
            addCriterion("doc_thumb not between", value1, value2, "docThumb");
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