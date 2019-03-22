package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Complainttype
* @description 投诉类型表
* @author Administrator
* @version 2019年3月3日
*/	
public class Complainttype {
    private Integer ctid;//主键，自增

    private String ctname;//投诉类型名称

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname == null ? null : ctname.trim();
    }
}