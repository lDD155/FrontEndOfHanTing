package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Refund
 * @description 退款表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Refund {
	private Integer refundid;//退款编号、主键，自增

	private Integer point;//退款申请指向，1：商家，2：管理员

	private String orderid;//外键，订单编号

	private Integer userid;//外键，用户编号

	private String refundreason;//退款原因

	private String refundexplain;//退款说明
	
	private String refundimg;//退款附带图片

	private Float applyrefundmoney;//申请退款金额

	private Float actualrefundmoney;//实际退款金额

	private Date applicationtime;//申请时间
	
	private String businessremarks;//商家审核备注
	
	private Date audittime;//商家审核时间

	private Integer auditstatus;//商家审核状态(1待审核2审核成功3未通过)

	private String adminremarks;//管理员审核备注

	private Date admintime;//管理员审核时间
	
	private Integer adminstatus;//管理员审核状态(1待审核2审核成功3未通过)

	public String getRefundreason() {
		return refundreason;
	}

	public void setRefundreason(String refundreason) {
		this.refundreason = refundreason == null ? null : refundreason.trim();
	}

	public String getRefundexplain() {
		return refundexplain;
	}

	public void setRefundexplain(String refundexplain) {
		this.refundexplain = refundexplain == null ? null : refundexplain.trim();
	}

	public String getBusinessremarks() {
		return businessremarks;
	}

	public void setBusinessremarks(String businessremarks) {
		this.businessremarks = businessremarks == null ? null : businessremarks.trim();
	}

	public String getAdminremarks() {
		return adminremarks;
	}

	public void setAdminremarks(String adminremarks) {
		this.adminremarks = adminremarks == null ? null : adminremarks.trim();
	}

	public Integer getRefundid() {
		return refundid;
	}

	public void setRefundid(Integer refundid) {
		this.refundid = refundid;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid == null ? null : orderid.trim();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getRefundimg() {
		return refundimg;
	}

	public void setRefundimg(String refundimg) {
		this.refundimg = refundimg == null ? null : refundimg.trim();
	}

	public Float getApplyrefundmoney() {
		return applyrefundmoney;
	}

	public void setApplyrefundmoney(Float applyrefundmoney) {
		this.applyrefundmoney = applyrefundmoney;
	}

	public Float getActualrefundmoney() {
		return actualrefundmoney;
	}

	public void setActualrefundmoney(Float actualrefundmoney) {
		this.actualrefundmoney = actualrefundmoney;
	}

	public Date getApplicationtime() {
		return applicationtime;
	}

	public void setApplicationtime(Date applicationtime) {
		this.applicationtime = applicationtime;
	}

	public Date getAudittime() {
		return audittime;
	}

	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public Date getAdmintime() {
		return admintime;
	}

	public void setAdmintime(Date admintime) {
		this.admintime = admintime;
	}

	public Integer getAdminstatus() {
		return adminstatus;
	}

	public void setAdminstatus(Integer adminstatus) {
		this.adminstatus = adminstatus;
	}
}