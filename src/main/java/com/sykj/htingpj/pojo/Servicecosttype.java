package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Servicecosttype
* @description 服务费用类型表
* @author Administrator
* @version 2019年3月3日
*/	
public class Servicecosttype {
    private Integer servicecosttypeid;//服务费用类型编号，主键，自增

    private String servicecosttypename;//服务费用类型名称

    private Integer stid;//服务类别编号，外键

    public Integer getServicecosttypeid() {
        return servicecosttypeid;
    }

    public void setServicecosttypeid(Integer servicecosttypeid) {
        this.servicecosttypeid = servicecosttypeid;
    }

    public String getServicecosttypename() {
        return servicecosttypename;
    }

    public void setServicecosttypename(String servicecosttypename) {
        this.servicecosttypename = servicecosttypename == null ? null : servicecosttypename.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }
}