package com.itbulls.learnit.onlinestore.persistence.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itbulls.learnit.onlinestore.persistence.dao.CategoryDao;
import com.itbulls.learnit.onlinestore.persistence.dao.ProductDao;
import com.itbulls.learnit.onlinestore.persistence.dto.ProductDto;
import com.itbulls.learnit.onlinestore.persistence.utils.db.DBUtils;

public class MySqlJdbcProductDao implements ProductDao {

	private CategoryDao categoryDao;

	{
		categoryDao = new MySqlJdbcCategoryDao();
	}

	@Override
	public List<ProductDto> getProducts() {
		try (var conn = DBUtils.getConnection();
				var ps = conn.prepareStatement("SELECT * FROM product");
				var rs = ps.executeQuery()) {
			List<ProductDto> products = new ArrayList<>();

			while (rs.next()) {
				ProductDto product = new ProductDto();
				product.setId(rs.getInt("id"));
				product.setProductName(rs.getString("product_name"));
				product.setPrice(rs.getBigDecimal("price"));
				product.setCategoryDto(categoryDao.getCategoryByCategoryId(rs.getInt("category_id")));
				product.setProducType(rs.getString("product_type"));
				products.add(product);
			}

			return products;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductDto getProductById(int productId) {
		try (var conn = DBUtils.getConnection();
				var ps = conn.prepareStatement("SELECT * FROM product WHERE id = ?")) {

			ps.setInt(1, productId);
			try (var rs = ps.executeQuery()) {

				if (rs.next()) {
					ProductDto product = new ProductDto();
					product.setId(rs.getInt("id"));
					product.setProductName(rs.getString("product_name"));
					product.setPrice(rs.getBigDecimal("price"));
					product.setCategoryDto(categoryDao.getCategoryByCategoryId(rs.getInt("category_id")));
					product.setProducType(rs.getString("product_type"));
					return product;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<ProductDto> getProductsLikeName(String searchQuery) {

		String lowercaseString = searchQuery.toLowerCase();
		// TODO Auto-generated method stub
		try(var conn = DBUtils.getConnection();
				var ps = conn.prepareStatement("SELECT * FROM product WHERE product_type LIKE ?")) {
			ps.setString(1, "%" + lowercaseString + "%");
			List<ProductDto> products = new ArrayList<>();
			try (var rs = ps.executeQuery()) {
				while (rs.next()) {
					ProductDto product = new ProductDto();
					product.setId(rs.getInt("id"));
					product.setProductName(rs.getString("product_name"));
					product.setPrice(rs.getBigDecimal("price"));
					product.setCategoryDto(categoryDao.getCategoryByCategoryId(rs.getInt("category_id")));
					product.setProducType(rs.getString("product_type"));
					products.add(product);
				}
			}
			return products;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductDto> getProductsByCategoryId(Integer categoryId) {
		// TODO Auto-generated method stub
		try (var conn = DBUtils.getConnection();
				var ps = conn.prepareStatement("SELECT * FROM product WHERE category_id = ?")) {

			ps.setInt(1, categoryId);
			List<ProductDto> products = new ArrayList<>();
			try (var rs = ps.executeQuery()) {
				while (rs.next()) {
					ProductDto product = new ProductDto();
					product.setId(rs.getInt("id"));
					product.setProductName(rs.getString("product_name"));
					product.setPrice(rs.getBigDecimal("price"));
					product.setCategoryDto(categoryDao.getCategoryByCategoryId(rs.getInt("category_id")));
					product.setProducType(rs.getString("product_type"));
					products.add(product);
				}
			}
			return products;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductDto> getProductsByCategoryIdPaginationLimit(Integer categoryId, Integer page,
			Integer paginationLimit) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getProductsByCategoryIdPaginationLimit'");
	}

	@Override
	public Integer getProductCountForCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getProductCountForCategory'");
	}

	@Override
	public Integer getProductCountForSearch(String searchQuery) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getProductCountForSearch'");
	}

	@Override
	public List<ProductDto> getProductsLikeNameForPageWithLimit(String searchQuery, Integer page,
			Integer paginationLimit) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getProductsLikeNameForPageWithLimit'");
	}


}
