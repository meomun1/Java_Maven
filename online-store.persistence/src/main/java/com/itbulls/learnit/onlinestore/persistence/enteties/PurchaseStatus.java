package com.itbulls.learnit.onlinestore.persistence.enteties;

public interface PurchaseStatus {
    
    void setId(Integer id);

    Integer getId();

    void setStatusName(String statusName);

    String getStatusName();
}
