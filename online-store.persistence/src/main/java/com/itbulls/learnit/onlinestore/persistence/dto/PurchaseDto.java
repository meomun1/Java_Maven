package com.itbulls.learnit.onlinestore.persistence.dto;

import java.util.List;

public class PurchaseDto {
	
	private Integer id;
	private UserDto userDto;
	private List<ProductDto> productDtos;
	private String imgName;
	private String description;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	public List<ProductDto> getProductDtos() {
		return productDtos;
	}
	public void setProductDtos(List<ProductDto> productDtos) {
		this.productDtos = productDtos;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgName() {
		return this.imgName;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

}