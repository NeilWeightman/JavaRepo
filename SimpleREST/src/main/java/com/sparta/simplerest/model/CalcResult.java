package com.sparta.simplerest.model;

public class CalcResult {
    private int param1;
    private int param2;
    private int result;
    private String operation;

    public CalcResult(int param1, int param2, int result, String operation) {
        this.param1 = param1;
        this.param2 = param2;
        this.result = result;
        this.operation = operation;
    }

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
