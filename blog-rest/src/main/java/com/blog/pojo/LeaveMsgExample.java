package com.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class LeaveMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveMsgExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Integer value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Integer value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Integer value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Integer value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Integer> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Integer> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdIsNull() {
            addCriterion("msg_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdIsNotNull() {
            addCriterion("msg_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdEqualTo(Integer value) {
            addCriterion("msg_user_id =", value, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdNotEqualTo(Integer value) {
            addCriterion("msg_user_id <>", value, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdGreaterThan(Integer value) {
            addCriterion("msg_user_id >", value, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_user_id >=", value, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdLessThan(Integer value) {
            addCriterion("msg_user_id <", value, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_user_id <=", value, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdIn(List<Integer> values) {
            addCriterion("msg_user_id in", values, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdNotIn(List<Integer> values) {
            addCriterion("msg_user_id not in", values, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_user_id between", value1, value2, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andMsgUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_user_id not between", value1, value2, "msgUserId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdIsNull() {
            addCriterion("parent_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdIsNotNull() {
            addCriterion("parent_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdEqualTo(Integer value) {
            addCriterion("parent_msg_id =", value, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdNotEqualTo(Integer value) {
            addCriterion("parent_msg_id <>", value, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdGreaterThan(Integer value) {
            addCriterion("parent_msg_id >", value, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_msg_id >=", value, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdLessThan(Integer value) {
            addCriterion("parent_msg_id <", value, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_msg_id <=", value, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdIn(List<Integer> values) {
            addCriterion("parent_msg_id in", values, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdNotIn(List<Integer> values) {
            addCriterion("parent_msg_id not in", values, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_msg_id between", value1, value2, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andParentMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_msg_id not between", value1, value2, "parentMsgId");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeIsNull() {
            addCriterion("leave_msg_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeIsNotNull() {
            addCriterion("leave_msg_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeEqualTo(Integer value) {
            addCriterion("leave_msg_time =", value, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeNotEqualTo(Integer value) {
            addCriterion("leave_msg_time <>", value, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeGreaterThan(Integer value) {
            addCriterion("leave_msg_time >", value, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_msg_time >=", value, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeLessThan(Integer value) {
            addCriterion("leave_msg_time <", value, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeLessThanOrEqualTo(Integer value) {
            addCriterion("leave_msg_time <=", value, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeIn(List<Integer> values) {
            addCriterion("leave_msg_time in", values, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeNotIn(List<Integer> values) {
            addCriterion("leave_msg_time not in", values, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeBetween(Integer value1, Integer value2) {
            addCriterion("leave_msg_time between", value1, value2, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_msg_time not between", value1, value2, "leaveMsgTime");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpIsNull() {
            addCriterion("leave_msg_ip is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpIsNotNull() {
            addCriterion("leave_msg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpEqualTo(String value) {
            addCriterion("leave_msg_ip =", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpNotEqualTo(String value) {
            addCriterion("leave_msg_ip <>", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpGreaterThan(String value) {
            addCriterion("leave_msg_ip >", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpGreaterThanOrEqualTo(String value) {
            addCriterion("leave_msg_ip >=", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpLessThan(String value) {
            addCriterion("leave_msg_ip <", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpLessThanOrEqualTo(String value) {
            addCriterion("leave_msg_ip <=", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpLike(String value) {
            addCriterion("leave_msg_ip like", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpNotLike(String value) {
            addCriterion("leave_msg_ip not like", value, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpIn(List<String> values) {
            addCriterion("leave_msg_ip in", values, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpNotIn(List<String> values) {
            addCriterion("leave_msg_ip not in", values, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpBetween(String value1, String value2) {
            addCriterion("leave_msg_ip between", value1, value2, "leaveMsgIp");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgIpNotBetween(String value1, String value2) {
            addCriterion("leave_msg_ip not between", value1, value2, "leaveMsgIp");
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