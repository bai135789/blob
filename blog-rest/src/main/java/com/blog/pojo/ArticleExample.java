package com.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Short value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Short value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Short value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Short value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Short value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Short value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Short> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Short> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Short value1, Short value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Short value1, Short value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleNameIsNull() {
            addCriterion("article_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleNameIsNotNull() {
            addCriterion("article_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNameEqualTo(String value) {
            addCriterion("article_name =", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotEqualTo(String value) {
            addCriterion("article_name <>", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThan(String value) {
            addCriterion("article_name >", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_name >=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThan(String value) {
            addCriterion("article_name <", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThanOrEqualTo(String value) {
            addCriterion("article_name <=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLike(String value) {
            addCriterion("article_name like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotLike(String value) {
            addCriterion("article_name not like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameIn(List<String> values) {
            addCriterion("article_name in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotIn(List<String> values) {
            addCriterion("article_name not in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameBetween(String value1, String value2) {
            addCriterion("article_name between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotBetween(String value1, String value2) {
            addCriterion("article_name not between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleIntroIsNull() {
            addCriterion("article_intro is null");
            return (Criteria) this;
        }

        public Criteria andArticleIntroIsNotNull() {
            addCriterion("article_intro is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIntroEqualTo(String value) {
            addCriterion("article_intro =", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroNotEqualTo(String value) {
            addCriterion("article_intro <>", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroGreaterThan(String value) {
            addCriterion("article_intro >", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroGreaterThanOrEqualTo(String value) {
            addCriterion("article_intro >=", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroLessThan(String value) {
            addCriterion("article_intro <", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroLessThanOrEqualTo(String value) {
            addCriterion("article_intro <=", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroLike(String value) {
            addCriterion("article_intro like", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroNotLike(String value) {
            addCriterion("article_intro not like", value, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroIn(List<String> values) {
            addCriterion("article_intro in", values, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroNotIn(List<String> values) {
            addCriterion("article_intro not in", values, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroBetween(String value1, String value2) {
            addCriterion("article_intro between", value1, value2, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleIntroNotBetween(String value1, String value2) {
            addCriterion("article_intro not between", value1, value2, "articleIntro");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIsNull() {
            addCriterion("article_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIsNotNull() {
            addCriterion("article_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTimeEqualTo(Integer value) {
            addCriterion("article_time =", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotEqualTo(Integer value) {
            addCriterion("article_time <>", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeGreaterThan(Integer value) {
            addCriterion("article_time >", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_time >=", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeLessThan(Integer value) {
            addCriterion("article_time <", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("article_time <=", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIn(List<Integer> values) {
            addCriterion("article_time in", values, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotIn(List<Integer> values) {
            addCriterion("article_time not in", values, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeBetween(Integer value1, Integer value2) {
            addCriterion("article_time between", value1, value2, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("article_time not between", value1, value2, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleIpIsNull() {
            addCriterion("article_ip is null");
            return (Criteria) this;
        }

        public Criteria andArticleIpIsNotNull() {
            addCriterion("article_ip is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIpEqualTo(String value) {
            addCriterion("article_ip =", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotEqualTo(String value) {
            addCriterion("article_ip <>", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpGreaterThan(String value) {
            addCriterion("article_ip >", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpGreaterThanOrEqualTo(String value) {
            addCriterion("article_ip >=", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpLessThan(String value) {
            addCriterion("article_ip <", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpLessThanOrEqualTo(String value) {
            addCriterion("article_ip <=", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpLike(String value) {
            addCriterion("article_ip like", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotLike(String value) {
            addCriterion("article_ip not like", value, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpIn(List<String> values) {
            addCriterion("article_ip in", values, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotIn(List<String> values) {
            addCriterion("article_ip not in", values, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpBetween(String value1, String value2) {
            addCriterion("article_ip between", value1, value2, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleIpNotBetween(String value1, String value2) {
            addCriterion("article_ip not between", value1, value2, "articleIp");
            return (Criteria) this;
        }

        public Criteria andArticleClickIsNull() {
            addCriterion("article_click is null");
            return (Criteria) this;
        }

        public Criteria andArticleClickIsNotNull() {
            addCriterion("article_click is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClickEqualTo(Integer value) {
            addCriterion("article_click =", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotEqualTo(Integer value) {
            addCriterion("article_click <>", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickGreaterThan(Integer value) {
            addCriterion("article_click >", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_click >=", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickLessThan(Integer value) {
            addCriterion("article_click <", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickLessThanOrEqualTo(Integer value) {
            addCriterion("article_click <=", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickIn(List<Integer> values) {
            addCriterion("article_click in", values, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotIn(List<Integer> values) {
            addCriterion("article_click not in", values, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickBetween(Integer value1, Integer value2) {
            addCriterion("article_click between", value1, value2, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotBetween(Integer value1, Integer value2) {
            addCriterion("article_click not between", value1, value2, "articleClick");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdIsNull() {
            addCriterion("sort_article_id is null");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdIsNotNull() {
            addCriterion("sort_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdEqualTo(Integer value) {
            addCriterion("sort_article_id =", value, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdNotEqualTo(Integer value) {
            addCriterion("sort_article_id <>", value, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdGreaterThan(Integer value) {
            addCriterion("sort_article_id >", value, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_article_id >=", value, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdLessThan(Integer value) {
            addCriterion("sort_article_id <", value, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_article_id <=", value, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdIn(List<Integer> values) {
            addCriterion("sort_article_id in", values, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdNotIn(List<Integer> values) {
            addCriterion("sort_article_id not in", values, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_article_id between", value1, value2, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_article_id not between", value1, value2, "sortArticleId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdIsNull() {
            addCriterion("sort_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andSortTagIdIsNotNull() {
            addCriterion("sort_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortTagIdEqualTo(Integer value) {
            addCriterion("sort_tag_id =", value, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdNotEqualTo(Integer value) {
            addCriterion("sort_tag_id <>", value, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdGreaterThan(Integer value) {
            addCriterion("sort_tag_id >", value, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_tag_id >=", value, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdLessThan(Integer value) {
            addCriterion("sort_tag_id <", value, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_tag_id <=", value, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdIn(List<Integer> values) {
            addCriterion("sort_tag_id in", values, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdNotIn(List<Integer> values) {
            addCriterion("sort_tag_id not in", values, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_tag_id between", value1, value2, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_tag_id not between", value1, value2, "sortTagId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdIsNull() {
            addCriterion("sort_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdIsNotNull() {
            addCriterion("sort_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdEqualTo(Integer value) {
            addCriterion("sort_type_id =", value, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdNotEqualTo(Integer value) {
            addCriterion("sort_type_id <>", value, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdGreaterThan(Integer value) {
            addCriterion("sort_type_id >", value, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_type_id >=", value, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdLessThan(Integer value) {
            addCriterion("sort_type_id <", value, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_type_id <=", value, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdIn(List<Integer> values) {
            addCriterion("sort_type_id in", values, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdNotIn(List<Integer> values) {
            addCriterion("sort_type_id not in", values, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_type_id between", value1, value2, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andSortTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_type_id not between", value1, value2, "sortTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(Integer value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(Integer value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(Integer value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(Integer value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<Integer> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<Integer> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(Integer value1, Integer value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleUpIsNull() {
            addCriterion("article_up is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpIsNotNull() {
            addCriterion("article_up is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpEqualTo(Byte value) {
            addCriterion("article_up =", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpNotEqualTo(Byte value) {
            addCriterion("article_up <>", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpGreaterThan(Byte value) {
            addCriterion("article_up >", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpGreaterThanOrEqualTo(Byte value) {
            addCriterion("article_up >=", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpLessThan(Byte value) {
            addCriterion("article_up <", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpLessThanOrEqualTo(Byte value) {
            addCriterion("article_up <=", value, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpIn(List<Byte> values) {
            addCriterion("article_up in", values, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpNotIn(List<Byte> values) {
            addCriterion("article_up not in", values, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpBetween(Byte value1, Byte value2) {
            addCriterion("article_up between", value1, value2, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleUpNotBetween(Byte value1, Byte value2) {
            addCriterion("article_up not between", value1, value2, "articleUp");
            return (Criteria) this;
        }

        public Criteria andArticleSupportIsNull() {
            addCriterion("article_support is null");
            return (Criteria) this;
        }

        public Criteria andArticleSupportIsNotNull() {
            addCriterion("article_support is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSupportEqualTo(Byte value) {
            addCriterion("article_support =", value, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportNotEqualTo(Byte value) {
            addCriterion("article_support <>", value, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportGreaterThan(Byte value) {
            addCriterion("article_support >", value, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportGreaterThanOrEqualTo(Byte value) {
            addCriterion("article_support >=", value, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportLessThan(Byte value) {
            addCriterion("article_support <", value, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportLessThanOrEqualTo(Byte value) {
            addCriterion("article_support <=", value, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportIn(List<Byte> values) {
            addCriterion("article_support in", values, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportNotIn(List<Byte> values) {
            addCriterion("article_support not in", values, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportBetween(Byte value1, Byte value2) {
            addCriterion("article_support between", value1, value2, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andArticleSupportNotBetween(Byte value1, Byte value2) {
            addCriterion("article_support not between", value1, value2, "articleSupport");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNull() {
            addCriterion("fabulous is null");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNotNull() {
            addCriterion("fabulous is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousEqualTo(Integer value) {
            addCriterion("fabulous =", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotEqualTo(Integer value) {
            addCriterion("fabulous <>", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThan(Integer value) {
            addCriterion("fabulous >", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous >=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThan(Integer value) {
            addCriterion("fabulous <", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous <=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousIn(List<Integer> values) {
            addCriterion("fabulous in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotIn(List<Integer> values) {
            addCriterion("fabulous not in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousBetween(Integer value1, Integer value2) {
            addCriterion("fabulous between", value1, value2, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous not between", value1, value2, "fabulous");
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