package com.ReadExcelToMonth.V1.bean;

import java.util.List;

public class NativeBean {

    private int nativeSuccess;
    private int nativeFail;
    private int totalNative;
    private int todayNativeSuccess;
    private int todayNativeFail;
    private List<String> nativePeople;

    public List<String> getNativePeople() {
        return nativePeople;
    }

    public void setNativePeople(List<String> nativePeople) {
        this.nativePeople = nativePeople;
    }

    @Override
    public String toString() {
        return "NativeBean{" +
                "nativeSuccess=" + nativeSuccess +
                ", nativeFail=" + nativeFail +
                ", totalNative=" + totalNative +
                ", todayNativeSuccess=" + todayNativeSuccess +
                ", todayNativeFail=" + todayNativeFail +
                ", nativePeople=" + nativePeople +
                '}';
    }

    public int getNativeSuccess() {
        return nativeSuccess;
    }

    public void setNativeSuccess(int nativeSuccess) {
        this.nativeSuccess = nativeSuccess;
    }

    public int getNativeFail() {
        return nativeFail;
    }

    public void setNativeFail(int nativeFail) {
        this.nativeFail = nativeFail;
    }

    public int getTotalNative() {
        return totalNative;
    }

    public void setTotalNative(int totalNative) {
        this.totalNative = totalNative;
    }

    public int getTodayNativeSuccess() {
        return todayNativeSuccess;
    }

    public void setTodayNativeSuccess(int todayNativeSuccess) {
        this.todayNativeSuccess = todayNativeSuccess;
    }

    public int getTodayNativeFail() {
        return todayNativeFail;
    }

    public void setTodayNativeFail(int todayNativeFail) {
        this.todayNativeFail = todayNativeFail;
    }
}
