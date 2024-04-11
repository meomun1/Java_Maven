package com.itbulls.learnit.onlinestore.controllers;

import com.itbulls.learnit.onlinestore.core.facades.UserFacade;
import com.itbulls.learnit.onlinestore.core.facades.impl.DefaultUserFacade;
import com.itbulls.learnit.onlinestore.persistence.enteties.User;
import com.itbulls.learnit.onlinestore.persistence.enteties.impl.DefaultUser;
import static com.itbulls.learnit.onlinestore.persistence.dto.RoleDto.*;
import static com.itbulls.learnit.onlinestore.filters.PartnerCodeFilter.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fruit-shop/sign-up")

public class SignUpFruitShop extends HttpServlet {

	private UserFacade userFacade = DefaultUserFacade.getInstance();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Forward to doPost method to handle GET requests as well
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String baseURL = request.getScheme() + "://" 
											 + request.getServerName() + ":"
											 + request.getServerPort() 
											 + request.getServletContext().getContextPath();
		
		User user = new DefaultUser();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		String partnerCode = null;
		if (request.getCookies() != null) {
			for (Cookie cookie : request.getCookies()) {
				if (cookie.getName().equals(PARTNER_CODE_COOKIE_NAME)) {
					partnerCode = cookie.getValue();
				}
			}
		}
		
		userFacade.registerUser(user, partnerCode);
		response.sendRedirect(baseURL + "/fruit-shop/sign-in.html");
		
	}

}
