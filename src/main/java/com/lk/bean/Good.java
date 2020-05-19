package com.lk.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Good {
    private Integer goodid;

    private String goodname;

    private Double goodprice;


    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date goodtime;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Double getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(Double goodprice) {
        this.goodprice = goodprice;
    }

    public Date getGoodtime() {
        return goodtime;
    }

    public void setGoodtime(Date goodtime) {
        this.goodtime = goodtime;
    }
}