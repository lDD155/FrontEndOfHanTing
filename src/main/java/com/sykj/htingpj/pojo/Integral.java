package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Integral
* @description 积分规格表
* @author Administrator
* @version 2019年3月3日
*/	
public class Integral {
    private Integer integralid;//主键，自增

    private Integer viceid;//递归，父编号

    private String integralname;//规格名称

    private Integer require;//要求达到此次数,才可以加积分

    private Integer integral;//积分

    public Integer getIntegralid() {
        return integralid;
    }

    public void setIntegralid(Integer integralid) {
        this.integralid = integralid;
    }

    public Integer getViceid() {
        return viceid;
    }

    public void setViceid(Integer viceid) {
        this.viceid = viceid;
    }

    public String getIntegralname() {
        return integralname;
    }

    public void setIntegralname(String integralname) {
        this.integralname = integralname == null ? null : integralname.trim();
    }

    public Integer getRequire() {
        return require;
    }

    public void setRequire(Integer require) {
        this.require = require;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}