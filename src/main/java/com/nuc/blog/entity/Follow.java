package com.nuc.blog.entity;

import java.util.Date;

public class Follow {
    private Integer followId;

    private Integer followerId;

    private Integer beFollowerId;

    private Date followTime;

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getFollowerId() {
        return followerId;
    }

    public void setFollowerId(Integer followerId) {
        this.followerId = followerId;
    }

    public Integer getBeFollowerId() {
        return beFollowerId;
    }

    public void setBeFollowerId(Integer beFollowerId) {
        this.beFollowerId = beFollowerId;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }
}