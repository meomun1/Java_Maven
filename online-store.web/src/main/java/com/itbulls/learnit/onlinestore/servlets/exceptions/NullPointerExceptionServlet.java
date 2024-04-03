package com.itbulls.learnit.onlinestore.servlets.exceptions;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class NullPointerExceptionServlet
 */
@WebServlet("/npe")
public class NullPointerExceptionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = null;
		System.out.println(s.length());
	}

}