package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Rolefunction
 * @description 角色权限绑定表
 * @author Administrator
 * @version 2019年3月3日
 */		
public class Rolefunction {
    private Integer rfid;//主键，自增

    private Integer roleid;//外键，角色编号

    private Integer fid;//外键，权限表

    public Integer getRfid() {
        return rfid;
    }

    public void setRfid(Integer rfid) {
        this.rfid = rfid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}