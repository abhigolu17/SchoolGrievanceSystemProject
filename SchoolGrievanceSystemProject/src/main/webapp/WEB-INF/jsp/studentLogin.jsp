<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
    
<%--  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 --%>
<!DOCTYPE html>
<html>
<head>
<link href="css/login.css" rel="stylesheet" ></link> 
<%--  <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet"> --%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="wrapper">
        <div class="logo">
            <img src="https://www.freepnglogos.com/uploads/twitter-logo-png/twitter-bird-symbols-png-logo-0.png" alt="">
        </div>
        <div class="text-center mt-4 name">
            Twitter
        </div>
<%--         <form action="#" th:action="@{/addUser}" th:object="${user}" method="post"> --%>
        <form action="loginStudent" method="post" class="p-3 mt-3">
            <div class="form-field d-flex align-items-center">
                <span class="far fa-user"></span>
                <input type="email" name="email" id="email" placeholder="Email">
            </div>
            <div class="form-field d-flex align-items-center">
                <span class="fas fa-key"></span>
                <input type="password" name="password" id="pwd" placeholder="Password">
            </div>
            <button href="welcomeAdmin" class="btn mt-3">Login</button>
        </form>
        <div class="text-center fs-6">
            <a href="#">Forget password?</a> or <a href="#">Sign up</a>
        </div>
    </div>


</body>
</html>