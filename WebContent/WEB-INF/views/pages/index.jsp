<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/style/css/style.css" />
</head>
<body>
	homepage
	
	
	
	<table class="table table-bordered table-dark">
  <thead>
    <tr>
      		<th scope="col">Products ID</th>
			<th scope="col">Products name</th>
			<th scope="col">Cost</th>
			<th scope="col">Options</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="temp" items="${products }">
			<tr>
				<td scope="row">${temp.productId }</td>
				<td>${temp.productName }</td>
				<td>${temp.cost }</td>
				<td><a  href="${pageContext.request.contextPath }/updateProduct?id=${temp.productId}">Update</a>
				|<a class="btn btn-default" href="${pageContext.request.contextPath }/deleteProduct?id=${temp.productId}" onclick="if(!confirm('Are you sure to delete?')) return false;">Delete</a>
				</td>
			</tr>
		</c:forEach>
   
  </tbody>
</table>
	
	<p/>
	
</body>
</html>