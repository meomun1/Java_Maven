package com.itbulls.learnit.onlinestore.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.itbulls.learnit.onlinestore.Configurations;
import com.itbulls.learnit.onlinestore.core.facades.ProductFacade;
import com.itbulls.learnit.onlinestore.core.facades.impl.DefaultProductFacade;

@WebServlet("/search-product-page")

public class SearchProductFruitShop extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ProductFacade productFacade;
	{
		productFacade = DefaultProductFacade.getInstance();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchQuery = request.getParameter("searchQuery");
		String pageParam = request.getParameter("page");
		Integer page = (pageParam != null && !pageParam.isEmpty()) ? Integer.valueOf(pageParam) : 1;
		Integer numberOfPages = productFacade.getNumberOfPagesForSearch(searchQuery, Configurations.PAGINATION_LIMIT);

		request.setAttribute("searchQuery", searchQuery);
		request.setAttribute("numberOfPages", numberOfPages);
		request.setAttribute("products", productFacade.getProductsLikeNameForPageWithLimit(searchQuery, page, Configurations.PAGINATION_LIMIT));
		request.getRequestDispatcher("/WEB-INF/views/product-page.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String searchQuery = request.getParameter("searchQuery");
		String pageParam = request.getParameter("page");
		Integer page = (pageParam != null && !pageParam.isEmpty()) ? Integer.valueOf(pageParam) : 1;

		Integer numberOfPages = productFacade.getNumberOfPagesForSearch(searchQuery, Configurations.PAGINATION_LIMIT);

		request.setAttribute("searchQuery", searchQuery);
		request.setAttribute("numberOfPages", numberOfPages);
		request.setAttribute("products", productFacade.getProductsLikeNameForPageWithLimit(searchQuery, page, Configurations.PAGINATION_LIMIT));
		request.getRequestDispatcher("/WEB-INF/views/product-page.jsp").forward(request, response);
	}

}
