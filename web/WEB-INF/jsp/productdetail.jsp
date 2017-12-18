<%-- 
    Document   : productdetail
    Created on : Dec 18, 2017, 1:11:18 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
        <title>Product Detail</title>
    </head>
    <body>
        <img src="<c:url value="/resources/online-shop-header.jpg"/>" style width="100%" height="200">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
        <a class="navbar-brand">${product.productname}</a>
    </div>
  </div>
</nav>
    <jsp:include page="header.jsp"/>
        <h1>${product.productname} harga: ${product.productprice}</h1>
        <a href="addproduct/${product.id}"><button class="btn btn-info btn-lg"> <span class="glyphicon glyphicon-shopping-cart"></span> ADD TO CART</button></a>
        <img src="<c:url value="/resources/footer.png"/>" alt="Gorilla" width="100%" style="position: initial; bottom: 0">
    </body>
</html>
