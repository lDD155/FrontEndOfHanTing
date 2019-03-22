package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Trusteeship
* @description 托管申请表
* @author Administrator
* @version 2019年3月3日
*/	
import java.util.Date;

public class Trusteeship {
    private Integer truid;//主键，自增

    private Integer userid;//外键，用户编号

    private Date applicationtime;//申请时间

    private Integer trusteeshipmonth;//托管月数

    private Date audittime;//审核时间

    private Integer auditstatus;//审核状态(1待审核2审核通过3拒绝)

    public Integer getTruid() {
        return truid;
    }

    public void setTruid(Integer truid) {
        this.truid = truid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getApplicationtime() {
        return applicationtime;
    }

    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    public Integer getTrusteeshipmonth() {
        return trusteeshipmonth;
    }

    public void setTrusteeshipmonth(Integer trusteeshipmonth) {
        this.trusteeshipmonth = trusteeshipmonth;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}