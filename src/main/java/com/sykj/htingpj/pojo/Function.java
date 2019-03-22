package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Function
 * @description 权限表
 * @author Administrator
 * @version 2019年3月3日
 */
public class Function {
    private Integer fid;//主键，自增

    private Integer pid;//父编号，0默认

    private String fname;//权限名称

    private String url;//连接路径

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}