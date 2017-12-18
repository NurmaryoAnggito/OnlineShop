<%-- 
    Document   : Home
    Created on : Dec 14, 2017, 4:16:44 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
        <title>Home</title>
    </head>
    <body>
        <img src="<c:url value="/resources/online-shop-header.jpg"/>" style width="100%" height="200">
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="${pageContext.request.contextPath}/register">Home</a></li>
      <li><a href="${pageContext.request.contextPath}/register/form">Register</a></li>
      <li><a href="${pageContext.request.contextPath}/register/productview">Product</a></li>
      <li><a href="${pageContext.request.contextPath}/register/login">Login</a></li>
      
    </ul>
  </div>
</nav>
       
    </body>
</html>
