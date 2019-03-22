package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Postfabulous
 * @description 帖子点赞表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Postfabulous {
    private Integer postfab;//主键，自增

    private Integer userid;//外键，用户编号

    private Integer postid;//外键，帖子编号

    private Date fabuloustime;//点赞时间

    public Integer getPostfab() {
        return postfab;
    }

    public void setPostfab(Integer postfab) {
        this.postfab = postfab;
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

    public Date getFabuloustime() {
        return fabuloustime;
    }

    public void setFabuloustime(Date fabuloustime) {
        this.fabuloustime = fabuloustime;
    }
}