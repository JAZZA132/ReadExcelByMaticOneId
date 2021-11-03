package com.ReadExcelToMonth.V1.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;


public class OtherThing {
    private String site;
    private int gatewayQuantity;
    private String date;

    @Override
    public String toString() {
        return "OtherThing{" +
                "site='" + site + '\'' +
                ", gatewayQuantity=" + gatewayQuantity +
                ", date='" + date + '\'' +
                '}';
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getGatewayQuantity() {
        return gatewayQuantity;
    }

    public void setGatewayQuantity(int gatewayQuantity) {
        this.gatewayQuantity = gatewayQuantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
