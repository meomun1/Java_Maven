package com.itbulls.learnit.onlinestore.persistence.dto.converter;

import java.util.ArrayList;
import java.util.List;

import com.itbulls.learnit.onlinestore.persistence.dto.CategoryDto;
import com.itbulls.learnit.onlinestore.persistence.enteties.Category;
import com.itbulls.learnit.onlinestore.persistence.enteties.impl.DefaultCategory;

public class CategoryDtoToCategoryConverter {

	public CategoryDto convertCategoryNameToCategoryDtoWithOnlyName(String categoryName) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setCategoryName(categoryName);
		return categoryDto;
	}

	public List<Category> convertCategoryDtosToCategories(List<CategoryDto> categoryDtos){
		List<Category> categories = new ArrayList<>();

		for(CategoryDto categoryDto : categoryDtos){
			categories.add(convertCategoryDtoToCategory(categoryDto));
		}

		return categories;
	}

	public Category convertCategoryDtoToCategory(CategoryDto categoryDto){
		DefaultCategory category = new DefaultCategory();
		category.setId(categoryDto.getId());
		category.setCategoryName(categoryDto.getCategoryName());
		category.setImgName(categoryDto.getImgName());
		return category;
	}

}