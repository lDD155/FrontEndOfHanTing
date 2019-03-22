package com.sykj.htingpj.pojo;
/**
 * 
 * @ClassName Postcomment
 * @description 帖子评论表
 * @author Administrator
 * @version 2019年3月3日
 */
import java.util.Date;

public class Postcomment {
    private Integer pcid;//主键，自增

    private Integer postid;//帖子ID

    private Integer commentator;//外键，评论人ID

    private Integer pid;//递归ID(pid)

    private String content;//评论内容

    private Date reviewtime;//评论时间

    private Integer operatingstate;//操作状态(1未删除2已删除)

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getCommentator() {
        return commentator;
    }

    public void setCommentator(Integer commentator) {
        this.commentator = commentator;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

    public Integer getOperatingstate() {
        return operatingstate;
    }

    public void setOperatingstate(Integer operatingstate) {
        this.operatingstate = operatingstate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}