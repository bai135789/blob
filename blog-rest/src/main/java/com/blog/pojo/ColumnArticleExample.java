package com.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class ColumnArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnArticleExample() {
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

        public Criteria andArticleSortIsNull() {
            addCriterion("article_sort is null");
            return (Criteria) this;
        }

        public Criteria andArticleSortIsNotNull() {
            addCriterion("article_sort is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSortEqualTo(Byte value) {
            addCriterion("article_sort =", value, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortNotEqualTo(Byte value) {
            addCriterion("article_sort <>", value, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortGreaterThan(Byte value) {
            addCriterion("article_sort >", value, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("article_sort >=", value, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortLessThan(Byte value) {
            addCriterion("article_sort <", value, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortLessThanOrEqualTo(Byte value) {
            addCriterion("article_sort <=", value, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortIn(List<Byte> values) {
            addCriterion("article_sort in", values, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortNotIn(List<Byte> values) {
            addCriterion("article_sort not in", values, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortBetween(Byte value1, Byte value2) {
            addCriterion("article_sort between", value1, value2, "articleSort");
            return (Criteria) this;
        }

        public Criteria andArticleSortNotBetween(Byte value1, Byte value2) {
            addCriterion("article_sort not between", value1, value2, "articleSort");
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