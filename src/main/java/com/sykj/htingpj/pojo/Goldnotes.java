package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Goldnotes
 * @description 金币流向操作记录表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class Goldnotes {
    private Integer recordid;//记录编号，主键，自增

    private Integer userid;//外键，用户编号

    private Integer acquisitionmode;//(1预定服务2服务收益3取消物流订单4其他5充值6线下充值7退款8提现)

    private Date recorddate;//记录日期

    private String recorddescribe;//记录描述

    private Float recordinandout;//记录收入，支出

    private Integer auditstatus;//审核状态(1待审核2审核成功3未通过)

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAcquisitionmode() {
        return acquisitionmode;
    }

    public void setAcquisitionmode(Integer acquisitionmode) {
        this.acquisitionmode = acquisitionmode;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public String getRecorddescribe() {
        return recorddescribe;
    }

    public void setRecorddescribe(String recorddescribe) {
        this.recorddescribe = recorddescribe == null ? null : recorddescribe.trim();
    }

    public Float getRecordinandout() {
        return recordinandout;
    }

    public void setRecordinandout(Float recordinandout) {
        this.recordinandout = recordinandout;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}