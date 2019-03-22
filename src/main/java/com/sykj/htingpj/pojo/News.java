package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName News
 * @description 消息表
 * @author Administrator
 * @version 2019年3月3日
 */	
import java.util.Date;

public class News {
    private Integer newsid;//消息编号、主键，自增

    private Integer thesender;//外键，发件人编号

    private Integer addressee;//外键，收件人编号
    
    private String content;//内容

    private Date sendingtime;//发送时间

    private Boolean readstate;//是否已读

    private Integer newstype;//消息类型，1：系统消息，2：站内信

    private Integer messagegroup;//消息组编号

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getThesender() {
        return thesender;
    }

    public void setThesender(Integer thesender) {
        this.thesender = thesender;
    }

    public Integer getAddressee() {
        return addressee;
    }

    public void setAddressee(Integer addressee) {
        this.addressee = addressee;
    }

    public Date getSendingtime() {
        return sendingtime;
    }

    public void setSendingtime(Date sendingtime) {
        this.sendingtime = sendingtime;
    }

    public Boolean getReadstate() {
        return readstate;
    }

    public void setReadstate(Boolean readstate) {
        this.readstate = readstate;
    }

    public Integer getNewstype() {
        return newstype;
    }

    public void setNewstype(Integer newstype) {
        this.newstype = newstype;
    }

    public Integer getMessagegroup() {
        return messagegroup;
    }

    public void setMessagegroup(Integer messagegroup) {
        this.messagegroup = messagegroup;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}