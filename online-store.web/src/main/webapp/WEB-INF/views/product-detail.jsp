<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Page</title>
<link rel="stylesheet" href="css/product_detail/style.css">
</head>
<body>
<div class="product-container">

    <c:if test = "${product != null}">
        <div class="product-image">
            <img src="images/product/${product.productType}/apple.png" alt="${product.productName}">
        </div>
        <div class="product-details">
            <h1>${product.productName}</h1>
            <p class="price">${product.price}</p>
            <button id="buy-button" class="buy-button">Buy</button>
            <div class="description">
                <p>This is a good product</p>
            </div>
        </div>
    </c:if>
</div>

<script>
    document.getElementById('buy-button').addEventListener('click', function() {
        alert('Your order is accepted and ma!');
    });
</script>

</body>
</html>