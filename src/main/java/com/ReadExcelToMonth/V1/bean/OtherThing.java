package com.ReadExcelToMonth.V1.bean;

import java.util.Date;

public class OtherThing {
    private String site;
    private int gatewayQuantity;
    private Date date;

    @Override
    public String toString() {
        return "OtherThing{" +
                "site='" + site + '\'' +
                ", gatewayQuantity=" + gatewayQuantity +
                ", date=" + date +
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
