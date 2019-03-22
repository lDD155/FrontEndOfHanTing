package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Languagetype
* @description 服务语言表
* @author Administrator
* @version 2019年3月3日
*/	
public class Languagetype {
    private Integer languageid;//语言编号，主键，自增列

    private String languagename;//语言名称

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    public String getLanguagename() {
        return languagename;
    }

    public void setLanguagename(String languagename) {
        this.languagename = languagename == null ? null : languagename.trim();
    }
}