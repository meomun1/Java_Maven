package com.itbulls.learnit.onlinestore.controllers;

import com.itbulls.learnit.onlinestore.core.facades.impl.DefaultPurchaseFacade;
import com.itbulls.learnit.onlinestore.persistence.enteties.Purchase;

import java.io.IOException;
import java.util.List;

import com.itbulls.learnit.onlinestore.Configurations;
import com.itbulls.learnit.onlinestore.core.facades.PurchaseFacade;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/management-fulfilment", name = "fulfilment")
public class FullFillmentFruitShop extends HttpServlet {

    private PurchaseFacade purchaseFacade = DefaultPurchaseFacade.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println(request.getParameter("purchaseId"));

        purchaseFacade
                .markFulfilmentStageForPurchaseIdAsCompleted(
                        Integer.valueOf(request.getParameter("purchaseId")));

        String baseUrl = request.getScheme()
                + "://"
                + request.getServerName()
                + ":"
                + request.getServerPort()
                + request.getServletContext().getContextPath();

        response.sendRedirect(baseUrl + "/management-orders");
    }
}
