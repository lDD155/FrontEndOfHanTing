package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Postcollection
 * @description 帖子收藏表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Postcollection {
    private Integer collectionid;//主键，自增

    private Integer pcid;//外键，帖子编号

    private Integer userid;//外键，用户编号

    private Date collectiontime;//收藏时间

    public Integer getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(Integer collectionid) {
        this.collectionid = collectionid;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
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