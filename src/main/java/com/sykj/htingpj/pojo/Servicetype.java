package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Servicetype
* @description 服务类别表
* @author Administrator
* @version 2019年3月3日
*/	
public class Servicetype {
    private Integer stid;//主键，自增

    private Integer stpid;//递归编号(父ID)

    private String stname;//服务名称

    private Integer sort;//排序(层次作用 默认0 0是一级服务 以此类推)

    private Boolean display;//是否显示

    private Integer operationtime;//未操作时间

    private Integer confirmtime;//自动确认时间

    private Integer violatednumber;//服务违约天数

    private Integer proportion;//违约金比例

    private Boolean toexamine;//是否审核tinyint(1)

    private String advertisement;//广告图片地址

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getStpid() {
        return stpid;
    }

    public void setStpid(Integer stpid) {
        this.stpid = stpid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Integer getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Integer operationtime) {
        this.operationtime = operationtime;
    }

    public Integer getConfirmtime() {
        return confirmtime;
    }

    public void setConfirmtime(Integer confirmtime) {
        this.confirmtime = confirmtime;
    }

    public Integer getViolatednumber() {
        return violatednumber;
    }

    public void setViolatednumber(Integer violatednumber) {
        this.violatednumber = violatednumber;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }

    public Boolean getToexamine() {
        return toexamine;
    }

    public void setToexamine(Boolean toexamine) {
        this.toexamine = toexamine;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement == null ? null : advertisement.trim();
    }
}