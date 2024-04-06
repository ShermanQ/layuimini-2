package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class TrainModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainModelExample() {
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

        public Criteria andModelNameIsNull() {
            addCriterion("modelName is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("modelName is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("modelName =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("modelName <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("modelName >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("modelName >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("modelName <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("modelName <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("modelName like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("modelName not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("modelName in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("modelName not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("modelName between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("modelName not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameIsNull() {
            addCriterion("datasetsName is null");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameIsNotNull() {
            addCriterion("datasetsName is not null");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameEqualTo(String value) {
            addCriterion("datasetsName =", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameNotEqualTo(String value) {
            addCriterion("datasetsName <>", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameGreaterThan(String value) {
            addCriterion("datasetsName >", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameGreaterThanOrEqualTo(String value) {
            addCriterion("datasetsName >=", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameLessThan(String value) {
            addCriterion("datasetsName <", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameLessThanOrEqualTo(String value) {
            addCriterion("datasetsName <=", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameLike(String value) {
            addCriterion("datasetsName like", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameNotLike(String value) {
            addCriterion("datasetsName not like", value, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameIn(List<String> values) {
            addCriterion("datasetsName in", values, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameNotIn(List<String> values) {
            addCriterion("datasetsName not in", values, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameBetween(String value1, String value2) {
            addCriterion("datasetsName between", value1, value2, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andDatasetsNameNotBetween(String value1, String value2) {
            addCriterion("datasetsName not between", value1, value2, "datasetsName");
            return (Criteria) this;
        }

        public Criteria andSelectTIsNull() {
            addCriterion("selectT is null");
            return (Criteria) this;
        }

        public Criteria andSelectTIsNotNull() {
            addCriterion("selectT is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTEqualTo(String value) {
            addCriterion("selectT =", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTNotEqualTo(String value) {
            addCriterion("selectT <>", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTGreaterThan(String value) {
            addCriterion("selectT >", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTGreaterThanOrEqualTo(String value) {
            addCriterion("selectT >=", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTLessThan(String value) {
            addCriterion("selectT <", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTLessThanOrEqualTo(String value) {
            addCriterion("selectT <=", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTLike(String value) {
            addCriterion("selectT like", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTNotLike(String value) {
            addCriterion("selectT not like", value, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTIn(List<String> values) {
            addCriterion("selectT in", values, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTNotIn(List<String> values) {
            addCriterion("selectT not in", values, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTBetween(String value1, String value2) {
            addCriterion("selectT between", value1, value2, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectTNotBetween(String value1, String value2) {
            addCriterion("selectT not between", value1, value2, "selectT");
            return (Criteria) this;
        }

        public Criteria andSelectResNetIsNull() {
            addCriterion("selectResNet is null");
            return (Criteria) this;
        }

        public Criteria andSelectResNetIsNotNull() {
            addCriterion("selectResNet is not null");
            return (Criteria) this;
        }

        public Criteria andSelectResNetEqualTo(String value) {
            addCriterion("selectResNet =", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetNotEqualTo(String value) {
            addCriterion("selectResNet <>", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetGreaterThan(String value) {
            addCriterion("selectResNet >", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetGreaterThanOrEqualTo(String value) {
            addCriterion("selectResNet >=", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetLessThan(String value) {
            addCriterion("selectResNet <", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetLessThanOrEqualTo(String value) {
            addCriterion("selectResNet <=", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetLike(String value) {
            addCriterion("selectResNet like", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetNotLike(String value) {
            addCriterion("selectResNet not like", value, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetIn(List<String> values) {
            addCriterion("selectResNet in", values, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetNotIn(List<String> values) {
            addCriterion("selectResNet not in", values, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetBetween(String value1, String value2) {
            addCriterion("selectResNet between", value1, value2, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectResNetNotBetween(String value1, String value2) {
            addCriterion("selectResNet not between", value1, value2, "selectResNet");
            return (Criteria) this;
        }

        public Criteria andSelectTestIsNull() {
            addCriterion("selectTest is null");
            return (Criteria) this;
        }

        public Criteria andSelectTestIsNotNull() {
            addCriterion("selectTest is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTestEqualTo(String value) {
            addCriterion("selectTest =", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestNotEqualTo(String value) {
            addCriterion("selectTest <>", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestGreaterThan(String value) {
            addCriterion("selectTest >", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestGreaterThanOrEqualTo(String value) {
            addCriterion("selectTest >=", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestLessThan(String value) {
            addCriterion("selectTest <", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestLessThanOrEqualTo(String value) {
            addCriterion("selectTest <=", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestLike(String value) {
            addCriterion("selectTest like", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestNotLike(String value) {
            addCriterion("selectTest not like", value, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestIn(List<String> values) {
            addCriterion("selectTest in", values, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestNotIn(List<String> values) {
            addCriterion("selectTest not in", values, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestBetween(String value1, String value2) {
            addCriterion("selectTest between", value1, value2, "selectTest");
            return (Criteria) this;
        }

        public Criteria andSelectTestNotBetween(String value1, String value2) {
            addCriterion("selectTest not between", value1, value2, "selectTest");
            return (Criteria) this;
        }

        public Criteria andBatchSizeIsNull() {
            addCriterion("batchSize is null");
            return (Criteria) this;
        }

        public Criteria andBatchSizeIsNotNull() {
            addCriterion("batchSize is not null");
            return (Criteria) this;
        }

        public Criteria andBatchSizeEqualTo(String value) {
            addCriterion("batchSize =", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeNotEqualTo(String value) {
            addCriterion("batchSize <>", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeGreaterThan(String value) {
            addCriterion("batchSize >", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeGreaterThanOrEqualTo(String value) {
            addCriterion("batchSize >=", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeLessThan(String value) {
            addCriterion("batchSize <", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeLessThanOrEqualTo(String value) {
            addCriterion("batchSize <=", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeLike(String value) {
            addCriterion("batchSize like", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeNotLike(String value) {
            addCriterion("batchSize not like", value, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeIn(List<String> values) {
            addCriterion("batchSize in", values, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeNotIn(List<String> values) {
            addCriterion("batchSize not in", values, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeBetween(String value1, String value2) {
            addCriterion("batchSize between", value1, value2, "batchSize");
            return (Criteria) this;
        }

        public Criteria andBatchSizeNotBetween(String value1, String value2) {
            addCriterion("batchSize not between", value1, value2, "batchSize");
            return (Criteria) this;
        }

        public Criteria andEpochsIsNull() {
            addCriterion("epochs is null");
            return (Criteria) this;
        }

        public Criteria andEpochsIsNotNull() {
            addCriterion("epochs is not null");
            return (Criteria) this;
        }

        public Criteria andEpochsEqualTo(String value) {
            addCriterion("epochs =", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsNotEqualTo(String value) {
            addCriterion("epochs <>", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsGreaterThan(String value) {
            addCriterion("epochs >", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsGreaterThanOrEqualTo(String value) {
            addCriterion("epochs >=", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsLessThan(String value) {
            addCriterion("epochs <", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsLessThanOrEqualTo(String value) {
            addCriterion("epochs <=", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsLike(String value) {
            addCriterion("epochs like", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsNotLike(String value) {
            addCriterion("epochs not like", value, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsIn(List<String> values) {
            addCriterion("epochs in", values, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsNotIn(List<String> values) {
            addCriterion("epochs not in", values, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsBetween(String value1, String value2) {
            addCriterion("epochs between", value1, value2, "epochs");
            return (Criteria) this;
        }

        public Criteria andEpochsNotBetween(String value1, String value2) {
            addCriterion("epochs not between", value1, value2, "epochs");
            return (Criteria) this;
        }

        public Criteria andSgdoradamIsNull() {
            addCriterion("sgdoradam is null");
            return (Criteria) this;
        }

        public Criteria andSgdoradamIsNotNull() {
            addCriterion("sgdoradam is not null");
            return (Criteria) this;
        }

        public Criteria andSgdoradamEqualTo(String value) {
            addCriterion("sgdoradam =", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamNotEqualTo(String value) {
            addCriterion("sgdoradam <>", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamGreaterThan(String value) {
            addCriterion("sgdoradam >", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamGreaterThanOrEqualTo(String value) {
            addCriterion("sgdoradam >=", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamLessThan(String value) {
            addCriterion("sgdoradam <", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamLessThanOrEqualTo(String value) {
            addCriterion("sgdoradam <=", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamLike(String value) {
            addCriterion("sgdoradam like", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamNotLike(String value) {
            addCriterion("sgdoradam not like", value, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamIn(List<String> values) {
            addCriterion("sgdoradam in", values, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamNotIn(List<String> values) {
            addCriterion("sgdoradam not in", values, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamBetween(String value1, String value2) {
            addCriterion("sgdoradam between", value1, value2, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andSgdoradamNotBetween(String value1, String value2) {
            addCriterion("sgdoradam not between", value1, value2, "sgdoradam");
            return (Criteria) this;
        }

        public Criteria andGpu_numsIsNull() {
            addCriterion("gpu_nums is null");
            return (Criteria) this;
        }

        public Criteria andGpu_numsIsNotNull() {
            addCriterion("gpu_nums is not null");
            return (Criteria) this;
        }

        public Criteria andGpu_numsEqualTo(String value) {
            addCriterion("gpu_nums =", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsNotEqualTo(String value) {
            addCriterion("gpu_nums <>", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsGreaterThan(String value) {
            addCriterion("gpu_nums >", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsGreaterThanOrEqualTo(String value) {
            addCriterion("gpu_nums >=", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsLessThan(String value) {
            addCriterion("gpu_nums <", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsLessThanOrEqualTo(String value) {
            addCriterion("gpu_nums <=", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsLike(String value) {
            addCriterion("gpu_nums like", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsNotLike(String value) {
            addCriterion("gpu_nums not like", value, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsIn(List<String> values) {
            addCriterion("gpu_nums in", values, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsNotIn(List<String> values) {
            addCriterion("gpu_nums not in", values, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsBetween(String value1, String value2) {
            addCriterion("gpu_nums between", value1, value2, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andGpu_numsNotBetween(String value1, String value2) {
            addCriterion("gpu_nums not between", value1, value2, "gpu_nums");
            return (Criteria) this;
        }

        public Criteria andLearningRateIsNull() {
            addCriterion("learningRate is null");
            return (Criteria) this;
        }

        public Criteria andLearningRateIsNotNull() {
            addCriterion("learningRate is not null");
            return (Criteria) this;
        }

        public Criteria andLearningRateEqualTo(String value) {
            addCriterion("learningRate =", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateNotEqualTo(String value) {
            addCriterion("learningRate <>", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateGreaterThan(String value) {
            addCriterion("learningRate >", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateGreaterThanOrEqualTo(String value) {
            addCriterion("learningRate >=", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateLessThan(String value) {
            addCriterion("learningRate <", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateLessThanOrEqualTo(String value) {
            addCriterion("learningRate <=", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateLike(String value) {
            addCriterion("learningRate like", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateNotLike(String value) {
            addCriterion("learningRate not like", value, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateIn(List<String> values) {
            addCriterion("learningRate in", values, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateNotIn(List<String> values) {
            addCriterion("learningRate not in", values, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateBetween(String value1, String value2) {
            addCriterion("learningRate between", value1, value2, "learningRate");
            return (Criteria) this;
        }

        public Criteria andLearningRateNotBetween(String value1, String value2) {
            addCriterion("learningRate not between", value1, value2, "learningRate");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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