

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
        <title>Registrasi</title>
    </head>
    <body>
        <img src="<c:url value="/resources/online-shop-header.jpg"/>" style width="100%" height="200">
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a  class="navbar-brand">Registration</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="${pageContext.request.contextPath}/register">Home</a></li>
      <li><a href="${pageContext.request.contextPath}/register/form">Register</a></li>
      <li><a href="${pageContext.request.contextPath}/register/productview">Product</a></li>
      <li><a href="${pageContext.request.contextPath}/register/login">Login</a></li>
    </ul>
  </div>
</nav>
        <form:form action="register/save" modelAttribute="registerBean" method="POST" >
            <table>
                <tr><td><form:label path="fullname">Full Name</form:label></td>
                    <td><form:input path="fullname"/></td></tr>
                <tr><td><form:label path="username">Username</form:label></td>
                    <td><form:input path="username"/></td></tr>
                <tr><td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password" /></td></tr>
                <tr><td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" /></td></tr>
                <tr><td><form:label path="address">Address</form:label></td>
                    <td><form:input path="address" /></td></tr>
                
                <tr><td></td><td><form:button name="submitButton" value="Submit">Submit</form:button></td></tr>            
            </table>            
        </form:form>
    </body>
</html>
