<%@ taglib prefix="g" tagdir="/WEB-INF/tags/general"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="custom" uri="/WEB-INF/custom.tld"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tags Demo</title>
</head>
<body>
    <g:footer/>

    <p>==============================</p>

    <c:set var="arr" value="${['Apple', 'Banana', 'Orange']}"/>
    <g:printArray coll="${arr}"/>

    <p>==========</p>

    <custom:helloTag/>
    <custom:helloTag message="test message"/>
    <custom:helloTag message="test message" coll="${arr}"/>

    <p>==============================</p>

    Current time: <m:today/>

    
</body>
</html>