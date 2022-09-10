<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/stdQuery.css" rel="stylesheet" ></link>
</head>
<body class="container">
<div class="topnav">
  <a class="active" href="welcomeStudent">Home</a>
</div>
	<div align="center">
	<table border="1" style="width:80%">

		<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Need</th>
		<th>Message</th>
		<th>Reply</th>
<!-- 		<th>AgainReply</th> -->
		<th>Delete<th>
		</tr>
		
		<c:forEach var="item" items="${listQuery}">
			<tr>
				<td>${item.fname}</td>
				<td>${item.surname}</td>
				<td>${item.email}</td>
				<td>${item.need}</td>
				<td>${item.message}</td>
				<td><a href="replyAdmin">Reply</a>
<%-- 				<td><a href="${pageContext.request.contextPath }/replyAdmin/${item.email}">AgainReply</a> --%>
				<td><a href="${pageContext.request.contextPath }/deleteEmail/${item.email}" onclick="return confirm('Are you sure?')">Delete</a>
			</tr>
				
		</c:forEach>
	</table>
</div>
</body>
</html>