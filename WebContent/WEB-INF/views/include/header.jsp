<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<title>${param.title }</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/files/style/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/files/style/style.css">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container">
			<a href="${pageContext.request.contextPath }/" class="nav-link"><img src="${pageContext.request.contextPath }/files/images/logo.png" style="height:30px;"/></a>
				<ul class="navbar-nav mr-auto">
					<li><a href="${pageContext.request.contextPath }/" class="nav-link">Home</a></li>
					<li><a href="${pageContext.request.contextPath }/addProductForm" class="nav-link">Add Product</a></li>
					<li class="dropdown"><a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">Service</a>
						<ul class="dropdown-menu bg-dark">
							<li><a href="" class="nav-link">service one</a></li>
							<li><a href="" class="nav-link">service two</a></li>
							<li><a href="" class="nav-link">service three</a></li>
						</ul>
					</li>
					<li><a href="" class="nav-link">Contact</a></li>
				</ul>
				<ul class="navbar-nav">
					<li><a href="${pageContext.request.contextPath }/login" class="nav-link ">Login</a></li>
					<li>
						<c:url var="logoutUrl" value="/" />
						<form action="${logoutUrl }" method="post">
							<input type="submit" value="Logout" />
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
						</form>
					</li>
				</ul>
		</div>	
	</nav>
	
	<div class="bodyPart">