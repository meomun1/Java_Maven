package com.itbulls.learnit.onlinestore.core.facades.impl;

import java.util.List;
import com.itbulls.learnit.onlinestore.persistence.dao.ProductDao;
import com.itbulls.learnit.onlinestore.core.facades.ProductFacade;
import com.itbulls.learnit.onlinestore.persistence.dao.impl.MySqlJdbcProductDao;
import com.itbulls.learnit.onlinestore.persistence.dto.converter.ProductDtoToProductConverter;
import com.itbulls.learnit.onlinestore.persistence.enteties.Product;

public class DefaultProductFacade implements ProductFacade {

    private static DefaultProductFacade instance;
    private ProductDao productDao = new MySqlJdbcProductDao();
    private ProductDtoToProductConverter productConverter = new ProductDtoToProductConverter();

    public static synchronized DefaultProductFacade getInstance() {
        if (instance == null) {
            instance = new DefaultProductFacade();
        }

        return instance;
    }
    

    @Override
    public List<Product> getProductsLikeName(String searchQuery) {
        // TODO Auto-generated method stub
        return productConverter.convertProductDtosToProducts(productDao.getProductsLikeName(searchQuery));
    }

    @Override
    public List<Product> getProductsByCategoryId(Integer id) {
        return productConverter.convertProductDtosToProducts(productDao.getProductsByCategoryId(id));
    }

    @Override
    public List<Product> getProductsByCategoryIdForPageWithLimit(Integer categoryId, Integer page,
            Integer paginationLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByCategoryIdForPageWithLimit'");
    }

    @Override
    public Integer getNumberOfPagesForCategory(Integer categoryId, Integer paginationLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfPagesForCategory'");
    }

    @Override
    public Integer getNumberOfPagesForSearch(String searchQuery, Integer paginationLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfPagesForSearch'");
    }

    @Override
    public List<Product> getProductsLikeNameForPageWithLimit(String searchQuery, Integer page,
            Integer paginationLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsLikeNameForPageWithLimit'");
    }

    @Override
    public Product getProductById(Integer parameter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    @Override
    public Product getProductByGuid(String guid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductByGuid'");
    }
    
}
