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
	<table border="1"  id="example" class="table table-striped table-bordered" style="width:50%">
		<tr>
		<th>Email</th>
		<th>Message</th>		
		<th>Delete</th>
		<th>Reply<th>
		</tr>
		
		<c:forEach var="item" items="${listReply}">
			<tr>
				<td>${item.qemail}</td>
				<td>${item.comment}</td>
			<td><a href="${pageContext.request.contextPath }/deleteEmail/${item.qemail }" onclick="return confirm('Are you sure?')">Delete</a></td>
			<td><a href="${pageContext.request.contextPath }/replyAdmin" onclick="return confirm('Are you sure?')">Reply</a></td>
 	
 			</tr>			
		</c:forEach>
			
	</table>
	</div>
</body>
</html>