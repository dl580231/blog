package com.nuc.blog.entity;

public class RotationChartAmount {
    private Integer amountId;

    private String amount;

    public Integer getAmountId() {
        return amountId;
    }

    public void setAmountId(Integer amountId) {
        this.amountId = amountId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }
}