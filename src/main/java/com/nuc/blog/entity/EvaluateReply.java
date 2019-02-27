package com.nuc.blog.entity;

import java.util.Date;

public class EvaluateReply {
    private Integer replyId;

    private Integer evaluateId;

    private Integer replyUserId;

    private Integer beRepliedUserId;

    private String replyContent;

    private Date caeateTime;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public Integer getBeRepliedUserId() {
        return beRepliedUserId;
    }

    public void setBeRepliedUserId(Integer beRepliedUserId) {
        this.beRepliedUserId = beRepliedUserId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Date getCaeateTime() {
        return caeateTime;
    }

    public void setCaeateTime(Date caeateTime) {
        this.caeateTime = caeateTime;
    }
}