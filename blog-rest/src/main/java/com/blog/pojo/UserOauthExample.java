package com.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserOauthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOauthExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOauthNameIsNull() {
            addCriterion("oauth_name is null");
            return (Criteria) this;
        }

        public Criteria andOauthNameIsNotNull() {
            addCriterion("oauth_name is not null");
            return (Criteria) this;
        }

        public Criteria andOauthNameEqualTo(String value) {
            addCriterion("oauth_name =", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameNotEqualTo(String value) {
            addCriterion("oauth_name <>", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameGreaterThan(String value) {
            addCriterion("oauth_name >", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_name >=", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameLessThan(String value) {
            addCriterion("oauth_name <", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameLessThanOrEqualTo(String value) {
            addCriterion("oauth_name <=", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameLike(String value) {
            addCriterion("oauth_name like", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameNotLike(String value) {
            addCriterion("oauth_name not like", value, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameIn(List<String> values) {
            addCriterion("oauth_name in", values, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameNotIn(List<String> values) {
            addCriterion("oauth_name not in", values, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameBetween(String value1, String value2) {
            addCriterion("oauth_name between", value1, value2, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthNameNotBetween(String value1, String value2) {
            addCriterion("oauth_name not between", value1, value2, "oauthName");
            return (Criteria) this;
        }

        public Criteria andOauthIdIsNull() {
            addCriterion("oauth_id is null");
            return (Criteria) this;
        }

        public Criteria andOauthIdIsNotNull() {
            addCriterion("oauth_id is not null");
            return (Criteria) this;
        }

        public Criteria andOauthIdEqualTo(String value) {
            addCriterion("oauth_id =", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdNotEqualTo(String value) {
            addCriterion("oauth_id <>", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdGreaterThan(String value) {
            addCriterion("oauth_id >", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_id >=", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdLessThan(String value) {
            addCriterion("oauth_id <", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdLessThanOrEqualTo(String value) {
            addCriterion("oauth_id <=", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdLike(String value) {
            addCriterion("oauth_id like", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdNotLike(String value) {
            addCriterion("oauth_id not like", value, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdIn(List<String> values) {
            addCriterion("oauth_id in", values, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdNotIn(List<String> values) {
            addCriterion("oauth_id not in", values, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdBetween(String value1, String value2) {
            addCriterion("oauth_id between", value1, value2, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthIdNotBetween(String value1, String value2) {
            addCriterion("oauth_id not between", value1, value2, "oauthId");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenIsNull() {
            addCriterion("oauth_access_token is null");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenIsNotNull() {
            addCriterion("oauth_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenEqualTo(String value) {
            addCriterion("oauth_access_token =", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenNotEqualTo(String value) {
            addCriterion("oauth_access_token <>", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenGreaterThan(String value) {
            addCriterion("oauth_access_token >", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_access_token >=", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenLessThan(String value) {
            addCriterion("oauth_access_token <", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("oauth_access_token <=", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenLike(String value) {
            addCriterion("oauth_access_token like", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenNotLike(String value) {
            addCriterion("oauth_access_token not like", value, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenIn(List<String> values) {
            addCriterion("oauth_access_token in", values, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenNotIn(List<String> values) {
            addCriterion("oauth_access_token not in", values, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenBetween(String value1, String value2) {
            addCriterion("oauth_access_token between", value1, value2, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthAccessTokenNotBetween(String value1, String value2) {
            addCriterion("oauth_access_token not between", value1, value2, "oauthAccessToken");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresIsNull() {
            addCriterion("oauth_expires is null");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresIsNotNull() {
            addCriterion("oauth_expires is not null");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresEqualTo(String value) {
            addCriterion("oauth_expires =", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresNotEqualTo(String value) {
            addCriterion("oauth_expires <>", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresGreaterThan(String value) {
            addCriterion("oauth_expires >", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_expires >=", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresLessThan(String value) {
            addCriterion("oauth_expires <", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresLessThanOrEqualTo(String value) {
            addCriterion("oauth_expires <=", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresLike(String value) {
            addCriterion("oauth_expires like", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresNotLike(String value) {
            addCriterion("oauth_expires not like", value, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresIn(List<String> values) {
            addCriterion("oauth_expires in", values, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresNotIn(List<String> values) {
            addCriterion("oauth_expires not in", values, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresBetween(String value1, String value2) {
            addCriterion("oauth_expires between", value1, value2, "oauthExpires");
            return (Criteria) this;
        }

        public Criteria andOauthExpiresNotBetween(String value1, String value2) {
            addCriterion("oauth_expires not between", value1, value2, "oauthExpires");
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