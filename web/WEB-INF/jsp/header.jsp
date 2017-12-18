<%-- 
    Document   : header
    Created on : Dec 18, 2017, 10:40:53 AM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="${pageContext.request.contextPath}/register">Home</a></li>
      <li><a href="${pageContext.request.contextPath}/register/form">Register</a></li>
      <li><a href="${pageContext.request.contextPath}/produk/all">Product</a></li>
      
      
      <c:if test="${empty sessionScope.user}">
      <li><a href="${pageContext.request.contextPath}/register/login">Login</a></li>
      
      </c:if><c:if test="${not empty sessionScope.user}">
      <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
      <li><a href="${pageContext.request.contextPath}/produk/cart">Cart</a></li>
      </c:if>
    </ul>
  </div>
</nav>
    </body>
</html>
