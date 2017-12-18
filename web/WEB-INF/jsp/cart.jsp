<%-- 
    Document   : cart
    Created on : Dec 18, 2017, 10:47:29 AM
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
        <title>Cart</title>
    </head>
    <body>
        <img src="<c:url value="/resources/online-shop-header.jpg"/>" style width="100%" height="200">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Cart</a>
    </div>
  </div>
</nav>
        <jsp:include page="header.jsp"/>  
        <h1 style="text-align: center">CART</h1><hr>
        <div class="container panel panel-body">
            <table class="table">
            <c:forEach var="x" items="${cartBean.productlist}">
            <tr>
                <td>${x.value.productname}</td>
                <td>
                    Rp. ${x.value.productprice}
                    
                </td>
                <td>
                    <a href="/Jualan/produk/delete/${x.key}"><button class="btn btn-danger btn-sm">          <span class="glyphicon glyphicon-trash"></span> REMOVE</button></a>
                </td>
            </tr>
            </c:forEach>
            
        </table>
            <c:if test="${not empty sessionScope.cartBean.productlist}">
            <h2>Total : Rp. ${totalprice}</h2>
            <a href="/Jualan/produk/checkout"><button class="btn btn-primary"> CHECK OUT </button></a>
            </c:if>
            <c:if test="${empty sessionScope.cartBean.productlist}">
            <h2>Your cart is still empty.</h2>
            </c:if>
            <img src="<c:url value="/resources/footer.png"/>" alt="Gorilla" width="100%" style="position: initial; bottom: 0">
    </body>
</html>
