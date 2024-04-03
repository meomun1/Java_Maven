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
 * Servlet implementation class HttpSessionServlet
 */
@WebServlet("/session-demo")
public class HttpSessionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		// true - to create a new session for this request if necessary; 
		// false - to return null if there's no current session
//		HttpSession session = request.getSession(false);
		
		PrintWriter writer = response.getWriter();
		writer.println("Session is created");
		
		session.setAttribute("sessionAttribute", "Session Attribute");
		
		writer.println("<br>");
		writer.println("Session attribute is set");
		
	}

}
