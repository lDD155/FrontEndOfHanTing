package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Servicelevel
* @description 服务级别表
* @author Administrator
* @version 2019年3月3日
*/	
public class Servicelevel {
    private Integer serlevelid;//主键，自增

    private String serlevelname;//级别名称(交易额度达到了要求可以更换称号)

    private Integer stid;//外键，服务类别(一级服务)

    private Integer serviceintegralmin;//最低积分

    private Integer serviceintegralmax;//最大积分

    public Integer getSerlevelid() {
        return serlevelid;
    }

    public void setSerlevelid(Integer serlevelid) {
        this.serlevelid = serlevelid;
    }

    public String getSerlevelname() {
        return serlevelname;
    }

    public void setSerlevelname(String serlevelname) {
        this.serlevelname = serlevelname == null ? null : serlevelname.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getServiceintegralmin() {
        return serviceintegralmin;
    }

    public void setServiceintegralmin(Integer serviceintegralmin) {
        this.serviceintegralmin = serviceintegralmin;
    }

    public Integer getServiceintegralmax() {
        return serviceintegralmax;
    }

    public void setServiceintegralmax(Integer serviceintegralmax) {
        this.serviceintegralmax = serviceintegralmax;
    }
}