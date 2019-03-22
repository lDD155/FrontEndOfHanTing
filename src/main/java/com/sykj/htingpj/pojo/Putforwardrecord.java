package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Putforwardrecord
 * @description 提现记录表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class Putforwardrecord {
    private Integer pfrid;//主键，自增

    private Integer userid;//外键，用户ID

    private String bankaccount;//银行账号

    private Integer bankid;//外键，银行类别

    private Date submittime;//提交申请时间

    private Date completetime;//完成审核时间

    private Float money;//提现金额

    private String adminopinion;//审批备注

    public Integer getPfrid() {
        return pfrid;
    }

    public void setPfrid(Integer pfrid) {
        this.pfrid = pfrid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getAdminopinion() {
        return adminopinion;
    }

    public void setAdminopinion(String adminopinion) {
        this.adminopinion = adminopinion == null ? null : adminopinion.trim();
    }
}