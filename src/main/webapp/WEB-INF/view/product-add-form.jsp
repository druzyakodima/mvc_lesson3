<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="processForm" modelAttribute="product">
    <h1>SELECT PRODUCTS</h1>

    <br>
    Product id: <form:input path="id"/>

    <br>
    Product name:
    <form:select path="name">
        <form:option value="Product A" label="Product A"/>
        <form:option value="Product B" label="Product B"/>
        <form:option value="Product B" label="Product C"/>
        <form:option value="Product B" label="Product D"/>
        <form:option value="Product B" label="Product E"/>
        <form:option value="Product B" label="Product F"/>
        <form:option value="Product B" label="Product G"/>
        <form:option value="Product B" label="Product H"/>
        <form:option value="Product B" label="Product I"/>
    </form:select>

    <br>
    Product cost: <form:input path="cost"/>

    <br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
