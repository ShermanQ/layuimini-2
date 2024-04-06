package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainModel implements Serializable {
    private Integer id;

    private String modelName;

    private String date;

    private String datasetsName;

    private String selectT;

    private String selectResNet;

    private String selectTest;

    private String batchSize;

    private String epochs;

    private String sgdoradam;

    private String gpu_nums;

    private String learningRate;

    private String mail;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getDatasetsName() {
        return datasetsName;
    }

    public void setDatasetsName(String datasetsName) {
        this.datasetsName = datasetsName == null ? null : datasetsName.trim();
    }

    public String getSelectT() {
        return selectT;
    }

    public void setSelectT(String selectT) {
        this.selectT = selectT == null ? null : selectT.trim();
    }

    public String getSelectResNet() {
        return selectResNet;
    }

    public void setSelectResNet(String selectResNet) {
        this.selectResNet = selectResNet == null ? null : selectResNet.trim();
    }

    public String getSelectTest() {
        return selectTest;
    }

    public void setSelectTest(String selectTest) {
        this.selectTest = selectTest == null ? null : selectTest.trim();
    }

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize == null ? null : batchSize.trim();
    }

    public String getEpochs() {
        return epochs;
    }

    public void setEpochs(String epochs) {
        this.epochs = epochs == null ? null : epochs.trim();
    }

    public String getSgdoradam() {
        return sgdoradam;
    }

    public void setSgdoradam(String sgdoradam) {
        this.sgdoradam = sgdoradam == null ? null : sgdoradam.trim();
    }

    public String getGpu_nums() {
        return gpu_nums;
    }

    public void setGpu_nums(String gpu_nums) {
        this.gpu_nums = gpu_nums == null ? null : gpu_nums.trim();
    }

    public String getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(String learningRate) {
        this.learningRate = learningRate == null ? null : learningRate.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}