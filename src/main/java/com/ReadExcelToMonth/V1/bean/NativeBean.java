package com.ReadExcelToMonth.V1.bean;

public class NativeBean {

    private int NativeSuccess;

    private int NativeFail;

    private int TotalNative;

    private int TodayNativeSuccess;

    private int TodayNativeFail;

    public int getNativeSuccess() {
        return NativeSuccess;
    }

    public void setNativeSuccess(int nativeSuccess) {
        NativeSuccess = nativeSuccess;
    }

    public int getNativeFail() {
        return NativeFail;
    }

    public void setNativeFail(int nativeFail) {
        NativeFail = nativeFail;
    }

    public int getTotalNative() {
        return TotalNative;
    }

    public void setTotalNative(int totalNative) {
        TotalNative = totalNative;
    }

    public int getTodayNativeSuccess() {
        return TodayNativeSuccess;
    }

    public void setTodayNativeSuccess(int todayNativeSuccess) {
        TodayNativeSuccess = todayNativeSuccess;
    }

    public int getTodayNativeFail() {
        return TodayNativeFail;
    }

    public void setTodayNativeFail(int todayNativeFail) {
        TodayNativeFail = todayNativeFail;
    }

    @Override
    public String toString() {
        return "NativeBean{" +
                "NativeSuccess=" + NativeSuccess +
                ", NativeFail=" + NativeFail +
                ", TotalNative=" + TotalNative +
                ", TodayNativeSuccess=" + TodayNativeSuccess +
                ", TodayNativeFail=" + TodayNativeFail +
                '}';
    }
}
