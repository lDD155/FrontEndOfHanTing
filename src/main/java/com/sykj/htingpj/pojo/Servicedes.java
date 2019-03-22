package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Integral
* @description 服务描述表
* @author Administrator
* @version 2019年3月3日
*/	
public class Servicedes {
    private Integer servicedesid;//服务描述编号，主键，自增

    private String servicedestitle;//服务描述标题

    private String servicedescontentiourl;//服务描述内容文件路径

    private Integer serviceid;//服务编号，外键，引用服务表

    public Integer getServicedesid() {
        return servicedesid;
    }

    public void setServicedesid(Integer servicedesid) {
        this.servicedesid = servicedesid;
    }

    public String getServicedestitle() {
        return servicedestitle;
    }

    public void setServicedestitle(String servicedestitle) {
        this.servicedestitle = servicedestitle == null ? null : servicedestitle.trim();
    }

    public String getServicedescontentiourl() {
        return servicedescontentiourl;
    }

    public void setServicedescontentiourl(String servicedescontentiourl) {
        this.servicedescontentiourl = servicedescontentiourl == null ? null : servicedescontentiourl.trim();
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }
}