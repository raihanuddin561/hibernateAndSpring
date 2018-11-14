<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Adding product informations:
<hr>
<form:form action="${pageContext.request.contextPath }/addProduct" method="post" modelAttribute="product">
	<form:hidden path="productId"/>
	<p/>Product Name:<p/>
	<form:input path="productName"/>
	<p/>Product Cost:<p/>
	<form:input path="cost"/>
	<p/>
	<input type="submit" value="Add Product">
</form:form>
<hr/>
<a href="${pageContext.request.contextPath }/">Homepage</a>
</body>
</html>