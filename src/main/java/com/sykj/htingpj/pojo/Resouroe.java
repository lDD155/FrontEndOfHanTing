package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Resouroe
* @description 资源类别表
* @author Administrator
* @version 2019年3月3日
*/	
public class Resouroe {
    private Integer resouroeid;//主键，自增

    private String resouroename;//类别名称

    public Integer getResouroeid() {
        return resouroeid;
    }

    public void setResouroeid(Integer resouroeid) {
        this.resouroeid = resouroeid;
    }

    public String getResouroename() {
        return resouroename;
    }

    public void setResouroename(String resouroename) {
        this.resouroename = resouroename == null ? null : resouroename.trim();
    }
}