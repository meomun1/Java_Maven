package com.itbulls.learnit.onlinestore.persistence.dao;

import com.itbulls.learnit.onlinestore.persistence.dto.PurchaseStatusDto;
import com.itbulls.learnit.onlinestore.persistence.enteties.PurchaseStatus;

public interface PurchaseStatusDao {

    PurchaseStatusDto getPurchaseStatusById(Integer id);

}
