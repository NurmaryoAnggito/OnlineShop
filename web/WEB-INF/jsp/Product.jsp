<%-- 
    Document   : Product
    Created on : Dec 15, 2017, 5:17:57 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <img src="<c:url value="/resources/online-shop-header.jpg"/>" style width="100%" height="200">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
        <a class="navbar-brand">Product</a>
    </div>
  </div>
</nav>
    <jsp:include page="header.jsp"/>  
        <h1>Product</h1>
        <c:forEach var="i" items="${products}">
                
                <div class="col-md-3">
                    <div class="panel-primary">
                        <div class="row">
                            <div class="col-md-10">
                                <a href="/Jualan/produk/${i.id}">${i.productname}<img src="<c:url value="/resources/image/${i.imagepath}"/>" width="300" class="img-rounded"></a>
                               
                            </div>
                        </div>
                    </div>
                </div>
                
            </c:forEach>
        <img src="<c:url value="/resources/footer.png"/>" alt="Gorilla" width="100%" style="position: initial; bottom: 0">
    </body>
</html>
