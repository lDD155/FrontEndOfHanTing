package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Serviceintegral
* @description 服务积分表
* @author Administrator
* @version 2019年3月3日
*/	
public class Serviceintegral {
    private Integer serintid;//主键，自增

    private Integer userid;//外键，用户编号

    private Integer stid;//外键，服务类别

    private Integer integral;//积分

    public Integer getSerintid() {
        return serintid;
    }

    public void setSerintid(Integer serintid) {
        this.serintid = serintid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}