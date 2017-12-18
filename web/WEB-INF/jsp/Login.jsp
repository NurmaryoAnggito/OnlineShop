<%-- 
    Document   : Login
    Created on : Dec 15, 2017, 5:04:00 PM
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
      <a  class="navbar-brand">Login</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="${pageContext.request.contextPath}/register">Home</a></li>
      <li><a href="${pageContext.request.contextPath}/register/form">Register</a></li>
      <li><a href="${pageContext.request.contextPath}/register/productview">Product</a></li>
      <li><a href="${pageContext.request.contextPath}/register/login">Login</a></li>
    </ul>
  </div>
</nav>
        <h1>Login</h1>
        <form:form action="register/checklogin" modelAttribute="registerBean" method="POST" ></form:form>
        <table>
            <tr><td><form:label path="username">Username</form:label></td>
                <td><form:input path="username"/></td></tr>
            <tr><td><form:label path="password">Password</form:label></td>
                <td><form:password path="password" /></td></tr>
            <tr><td></td><td><form:button name="submitButton" value="Submit">Submit</form:button></td></tr>
            
        </table>
        </form:form>
    </body>
</html>
