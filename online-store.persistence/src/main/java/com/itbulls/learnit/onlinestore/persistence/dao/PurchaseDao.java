package com.itbulls.learnit.onlinestore.persistence.dao;

import java.util.List;

import com.itbulls.learnit.onlinestore.persistence.dto.PurchaseDto;
import com.itbulls.learnit.onlinestore.persistence.enteties.Purchase;

public interface PurchaseDao {
	
	void savePurchase(PurchaseDto order);

	List<PurchaseDto> getPurchasesByUserId(int userId);
	
	List<PurchaseDto> getPurchases();

	List<PurchaseDto> getNotCompletedPurchase(Integer lastFulfilmentStageId);

	PurchaseDto getPurchaseById(int purchaseId);

	void updatePurchase(PurchaseDto convertPurchaseTPurchaseDto);

}