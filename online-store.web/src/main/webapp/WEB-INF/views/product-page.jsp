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

    <div>

        <c:if test="${products != null}">
            <c:forEach items="${products}" var="product">
                <section class="product-display">
                    <a href="/online-store.web-1.0/product-detail?productId=${product.id}">
                        <img src="images/product/${product.productType}/apple.png" alt="${product.productName}" id="productImage">
                    </a>
                    <h2 id="productName">${product.productName}</h2>
                    <span id="productPrice">${product.price}</span>
                    <button onclick="addToCart()">Add to Cart</button>
                </section>
            </c:forEach>
        </c:if>

        <c:if test="${products == null}">
            <p>No products available, please come back to home </p>
        </c:if>


        <c:if test="${products != null}">
            <!-- Pagination -->
            <div class="pagination">
                <c:forEach begin="1" end="${numberOfPages}" var="i">
                    <c:choose>
                        <c:when test="${i == currentPage}">
                            <span class="active">${i}</span>
                        </c:when>
                        <c:otherwise>
                            <a href="/online-store.web-1.0/search-product-page?page=${i}&searchQuery=${searchQuery}">${i}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </div>
        </c:if>
    </div>

    <script src="script.js"></script>
</body>
</html>
