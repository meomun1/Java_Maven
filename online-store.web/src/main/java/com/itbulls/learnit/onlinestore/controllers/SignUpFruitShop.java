package com.itbulls.learnit.onlinestore.controllers;

import com.itbulls.learnit.onlinestore.Configurations;
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

@WebServlet("/sign-up")

public class SignUpFruitShop extends HttpServlet {

	private UserFacade userFacade = DefaultUserFacade.getInstance();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/sign-up.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String baseURL = request.getScheme() + "://"
				+ request.getServerName() + ":"
				+ request.getServerPort()
				+ request.getServletContext().getContextPath();

		// Validate email format
		String email = request.getParameter("email");
		User existingUser = userFacade.getUserByEmail(email);
		if(existingUser != null){
			request.setAttribute("errorMessage", "This mail has been used, please try another one.");
			request.getRequestDispatcher("/WEB-INF/views/sign-up.jsp").forward(request, response);
			return;
		}

		// Validate password format
		String password = request.getParameter("password");
		String passwordRegex = "^(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		if (password == null || !password.matches(passwordRegex)) {
			request.setAttribute("errorMessage",
					"Password must be at least 8 characters long, contain at least one uppercase letter and one special character.");
			request.getRequestDispatcher("/WEB-INF/views/sign-up.jsp").forward(request, response);
			return;
		}

		User user = new DefaultUser();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(password);

		String partnerCode = null;
		if (request.getCookies() != null) {
			for (Cookie cookie : request.getCookies()) {
				if (cookie.getName().equals(PARTNER_CODE_COOKIE_NAME)) {
					partnerCode = cookie.getValue();
				}
			}
		}

		userFacade.registerUser(user, partnerCode);
		response.sendRedirect(baseURL + "/sign-in");

	}

}
