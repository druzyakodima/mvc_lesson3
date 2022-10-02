<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Welcome!All products are presented here.</h1>

<ul>
    <h4>ID NAME COST</h4>
    <c:forEach var="item" items="${productList}">
        <li>${item.id}, ${item.name},${item.cost}$</li>
    </c:forEach>
</ul>

</body>
</html>

