package com.ReadExcelToMonth.V1.bean;

public class ForeignerOutBaen {
    private int foreignerSuccess;
    private int foreignerFail;
    private int totalForeigner;
    private int todayForeignerSuccess;
    private int todayForeignerFail;

    @Override
    public String toString() {
        return "ForeignerOutBaen{" +
                "foreignerSuccess=" + foreignerSuccess +
                ", foreignerFail=" + foreignerFail +
                ", totalForeigner=" + totalForeigner +
                ", todayForeignerSuccess=" + todayForeignerSuccess +
                ", todayForeignerFail=" + todayForeignerFail +
                '}';
    }

    public int getForeignerSuccess() {
        return foreignerSuccess;
    }

    public void setForeignerSuccess(int foreignerSuccess) {
        this.foreignerSuccess = foreignerSuccess;
    }

    public int getForeignerFail() {
        return foreignerFail;
    }

    public void setForeignerFail(int foreignerFail) {
        this.foreignerFail = foreignerFail;
    }

    public int getTotalForeigner() {
        return totalForeigner;
    }

    public void setTotalForeigner(int totalForeigner) {
        this.totalForeigner = totalForeigner;
    }

    public int getTodayForeignerSuccess() {
        return todayForeignerSuccess;
    }

    public void setTodayForeignerSuccess(int todayForeignerSuccess) {
        this.todayForeignerSuccess = todayForeignerSuccess;
    }

    public int getTodayForeignerFail() {
        return todayForeignerFail;
    }

    public void setTodayForeignerFail(int todayForeignerFail) {
        this.todayForeignerFail = todayForeignerFail;
    }
}
