package core.com.aster.model;

import java.util.ArrayList;
import java.util.List;

public class ConfigBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigBannerExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIsNull() {
            addCriterion("target_url is null");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIsNotNull() {
            addCriterion("target_url is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUrlEqualTo(String value) {
            addCriterion("target_url =", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotEqualTo(String value) {
            addCriterion("target_url <>", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlGreaterThan(String value) {
            addCriterion("target_url >", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("target_url >=", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLessThan(String value) {
            addCriterion("target_url <", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLessThanOrEqualTo(String value) {
            addCriterion("target_url <=", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLike(String value) {
            addCriterion("target_url like", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotLike(String value) {
            addCriterion("target_url not like", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIn(List<String> values) {
            addCriterion("target_url in", values, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotIn(List<String> values) {
            addCriterion("target_url not in", values, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlBetween(String value1, String value2) {
            addCriterion("target_url between", value1, value2, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotBetween(String value1, String value2) {
            addCriterion("target_url not between", value1, value2, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeIsNull() {
            addCriterion("display_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeIsNotNull() {
            addCriterion("display_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeEqualTo(Integer value) {
            addCriterion("display_start_time =", value, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeNotEqualTo(Integer value) {
            addCriterion("display_start_time <>", value, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeGreaterThan(Integer value) {
            addCriterion("display_start_time >", value, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_start_time >=", value, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeLessThan(Integer value) {
            addCriterion("display_start_time <", value, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("display_start_time <=", value, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeIn(List<Integer> values) {
            addCriterion("display_start_time in", values, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeNotIn(List<Integer> values) {
            addCriterion("display_start_time not in", values, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("display_start_time between", value1, value2, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("display_start_time not between", value1, value2, "displayStartTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeIsNull() {
            addCriterion("display_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeIsNotNull() {
            addCriterion("display_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeEqualTo(Integer value) {
            addCriterion("display_end_time =", value, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeNotEqualTo(Integer value) {
            addCriterion("display_end_time <>", value, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeGreaterThan(Integer value) {
            addCriterion("display_end_time >", value, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_end_time >=", value, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeLessThan(Integer value) {
            addCriterion("display_end_time <", value, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("display_end_time <=", value, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeIn(List<Integer> values) {
            addCriterion("display_end_time in", values, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeNotIn(List<Integer> values) {
            addCriterion("display_end_time not in", values, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("display_end_time between", value1, value2, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplayEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("display_end_time not between", value1, value2, "displayEndTime");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceIsNull() {
            addCriterion("display_sequence is null");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceIsNotNull() {
            addCriterion("display_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceEqualTo(Integer value) {
            addCriterion("display_sequence =", value, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceNotEqualTo(Integer value) {
            addCriterion("display_sequence <>", value, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceGreaterThan(Integer value) {
            addCriterion("display_sequence >", value, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_sequence >=", value, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceLessThan(Integer value) {
            addCriterion("display_sequence <", value, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceLessThanOrEqualTo(Integer value) {
            addCriterion("display_sequence <=", value, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceIn(List<Integer> values) {
            addCriterion("display_sequence in", values, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceNotIn(List<Integer> values) {
            addCriterion("display_sequence not in", values, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceBetween(Integer value1, Integer value2) {
            addCriterion("display_sequence between", value1, value2, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andDisplaySequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("display_sequence not between", value1, value2, "displaySequence");
            return (Criteria) this;
        }

        public Criteria andPositionIndexIsNull() {
            addCriterion("position_index is null");
            return (Criteria) this;
        }

        public Criteria andPositionIndexIsNotNull() {
            addCriterion("position_index is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIndexEqualTo(Integer value) {
            addCriterion("position_index =", value, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexNotEqualTo(Integer value) {
            addCriterion("position_index <>", value, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexGreaterThan(Integer value) {
            addCriterion("position_index >", value, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_index >=", value, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexLessThan(Integer value) {
            addCriterion("position_index <", value, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexLessThanOrEqualTo(Integer value) {
            addCriterion("position_index <=", value, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexIn(List<Integer> values) {
            addCriterion("position_index in", values, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexNotIn(List<Integer> values) {
            addCriterion("position_index not in", values, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexBetween(Integer value1, Integer value2) {
            addCriterion("position_index between", value1, value2, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("position_index not between", value1, value2, "positionIndex");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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