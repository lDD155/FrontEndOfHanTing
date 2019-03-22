package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Administratorlog
 * @description 管理员日志表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class Administratorlog {
    private Integer adminlogid;//主键自增

    private Integer adminid;//外键，管理员编号
    
    private String remarks;//备注(以“修改了会员，ID：113”的方式记录)

    private Date remarkstime;//记录时间

    private String remarksip;//做出操作的IP地址

    public Integer getAdminlogid() {
        return adminlogid;
    }

    public void setAdminlogid(Integer adminlogid) {
        this.adminlogid = adminlogid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Date getRemarkstime() {
        return remarkstime;
    }

    public void setRemarkstime(Date remarkstime) {
        this.remarkstime = remarkstime;
    }

    public String getRemarksip() {
        return remarksip;
    }

    public void setRemarksip(String remarksip) {
        this.remarksip = remarksip == null ? null : remarksip.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}