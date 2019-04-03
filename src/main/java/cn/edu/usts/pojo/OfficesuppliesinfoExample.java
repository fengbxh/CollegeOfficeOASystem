package cn.edu.usts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficesuppliesinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficesuppliesinfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameIsNull() {
            addCriterion("officeSupplies_name is null");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameIsNotNull() {
            addCriterion("officeSupplies_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameEqualTo(String value) {
            addCriterion("officeSupplies_name =", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameNotEqualTo(String value) {
            addCriterion("officeSupplies_name <>", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameGreaterThan(String value) {
            addCriterion("officeSupplies_name >", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameGreaterThanOrEqualTo(String value) {
            addCriterion("officeSupplies_name >=", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameLessThan(String value) {
            addCriterion("officeSupplies_name <", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameLessThanOrEqualTo(String value) {
            addCriterion("officeSupplies_name <=", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameLike(String value) {
            addCriterion("officeSupplies_name like", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameNotLike(String value) {
            addCriterion("officeSupplies_name not like", value, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameIn(List<String> values) {
            addCriterion("officeSupplies_name in", values, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameNotIn(List<String> values) {
            addCriterion("officeSupplies_name not in", values, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameBetween(String value1, String value2) {
            addCriterion("officeSupplies_name between", value1, value2, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesNameNotBetween(String value1, String value2) {
            addCriterion("officeSupplies_name not between", value1, value2, "officesuppliesName");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountIsNull() {
            addCriterion("officeSupplies_count is null");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountIsNotNull() {
            addCriterion("officeSupplies_count is not null");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountEqualTo(String value) {
            addCriterion("officeSupplies_count =", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountNotEqualTo(String value) {
            addCriterion("officeSupplies_count <>", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountGreaterThan(String value) {
            addCriterion("officeSupplies_count >", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountGreaterThanOrEqualTo(String value) {
            addCriterion("officeSupplies_count >=", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountLessThan(String value) {
            addCriterion("officeSupplies_count <", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountLessThanOrEqualTo(String value) {
            addCriterion("officeSupplies_count <=", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountLike(String value) {
            addCriterion("officeSupplies_count like", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountNotLike(String value) {
            addCriterion("officeSupplies_count not like", value, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountIn(List<String> values) {
            addCriterion("officeSupplies_count in", values, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountNotIn(List<String> values) {
            addCriterion("officeSupplies_count not in", values, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountBetween(String value1, String value2) {
            addCriterion("officeSupplies_count between", value1, value2, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andOfficesuppliesCountNotBetween(String value1, String value2) {
            addCriterion("officeSupplies_count not between", value1, value2, "officesuppliesCount");
            return (Criteria) this;
        }

        public Criteria andProcurementDateIsNull() {
            addCriterion("procurement_date is null");
            return (Criteria) this;
        }

        public Criteria andProcurementDateIsNotNull() {
            addCriterion("procurement_date is not null");
            return (Criteria) this;
        }

        public Criteria andProcurementDateEqualTo(Date value) {
            addCriterion("procurement_date =", value, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateNotEqualTo(Date value) {
            addCriterion("procurement_date <>", value, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateGreaterThan(Date value) {
            addCriterion("procurement_date >", value, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("procurement_date >=", value, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateLessThan(Date value) {
            addCriterion("procurement_date <", value, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateLessThanOrEqualTo(Date value) {
            addCriterion("procurement_date <=", value, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateIn(List<Date> values) {
            addCriterion("procurement_date in", values, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateNotIn(List<Date> values) {
            addCriterion("procurement_date not in", values, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateBetween(Date value1, Date value2) {
            addCriterion("procurement_date between", value1, value2, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andProcurementDateNotBetween(Date value1, Date value2) {
            addCriterion("procurement_date not between", value1, value2, "procurementDate");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
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