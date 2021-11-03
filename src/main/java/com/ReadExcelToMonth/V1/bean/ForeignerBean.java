package com.ReadExcelToMonth.V1.bean;

public class ForeignerBean {
    private int ForeignerSuccess;

    private int ForeignerFail;

    private int TotalForeigner;

    private int TodayForeignerSuccess;

    private int TodayForeignerFail;

    public int getForeignerSuccess() {
        return ForeignerSuccess;
    }

    public void setForeignerSuccess(int foreignerSuccess) {
        ForeignerSuccess = foreignerSuccess;
    }

    public int getForeignerFail() {
        return ForeignerFail;
    }

    public void setForeignerFail(int foreignerFail) {
        ForeignerFail = foreignerFail;
    }

    public int getTotalForeigner() {
        return TotalForeigner;
    }

    public void setTotalForeigner(int totalForeigner) {
        TotalForeigner = totalForeigner;
    }

    public int getTodayForeignerSuccess() {
        return TodayForeignerSuccess;
    }

    public void setTodayForeignerSuccess(int todayForeignerSuccess) {
        TodayForeignerSuccess = todayForeignerSuccess;
    }

    public int getTodayForeignerFail() {
        return TodayForeignerFail;
    }

    public void setTodayForeignerFail(int todayForeignerFail) {
        TodayForeignerFail = todayForeignerFail;
    }

    @Override
    public String toString() {
        return "ForeignerBean{" +
                "ForeignerSuccess=" + ForeignerSuccess +
                ", ForeignerFail=" + ForeignerFail +
                ", TotalForeigner=" + TotalForeigner +
                ", TodayForeignerSuccess=" + TodayForeignerSuccess +
                ", TodayForeignerFail=" + TodayForeignerFail +
                '}';
    }
}
