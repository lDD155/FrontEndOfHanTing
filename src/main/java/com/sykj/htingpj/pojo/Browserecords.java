package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Browserecords
* @description 浏览记录表
* @author Administrator
* @version 2019年3月3日
*/	
import java.util.Date;

public class Browserecords {
    private Integer brid;//主键，自增

    private Integer brtype;//浏览类别(1服务浏览2帖子浏览)

    private Integer userid;//外键，用户编号

    private Integer postid;//外键，帖子编号

    private Integer serviceid;//外键，服务编号

    private Date browsetime;//浏览时间

    public Integer getBrid() {
        return brid;
    }

    public void setBrid(Integer brid) {
        this.brid = brid;
    }

    public Integer getBrtype() {
        return brtype;
    }

    public void setBrtype(Integer brtype) {
        this.brtype = brtype;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Date getBrowsetime() {
        return browsetime;
    }

    public void setBrowsetime(Date browsetime) {
        this.browsetime = browsetime;
    }
}