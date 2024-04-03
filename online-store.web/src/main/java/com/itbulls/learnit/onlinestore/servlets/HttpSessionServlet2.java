package com.itbulls.learnit.onlinestore.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HttpSessionServlet2
 */
@WebServlet("/session-demo2")
public class HttpSessionServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		PrintWriter writer = response.getWriter();
		writer.println("Session attribute: " 
				+ session.getAttribute("sessionAttribute"));
		writer.println("<br>");
		writer.println("Session ID: " 
				+ session.getId());
	}

}
