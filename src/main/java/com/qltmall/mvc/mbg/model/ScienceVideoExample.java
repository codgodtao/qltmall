package com.qltmall.mvc.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScienceVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScienceVideoExample() {
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

        public Criteria andVidNameIsNull() {
            addCriterion("vid_name is null");
            return (Criteria) this;
        }

        public Criteria andVidNameIsNotNull() {
            addCriterion("vid_name is not null");
            return (Criteria) this;
        }

        public Criteria andVidNameEqualTo(String value) {
            addCriterion("vid_name =", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotEqualTo(String value) {
            addCriterion("vid_name <>", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameGreaterThan(String value) {
            addCriterion("vid_name >", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameGreaterThanOrEqualTo(String value) {
            addCriterion("vid_name >=", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLessThan(String value) {
            addCriterion("vid_name <", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLessThanOrEqualTo(String value) {
            addCriterion("vid_name <=", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLike(String value) {
            addCriterion("vid_name like", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotLike(String value) {
            addCriterion("vid_name not like", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameIn(List<String> values) {
            addCriterion("vid_name in", values, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotIn(List<String> values) {
            addCriterion("vid_name not in", values, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameBetween(String value1, String value2) {
            addCriterion("vid_name between", value1, value2, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotBetween(String value1, String value2) {
            addCriterion("vid_name not between", value1, value2, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidContentIsNull() {
            addCriterion("vid_content is null");
            return (Criteria) this;
        }

        public Criteria andVidContentIsNotNull() {
            addCriterion("vid_content is not null");
            return (Criteria) this;
        }

        public Criteria andVidContentEqualTo(String value) {
            addCriterion("vid_content =", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentNotEqualTo(String value) {
            addCriterion("vid_content <>", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentGreaterThan(String value) {
            addCriterion("vid_content >", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentGreaterThanOrEqualTo(String value) {
            addCriterion("vid_content >=", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentLessThan(String value) {
            addCriterion("vid_content <", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentLessThanOrEqualTo(String value) {
            addCriterion("vid_content <=", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentLike(String value) {
            addCriterion("vid_content like", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentNotLike(String value) {
            addCriterion("vid_content not like", value, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentIn(List<String> values) {
            addCriterion("vid_content in", values, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentNotIn(List<String> values) {
            addCriterion("vid_content not in", values, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentBetween(String value1, String value2) {
            addCriterion("vid_content between", value1, value2, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidContentNotBetween(String value1, String value2) {
            addCriterion("vid_content not between", value1, value2, "vidContent");
            return (Criteria) this;
        }

        public Criteria andVidAuthorIsNull() {
            addCriterion("vid_author is null");
            return (Criteria) this;
        }

        public Criteria andVidAuthorIsNotNull() {
            addCriterion("vid_author is not null");
            return (Criteria) this;
        }

        public Criteria andVidAuthorEqualTo(String value) {
            addCriterion("vid_author =", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorNotEqualTo(String value) {
            addCriterion("vid_author <>", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorGreaterThan(String value) {
            addCriterion("vid_author >", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("vid_author >=", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorLessThan(String value) {
            addCriterion("vid_author <", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorLessThanOrEqualTo(String value) {
            addCriterion("vid_author <=", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorLike(String value) {
            addCriterion("vid_author like", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorNotLike(String value) {
            addCriterion("vid_author not like", value, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorIn(List<String> values) {
            addCriterion("vid_author in", values, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorNotIn(List<String> values) {
            addCriterion("vid_author not in", values, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorBetween(String value1, String value2) {
            addCriterion("vid_author between", value1, value2, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidAuthorNotBetween(String value1, String value2) {
            addCriterion("vid_author not between", value1, value2, "vidAuthor");
            return (Criteria) this;
        }

        public Criteria andVidTimeIsNull() {
            addCriterion("vid_time is null");
            return (Criteria) this;
        }

        public Criteria andVidTimeIsNotNull() {
            addCriterion("vid_time is not null");
            return (Criteria) this;
        }

        public Criteria andVidTimeEqualTo(Date value) {
            addCriterionForJDBCDate("vid_time =", value, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("vid_time <>", value, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("vid_time >", value, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vid_time >=", value, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeLessThan(Date value) {
            addCriterionForJDBCDate("vid_time <", value, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vid_time <=", value, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeIn(List<Date> values) {
            addCriterionForJDBCDate("vid_time in", values, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("vid_time not in", values, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vid_time between", value1, value2, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVidTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vid_time not between", value1, value2, "vidTime");
            return (Criteria) this;
        }

        public Criteria andVideoThumbIsNull() {
            addCriterion("video_thumb is null");
            return (Criteria) this;
        }

        public Criteria andVideoThumbIsNotNull() {
            addCriterion("video_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andVideoThumbEqualTo(String value) {
            addCriterion("video_thumb =", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbNotEqualTo(String value) {
            addCriterion("video_thumb <>", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbGreaterThan(String value) {
            addCriterion("video_thumb >", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbGreaterThanOrEqualTo(String value) {
            addCriterion("video_thumb >=", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbLessThan(String value) {
            addCriterion("video_thumb <", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbLessThanOrEqualTo(String value) {
            addCriterion("video_thumb <=", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbLike(String value) {
            addCriterion("video_thumb like", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbNotLike(String value) {
            addCriterion("video_thumb not like", value, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbIn(List<String> values) {
            addCriterion("video_thumb in", values, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbNotIn(List<String> values) {
            addCriterion("video_thumb not in", values, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbBetween(String value1, String value2) {
            addCriterion("video_thumb between", value1, value2, "videoThumb");
            return (Criteria) this;
        }

        public Criteria andVideoThumbNotBetween(String value1, String value2) {
            addCriterion("video_thumb not between", value1, value2, "videoThumb");
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