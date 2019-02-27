package com.nuc.blog.entity;

import java.util.Date;

public class RotationChart {
    private Integer chartId;

    private String chartContent;

    private Integer showState;

    private Date createTime;

    private Date lastShowTime;

    public Integer getChartId() {
        return chartId;
    }

    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }

    public String getChartContent() {
        return chartContent;
    }

    public void setChartContent(String chartContent) {
        this.chartContent = chartContent == null ? null : chartContent.trim();
    }

    public Integer getShowState() {
        return showState;
    }

    public void setShowState(Integer showState) {
        this.showState = showState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastShowTime() {
        return lastShowTime;
    }

    public void setLastShowTime(Date lastShowTime) {
        this.lastShowTime = lastShowTime;
    }
}