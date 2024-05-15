package com.itbulls.learnit.onlinestore.core.facades.impl;

import java.util.List;

import com.itbulls.learnit.onlinestore.core.facades.CategoryFacade;
import com.itbulls.learnit.onlinestore.persistence.dao.CategoryDao;
import com.itbulls.learnit.onlinestore.persistence.dao.impl.MySqlJdbcCategoryDao;
import com.itbulls.learnit.onlinestore.persistence.dto.converter.CategoryDtoToCategoryConverter;
import com.itbulls.learnit.onlinestore.persistence.enteties.Category;

public class DefaultCategoryFacade implements CategoryFacade {

    private static DefaultCategoryFacade instance;

    private CategoryDao categoryDao = new MySqlJdbcCategoryDao(); // to access DAO
    private CategoryDtoToCategoryConverter categoryConverter = new CategoryDtoToCategoryConverter(); // to convert DTO to entity

    public static synchronized DefaultCategoryFacade getInstance() { // singleton pattern
		if (instance == null) {
			instance = new DefaultCategoryFacade(); 
		}

		return instance;
	}

    @Override
    public List<Category> getCategories() {
        // TODO Auto-generated method stub
        // return categoryConverter.
        return null;
    }
    
}
