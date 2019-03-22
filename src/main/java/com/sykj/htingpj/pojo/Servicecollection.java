package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Servicecollection
* @description 服务收藏表
* @author Administrator
* @version 2019年3月3日
*/	
import java.util.Date;

public class Servicecollection {
    private Integer sercolleid;//主键，自增

    private Integer serviceid;//外键，服务编号(商品表)

    private Integer userid;//外键，用户编号

    private Date collectiontime;//收藏时间

    public Integer getSercolleid() {
        return sercolleid;
    }

    public void setSercolleid(Integer sercolleid) {
        this.sercolleid = sercolleid;
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

    public Date getCollectiontime() {
        return collectiontime;
    }

    public void setCollectiontime(Date collectiontime) {
        this.collectiontime = collectiontime;
    }
}