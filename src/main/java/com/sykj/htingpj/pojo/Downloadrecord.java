package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Downloadrecord
* @description 下载记录表
* @author Administrator
* @version 2019年3月3日
*/	
import java.util.Date;

public class Downloadrecord {
    private Integer drid;//主键，自增

    private Integer userid;//外键，用户编号

    private Integer postid;//外键，帖子编号

    private Date downloadtime;//下载时间

    public Integer getDrid() {
        return drid;
    }

    public void setDrid(Integer drid) {
        this.drid = drid;
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

    public Date getDownloadtime() {
        return downloadtime;
    }

    public void setDownloadtime(Date downloadtime) {
        this.downloadtime = downloadtime;
    }
}