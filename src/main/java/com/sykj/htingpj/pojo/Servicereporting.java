package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Servicereporting
 * @description 商家举报表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class Servicereporting {
    private Integer srid;//主键，自增

    private Integer businessid;//外键，商家编号

    private Integer serviceid;//外键，商家发布服务编号

    private Integer userid;//外键，举报人编号

    private Integer ctid;//外键，举报类别编号

    private Date timeofcomplaint;//举报时间

    private Date audittime;//审核时间

    private Integer auditstatus;//审核状态(1待审核2审批通过3审批未通过)

    public Integer getSrid() {
        return srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
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