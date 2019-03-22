package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Complaint
 * @description 帖子投诉表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Complaint {
    private Integer cid;//主键，自增

    private Integer posting;//外键，发帖人编号

    private Integer pcid;//外键，外键，帖子编号

    private Integer userid;//外键，投诉人编号

    private Integer ctid;//外键，投诉类型编号

    private Date timeofcomplaint;//举报时间

    private Integer auditstatus;//审核状态(1待审核2审核成功3未通过)

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPosting() {
        return posting;
    }

    public void setPosting(Integer posting) {
        this.posting = posting;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Date getTimeofcomplaint() {
        return timeofcomplaint;
    }

    public void setTimeofcomplaint(Date timeofcomplaint) {
        this.timeofcomplaint = timeofcomplaint;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}