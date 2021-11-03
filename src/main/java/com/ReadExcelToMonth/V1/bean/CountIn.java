package com.ReadExcelToMonth.V1.bean;

public class CountIn {
    private int countNativeSuc;
    private int countForeignSuc;
    private int countNativeFail;
    private int countForeignFail;
    private int totalNativeCount;
    private int totalForeignCount;
    private int totalPassengerCount;
    private int todayNativeSucRate;
    private int todayForeignSucRate;
    private int todaySucRate;
    private int todayNativeFailRate;
    private int todayForeignFailRate;
    private int todayFailRate;
    private int gatewayAvgUse;
    private int totalTodayUseCount;

    @Override
    public String toString() {
        return "CountIn{" +
                "countNativeSuc=" + countNativeSuc +
                ", countForeignSuc=" + countForeignSuc +
                ", countNativeFail=" + countNativeFail +
                ", countForeignFail=" + countForeignFail +
                ", totalNativeCount=" + totalNativeCount +
                ", totalForeignCount=" + totalForeignCount +
                ", totalPassengerCount=" + totalPassengerCount +
                ", todayNativeSucRate=" + todayNativeSucRate +
                ", todayForeignSucRate=" + todayForeignSucRate +
                ", todaySucRate=" + todaySucRate +
                ", todayNativeFailRate=" + todayNativeFailRate +
                ", todayForeignFailRate=" + todayForeignFailRate +
                ", todayFailRate=" + todayFailRate +
                ", gatewayAvgUse=" + gatewayAvgUse +
                ", totalTodayUseCount=" + totalTodayUseCount +
                '}';
    }

    public int getCountNativeSuc() {
        return countNativeSuc;
    }

    public void setCountNativeSuc(int countNativeSuc) {
        this.countNativeSuc = countNativeSuc;
    }

    public int getCountForeignSuc() {
        return countForeignSuc;
    }

    public void setCountForeignSuc(int countForeignSuc) {
        this.countForeignSuc = countForeignSuc;
    }

    public int getCountNativeFail() {
        return countNativeFail;
    }

    public void setCountNativeFail(int countNativeFail) {
        this.countNativeFail = countNativeFail;
    }

    public int getCountForeignFail() {
        return countForeignFail;
    }

    public void setCountForeignFail(int countForeignFail) {
        this.countForeignFail = countForeignFail;
    }

    public int getTotalNativeCount() {
        return totalNativeCount;
    }

    public void setTotalNativeCount(int totalNativeCount) {
        this.totalNativeCount = totalNativeCount;
    }

    public int getTotalForeignCount() {
        return totalForeignCount;
    }

    public void setTotalForeignCount(int totalForeignCount) {
        this.totalForeignCount = totalForeignCount;
    }

    public int getTotalPassengerCount() {
        return totalPassengerCount;
    }

    public void setTotalPassengerCount(int totalPassengerCount) {
        this.totalPassengerCount = totalPassengerCount;
    }

    public int getTodayNativeSucRate() {
        return todayNativeSucRate;
    }

    public void setTodayNativeSucRate(int todayNativeSucRate) {
        this.todayNativeSucRate = todayNativeSucRate;
    }

    public int getTodayForeignSucRate() {
        return todayForeignSucRate;
    }

    public void setTodayForeignSucRate(int todayForeignSucRate) {
        this.todayForeignSucRate = todayForeignSucRate;
    }

    public int getTodaySucRate() {
        return todaySucRate;
    }

    public void setTodaySucRate(int todaySucRate) {
        this.todaySucRate = todaySucRate;
    }

    public int getTodayNativeFailRate() {
        return todayNativeFailRate;
    }

    public void setTodayNativeFailRate(int todayNativeFailRate) {
        this.todayNativeFailRate = todayNativeFailRate;
    }

    public int getTodayForeignFailRate() {
        return todayForeignFailRate;
    }

    public void setTodayForeignFailRate(int todayForeignFailRate) {
        this.todayForeignFailRate = todayForeignFailRate;
    }

    public int getTodayFailRate() {
        return todayFailRate;
    }

    public void setTodayFailRate(int todayFailRate) {
        this.todayFailRate = todayFailRate;
    }

    public int getGatewayAvgUse() {
        return gatewayAvgUse;
    }

    public void setGatewayAvgUse(int gatewayAvgUse) {
        this.gatewayAvgUse = gatewayAvgUse;
    }

    public int getTotalTodayUseCount() {
        return totalTodayUseCount;
    }

    public void setTotalTodayUseCount(int totalTodayUseCount) {
        this.totalTodayUseCount = totalTodayUseCount;
    }
}
