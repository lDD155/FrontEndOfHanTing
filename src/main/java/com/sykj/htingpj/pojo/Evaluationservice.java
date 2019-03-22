package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Evaluationservice
 * @description 商品(服务)评价表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Evaluationservice {
    private Integer serviceappraiseid;//服务评价编号，主键，自增

    private Integer serviceid;//服务编号，外键，引用服务表

    private Integer userid;//用户编号，外键，引用用户表

    private String serviceappraisecontent;//内容

    private Date serviceappraisedate;//评价时间

    private Integer serviceappraiselevel;//星级

    private Integer serviceappraisepid;//上级编号，0：表示评价，其他：回复评价

    public Integer getServiceappraiseid() {
        return serviceappraiseid;
    }

    public void setServiceappraiseid(Integer serviceappraiseid) {
        this.serviceappraiseid = serviceappraiseid;
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

    public String getServiceappraisecontent() {
        return serviceappraisecontent;
    }

    public void setServiceappraisecontent(String serviceappraisecontent) {
        this.serviceappraisecontent = serviceappraisecontent == null ? null : serviceappraisecontent.trim();
    }

    public Date getServiceappraisedate() {
        return serviceappraisedate;
    }

    public void setServiceappraisedate(Date serviceappraisedate) {
        this.serviceappraisedate = serviceappraisedate;
    }

    public Integer getServiceappraiselevel() {
        return serviceappraiselevel;
    }

    public void setServiceappraiselevel(Integer serviceappraiselevel) {
        this.serviceappraiselevel = serviceappraiselevel;
    }

    public Integer getServiceappraisepid() {
        return serviceappraisepid;
    }

    public void setServiceappraisepid(Integer serviceappraisepid) {
        this.serviceappraisepid = serviceappraisepid;
    }
}