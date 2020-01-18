package com.qltmall.mvc.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HairExample() {
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

        public Criteria andHairNameIsNull() {
            addCriterion("hair_name is null");
            return (Criteria) this;
        }

        public Criteria andHairNameIsNotNull() {
            addCriterion("hair_name is not null");
            return (Criteria) this;
        }

        public Criteria andHairNameEqualTo(String value) {
            addCriterion("hair_name =", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameNotEqualTo(String value) {
            addCriterion("hair_name <>", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameGreaterThan(String value) {
            addCriterion("hair_name >", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameGreaterThanOrEqualTo(String value) {
            addCriterion("hair_name >=", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameLessThan(String value) {
            addCriterion("hair_name <", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameLessThanOrEqualTo(String value) {
            addCriterion("hair_name <=", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameLike(String value) {
            addCriterion("hair_name like", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameNotLike(String value) {
            addCriterion("hair_name not like", value, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameIn(List<String> values) {
            addCriterion("hair_name in", values, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameNotIn(List<String> values) {
            addCriterion("hair_name not in", values, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameBetween(String value1, String value2) {
            addCriterion("hair_name between", value1, value2, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairNameNotBetween(String value1, String value2) {
            addCriterion("hair_name not between", value1, value2, "hairName");
            return (Criteria) this;
        }

        public Criteria andHairSoldIsNull() {
            addCriterion("hair_sold is null");
            return (Criteria) this;
        }

        public Criteria andHairSoldIsNotNull() {
            addCriterion("hair_sold is not null");
            return (Criteria) this;
        }

        public Criteria andHairSoldEqualTo(Integer value) {
            addCriterion("hair_sold =", value, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldNotEqualTo(Integer value) {
            addCriterion("hair_sold <>", value, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldGreaterThan(Integer value) {
            addCriterion("hair_sold >", value, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("hair_sold >=", value, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldLessThan(Integer value) {
            addCriterion("hair_sold <", value, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldLessThanOrEqualTo(Integer value) {
            addCriterion("hair_sold <=", value, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldIn(List<Integer> values) {
            addCriterion("hair_sold in", values, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldNotIn(List<Integer> values) {
            addCriterion("hair_sold not in", values, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldBetween(Integer value1, Integer value2) {
            addCriterion("hair_sold between", value1, value2, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("hair_sold not between", value1, value2, "hairSold");
            return (Criteria) this;
        }

        public Criteria andHairGoodsIsNull() {
            addCriterion("hair_goods is null");
            return (Criteria) this;
        }

        public Criteria andHairGoodsIsNotNull() {
            addCriterion("hair_goods is not null");
            return (Criteria) this;
        }

        public Criteria andHairGoodsEqualTo(Short value) {
            addCriterion("hair_goods =", value, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsNotEqualTo(Short value) {
            addCriterion("hair_goods <>", value, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsGreaterThan(Short value) {
            addCriterion("hair_goods >", value, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsGreaterThanOrEqualTo(Short value) {
            addCriterion("hair_goods >=", value, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsLessThan(Short value) {
            addCriterion("hair_goods <", value, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsLessThanOrEqualTo(Short value) {
            addCriterion("hair_goods <=", value, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsIn(List<Short> values) {
            addCriterion("hair_goods in", values, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsNotIn(List<Short> values) {
            addCriterion("hair_goods not in", values, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsBetween(Short value1, Short value2) {
            addCriterion("hair_goods between", value1, value2, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairGoodsNotBetween(Short value1, Short value2) {
            addCriterion("hair_goods not between", value1, value2, "hairGoods");
            return (Criteria) this;
        }

        public Criteria andHairPieceIsNull() {
            addCriterion("hair_piece is null");
            return (Criteria) this;
        }

        public Criteria andHairPieceIsNotNull() {
            addCriterion("hair_piece is not null");
            return (Criteria) this;
        }

        public Criteria andHairPieceEqualTo(BigDecimal value) {
            addCriterion("hair_piece =", value, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceNotEqualTo(BigDecimal value) {
            addCriterion("hair_piece <>", value, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceGreaterThan(BigDecimal value) {
            addCriterion("hair_piece >", value, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hair_piece >=", value, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceLessThan(BigDecimal value) {
            addCriterion("hair_piece <", value, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hair_piece <=", value, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceIn(List<BigDecimal> values) {
            addCriterion("hair_piece in", values, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceNotIn(List<BigDecimal> values) {
            addCriterion("hair_piece not in", values, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hair_piece between", value1, value2, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairPieceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hair_piece not between", value1, value2, "hairPiece");
            return (Criteria) this;
        }

        public Criteria andHairDescIsNull() {
            addCriterion("hair_desc is null");
            return (Criteria) this;
        }

        public Criteria andHairDescIsNotNull() {
            addCriterion("hair_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHairDescEqualTo(String value) {
            addCriterion("hair_desc =", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescNotEqualTo(String value) {
            addCriterion("hair_desc <>", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescGreaterThan(String value) {
            addCriterion("hair_desc >", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescGreaterThanOrEqualTo(String value) {
            addCriterion("hair_desc >=", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescLessThan(String value) {
            addCriterion("hair_desc <", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescLessThanOrEqualTo(String value) {
            addCriterion("hair_desc <=", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescLike(String value) {
            addCriterion("hair_desc like", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescNotLike(String value) {
            addCriterion("hair_desc not like", value, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescIn(List<String> values) {
            addCriterion("hair_desc in", values, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescNotIn(List<String> values) {
            addCriterion("hair_desc not in", values, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescBetween(String value1, String value2) {
            addCriterion("hair_desc between", value1, value2, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andHairDescNotBetween(String value1, String value2) {
            addCriterion("hair_desc not between", value1, value2, "hairDesc");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNull() {
            addCriterion("key_words is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNotNull() {
            addCriterion("key_words is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualTo(String value) {
            addCriterion("key_words =", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualTo(String value) {
            addCriterion("key_words <>", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThan(String value) {
            addCriterion("key_words >", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("key_words >=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThan(String value) {
            addCriterion("key_words <", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("key_words <=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLike(String value) {
            addCriterion("key_words like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotLike(String value) {
            addCriterion("key_words not like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIn(List<String> values) {
            addCriterion("key_words in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotIn(List<String> values) {
            addCriterion("key_words not in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsBetween(String value1, String value2) {
            addCriterion("key_words between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotBetween(String value1, String value2) {
            addCriterion("key_words not between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andHairThumbIsNull() {
            addCriterion("hair_thumb is null");
            return (Criteria) this;
        }

        public Criteria andHairThumbIsNotNull() {
            addCriterion("hair_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andHairThumbEqualTo(String value) {
            addCriterion("hair_thumb =", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbNotEqualTo(String value) {
            addCriterion("hair_thumb <>", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbGreaterThan(String value) {
            addCriterion("hair_thumb >", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbGreaterThanOrEqualTo(String value) {
            addCriterion("hair_thumb >=", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbLessThan(String value) {
            addCriterion("hair_thumb <", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbLessThanOrEqualTo(String value) {
            addCriterion("hair_thumb <=", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbLike(String value) {
            addCriterion("hair_thumb like", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbNotLike(String value) {
            addCriterion("hair_thumb not like", value, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbIn(List<String> values) {
            addCriterion("hair_thumb in", values, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbNotIn(List<String> values) {
            addCriterion("hair_thumb not in", values, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbBetween(String value1, String value2) {
            addCriterion("hair_thumb between", value1, value2, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairThumbNotBetween(String value1, String value2) {
            addCriterion("hair_thumb not between", value1, value2, "hairThumb");
            return (Criteria) this;
        }

        public Criteria andHairPhotoIsNull() {
            addCriterion("hair_photo is null");
            return (Criteria) this;
        }

        public Criteria andHairPhotoIsNotNull() {
            addCriterion("hair_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHairPhotoEqualTo(String value) {
            addCriterion("hair_photo =", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoNotEqualTo(String value) {
            addCriterion("hair_photo <>", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoGreaterThan(String value) {
            addCriterion("hair_photo >", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("hair_photo >=", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoLessThan(String value) {
            addCriterion("hair_photo <", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoLessThanOrEqualTo(String value) {
            addCriterion("hair_photo <=", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoLike(String value) {
            addCriterion("hair_photo like", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoNotLike(String value) {
            addCriterion("hair_photo not like", value, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoIn(List<String> values) {
            addCriterion("hair_photo in", values, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoNotIn(List<String> values) {
            addCriterion("hair_photo not in", values, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoBetween(String value1, String value2) {
            addCriterion("hair_photo between", value1, value2, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andHairPhotoNotBetween(String value1, String value2) {
            addCriterion("hair_photo not between", value1, value2, "hairPhoto");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdIsNull() {
            addCriterion("three_hair_id is null");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdIsNotNull() {
            addCriterion("three_hair_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdEqualTo(Integer value) {
            addCriterion("three_hair_id =", value, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdNotEqualTo(Integer value) {
            addCriterion("three_hair_id <>", value, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdGreaterThan(Integer value) {
            addCriterion("three_hair_id >", value, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_hair_id >=", value, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdLessThan(Integer value) {
            addCriterion("three_hair_id <", value, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdLessThanOrEqualTo(Integer value) {
            addCriterion("three_hair_id <=", value, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdIn(List<Integer> values) {
            addCriterion("three_hair_id in", values, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdNotIn(List<Integer> values) {
            addCriterion("three_hair_id not in", values, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdBetween(Integer value1, Integer value2) {
            addCriterion("three_hair_id between", value1, value2, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andThreeHairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("three_hair_id not between", value1, value2, "threeHairId");
            return (Criteria) this;
        }

        public Criteria andHairBrandIsNull() {
            addCriterion("hair_brand is null");
            return (Criteria) this;
        }

        public Criteria andHairBrandIsNotNull() {
            addCriterion("hair_brand is not null");
            return (Criteria) this;
        }

        public Criteria andHairBrandEqualTo(String value) {
            addCriterion("hair_brand =", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandNotEqualTo(String value) {
            addCriterion("hair_brand <>", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandGreaterThan(String value) {
            addCriterion("hair_brand >", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandGreaterThanOrEqualTo(String value) {
            addCriterion("hair_brand >=", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandLessThan(String value) {
            addCriterion("hair_brand <", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandLessThanOrEqualTo(String value) {
            addCriterion("hair_brand <=", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandLike(String value) {
            addCriterion("hair_brand like", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandNotLike(String value) {
            addCriterion("hair_brand not like", value, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandIn(List<String> values) {
            addCriterion("hair_brand in", values, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandNotIn(List<String> values) {
            addCriterion("hair_brand not in", values, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandBetween(String value1, String value2) {
            addCriterion("hair_brand between", value1, value2, "hairBrand");
            return (Criteria) this;
        }

        public Criteria andHairBrandNotBetween(String value1, String value2) {
            addCriterion("hair_brand not between", value1, value2, "hairBrand");
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