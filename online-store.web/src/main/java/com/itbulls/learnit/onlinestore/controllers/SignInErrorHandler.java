package com.itbulls.learnit.onlinestore.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sign-in-error")
public class SignInErrorHandler extends HttpServlet {

    public static final long serialVersionUID = 1L;

    public static final String ERROR_MESSAGE = "Invalid email or password. Please try again.";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("errorMessage", ERROR_MESSAGE);
        request.getRequestDispatcher("/WEB-INF/views/sign-in.jsp").forward(request, response);
    }

}
