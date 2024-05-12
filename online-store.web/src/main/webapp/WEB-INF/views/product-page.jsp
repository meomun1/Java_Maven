<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fruit Product Display</title>
    <link rel="stylesheet" href="css/product_page/style.css">
</head>
<body>
    <header>
        <h1>Fruit Market</h1>
        <nav>
            <a href="/online-store.web-1.0/home-page">Home</a>
            <a href="/online-store.web-1.0/home-page">Products</a>
            <a href="/online-store.web-1.0/home-page">Contact</a>
        </nav>
    </header>

    <main>

        <c:if test="${products != null}">

            <c:forEach items = "${products}" var = "product">

                <section class="product-display">
                    <img src="images/product/${product.productType}/apple.png" alt="${product.productName}" id="productImage">
                    <h2 id="productName">${product.productName}</h2>
                    <span id="productPrice">${product.price}</span>
                    <button onclick="addToCart()">Add to Cart</button>
                </section>
            </c:forEach>
        </c:if>

        <c:if test="${products == null}">
            <p>No products available, please come back to home </p>
        </c:if>

    <footer>
        <p>&copy; 2024 Fruit Market</p>
    </footer>

    <script src="script.js"></script>
</body>
</html>
