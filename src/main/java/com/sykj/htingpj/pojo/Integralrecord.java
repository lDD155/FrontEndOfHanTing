package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Integralrecord
 * @description 积分流向操作记录表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class Integralrecord {
    private Integer irid;//记录编号，主键，自增

    private Integer userid;//外键，用户编号

    private Date irdate;//记录日期

    private String irdescribe;//记录描述

    private Integer recordinandout;//记录积分(-|+)

    private Integer integralid;//外键，积分规格表

    private Integer auditstatus;//审核状态(1待审核2审核成功3未通过)

    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getIrdate() {
        return irdate;
    }

    public void setIrdate(Date irdate) {
        this.irdate = irdate;
    }

    public String getIrdescribe() {
        return irdescribe;
    }

    public void setIrdescribe(String irdescribe) {
        this.irdescribe = irdescribe == null ? null : irdescribe.trim();
    }

    public Integer getRecordinandout() {
        return recordinandout;
    }

    public void setRecordinandout(Integer recordinandout) {
        this.recordinandout = recordinandout;
    }

    public Integer getIntegralid() {
        return integralid;
    }

    public void setIntegralid(Integer integralid) {
        this.integralid = integralid;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}