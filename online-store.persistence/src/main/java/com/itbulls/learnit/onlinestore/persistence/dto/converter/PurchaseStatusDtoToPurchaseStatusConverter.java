package com.itbulls.learnit.onlinestore.persistence.dto.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.itbulls.learnit.onlinestore.persistence.dto.PurchaseStatusDto;
import com.itbulls.learnit.onlinestore.persistence.enteties.PurchaseStatus;
import com.itbulls.learnit.onlinestore.persistence.enteties.impl.DefaultPurchaseStatus;

public class PurchaseStatusDtoToPurchaseStatusConverter {
    
    public PurchaseStatus convertPurchaseStatusDtoToPurchaseStatus(PurchaseStatusDto purchaseStatusDto) {
        PurchaseStatus purchaseStatus = new DefaultPurchaseStatus();
        purchaseStatus.setId(purchaseStatusDto.getId());
        purchaseStatus.setStatusName(purchaseStatusDto.getStatusName());
        return purchaseStatus;
    }

    public PurchaseStatusDto convertPurchaseStatusToPurchaseStatusDto(PurchaseStatus purchaseStatus) {
        PurchaseStatusDto purchaseStatusDto = new PurchaseStatusDto();
        purchaseStatusDto.setId(purchaseStatus.getId());
        purchaseStatusDto.setStatusName(purchaseStatus.getStatusName());
        return purchaseStatusDto;
    }

    public List<PurchaseStatus> convertPurchaseStatusDtoToPurchaseStatus(List<PurchaseStatusDto> purchaseStatusDtos) {
        return purchaseStatusDtos.stream()
                .map(this::convertPurchaseStatusDtoToPurchaseStatus)
                .collect(Collectors.toList());
    }

}
