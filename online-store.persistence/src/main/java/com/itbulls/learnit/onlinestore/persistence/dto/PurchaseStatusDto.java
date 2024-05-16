package com.itbulls.learnit.onlinestore.persistence.dto;

public class PurchaseStatusDto {
    private Integer id;
    private String statusName;

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return this.statusName;
    }
}
