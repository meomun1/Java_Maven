package com.itbulls.learnit.onlinestore.persistence.dto;

import java.math.BigDecimal;

public class ProductDto {
	
	private Integer id;
	private String productName;
	private BigDecimal price;
	private CategoryDto categoryDto;
	private String productType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public CategoryDto getCategoryDto() {
		return categoryDto;
	}
	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}
	public String getProductType() {
		return productType;
	}
	public void setProducType(String productType) {
		this.productType = productType;
	}


}