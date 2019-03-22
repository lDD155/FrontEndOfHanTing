package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Role
 * @description 帖子投诉表
 * @author Administrator
 * @version 2019年3月3日
 */
public class Role {
    private Integer roleid;//主键，自增

    private String rolename;//角色名称

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}