package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Forummanagement
* @description 论坛模块管理表
* @author Administrator
* @version 2019年3月3日
*/	
public class Forummanagement {
    private Integer fmid;//主键，自增

    private Integer pid;//pid递归编号

    private Integer sort;//排序

    private String fmname;//栏目名称

    private Boolean auditstatus;//审核(true需要审核false不需要审核)

    private Boolean giftintegral;//赠送积分(true赠送false不赠送)

    private Integer adminid;//版主

    private Integer servicecopies;//服务份数，用作韩语翻译

    public Integer getFmid() {
        return fmid;
    }

    public void setFmid(Integer fmid) {
        this.fmid = fmid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getFmname() {
        return fmname;
    }

    public void setFmname(String fmname) {
        this.fmname = fmname == null ? null : fmname.trim();
    }

    public Boolean getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Boolean auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Boolean getGiftintegral() {
        return giftintegral;
    }

    public void setGiftintegral(Boolean giftintegral) {
        this.giftintegral = giftintegral;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getServicecopies() {
        return servicecopies;
    }

    public void setServicecopies(Integer servicecopies) {
        this.servicecopies = servicecopies;
    }
}