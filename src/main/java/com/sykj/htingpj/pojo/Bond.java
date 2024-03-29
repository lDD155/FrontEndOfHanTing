package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Bond
 * @description 保证金表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Bond {
    private Integer bid;//主键，自增

    private Integer userid;//用户ID

    private Integer bondtype;//获取方式(1充值2线下充值)

    private Float goldcoin;//操作(-100|+100)

    private Date submittime;//审核备注

    private Date completetime;//提交申请时间

    private Integer auditstatus;//完成审核时间

    private String reviewnotes;//审核状态(1待审核2审核成功3未通过)

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBondtype() {
        return bondtype;
    }

    public void setBondtype(Integer bondtype) {
        this.bondtype = bondtype;
    }

    public Float getGoldcoin() {
        return goldcoin;
    }

    public void setGoldcoin(Float goldcoin) {
        this.goldcoin = goldcoin;
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

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getReviewnotes() {
        return reviewnotes;
    }

    public void setReviewnotes(String reviewnotes) {
        this.reviewnotes = reviewnotes == null ? null : reviewnotes.trim();
    }
}