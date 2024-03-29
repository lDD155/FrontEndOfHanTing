package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Messagefeedback
 * @description 留言反馈表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class Messagefeedback {
    private Integer mfid;//主键，序号，自增列

    private String mfname;//姓名

    private String mfphone;//电话

    private String mfemail;//邮箱

    private String mfcontent;//内容，具体需求

    private String mfjointheway;//加盟方式

    private Date mfdate;//留言时间

    public Integer getMfid() {
        return mfid;
    }

    public void setMfid(Integer mfid) {
        this.mfid = mfid;
    }

    public String getMfname() {
        return mfname;
    }

    public void setMfname(String mfname) {
        this.mfname = mfname == null ? null : mfname.trim();
    }

    public String getMfphone() {
        return mfphone;
    }

    public void setMfphone(String mfphone) {
        this.mfphone = mfphone == null ? null : mfphone.trim();
    }

    public String getMfemail() {
        return mfemail;
    }

    public void setMfemail(String mfemail) {
        this.mfemail = mfemail == null ? null : mfemail.trim();
    }

    public String getMfcontent() {
        return mfcontent;
    }

    public void setMfcontent(String mfcontent) {
        this.mfcontent = mfcontent == null ? null : mfcontent.trim();
    }

    public String getMfjointheway() {
        return mfjointheway;
    }

    public void setMfjointheway(String mfjointheway) {
        this.mfjointheway = mfjointheway == null ? null : mfjointheway.trim();
    }

    public Date getMfdate() {
        return mfdate;
    }

    public void setMfdate(Date mfdate) {
        this.mfdate = mfdate;
    }
}