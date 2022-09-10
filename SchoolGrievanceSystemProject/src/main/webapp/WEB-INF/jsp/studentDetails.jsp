<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="1">
	<tr>
		<th>Enrollment</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Address</th>
		<th>Pin code</th>
		<th>Password</th>
		</tr>
		
		<tr>
		<td>${views.sid}</td>
		<td>${views.sfname}</td>
		<td>${views.slname}</td>
		<td>${views.semail}</td>
		<td>${views.saddress}</td>
		<td>${views.spincode}</td>
		<td>${views.spassword}</td>
		</tr>
		
		<c:forEach var="view" items="${views}">
		<tr>
		<td>${view.sid}</td>
		<td>${view.sfname}</td>
		<td>${view.slname}</td>
		<td>${view.semail}</td>
		<td>${view.saddress}</td>
		<td>${view.spincode}</td>
		<td>${view.spassword}</td>
		<td><a href="/editStudent/${view.sid}">Update</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>