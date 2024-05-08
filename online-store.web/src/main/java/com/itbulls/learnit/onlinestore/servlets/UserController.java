package com.itbulls.learnit.onlinestore.servlets;

import java.io.IOException;
import java.lang.module.Configuration;

import com.itbulls.learnit.onlinestore.core.facades.UserFacade;
import com.itbulls.learnit.onlinestore.core.facades.impl.DefaultUserFacade;
import com.itbulls.learnit.onlinestore.persistence.enteties.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.itbulls.learnit.onlinestore.Configurations;

@WebServlet("/user")
public class UserController extends HttpServlet {

    private UserFacade userFacade = DefaultUserFacade.getInstance();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userIdString = request.getParameter("id");

        if (userIdString != null && !userIdString.isBlank()) {
            User user = userFacade.getUserById(Integer.valueOf(userIdString)); // TODO: get user by id

            request.setAttribute("user", user); // TODO: add user to request

            request.getRequestDispatcher(Configurations.VIEWS_PATH_RESOLVER + "generalUserInfo.jsp").forward(request,
                    response); // TODO: forward request to generalUserInfo.jsp

        }

    }

}
