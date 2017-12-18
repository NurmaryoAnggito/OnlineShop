<%-- 
    Document   : checkout
    Created on : Dec 18, 2017, 2:29:43 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checking Out</title>
        <script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />"></script>
        <script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.js"/>" type="text/javascript"></script>
        <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">

    </head>
    <body>
        <img src="<c:url value="/resources/online-shop-header.jpg"/>" style width="100%" height="200">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Checkout</a>
    </div>
  </div>
</nav>
        <div><jsp:include page="header.jsp"/></div>
        
        <div class="container">
        <c:if test="${not empty sessionScope.user}">
            <h1>Check out successful!</h1>
            <h3>The total payment is: Rp. ${priced}</h3>
            <h3>Our Website is under development</h3>
            <h3>Payment is unavailable right now</h3>
            <h3>Sorry for the inconvenience</h3>
        </c:if>
        <c:if test="${empty sessionScope.user}">
            <h1>You need to <a href="/Jualan/login">log in</a> first in order to process forward.</h1>
        </c:if>
        

        </div>
        <img src="<c:url value="/resources/footer.png"/>" alt="Gorilla" width="100%" style="position: initial; bottom: 0">
    

        
    </body>
</html>

