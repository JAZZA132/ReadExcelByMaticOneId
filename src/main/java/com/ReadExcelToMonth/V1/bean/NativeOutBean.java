package com.ReadExcelToMonth.V1.bean;

public class NativeOutBean {
    private int nativeSuccess;
    private int nativeFail;
    private int totalNative;
    private int todayNativeSuccess;
    private int todayNativeFail;

    @Override
    public String toString() {
        return "NativeOutBean{" +
                "nativeSuccess=" + nativeSuccess +
                ", nativeFail=" + nativeFail +
                ", totalNative=" + totalNative +
                ", todayNativeSuccess=" + todayNativeSuccess +
                ", todayNativeFail=" + todayNativeFail +
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
