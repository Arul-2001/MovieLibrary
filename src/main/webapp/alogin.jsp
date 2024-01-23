<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="adminlogin" method="post">
<label for="adminemail">Admin Email</label>
<input type="text" name="adminemail">
<br>
<br>
<label for="adminpassword">Admin Password</label>
<input type="text" name="adminpassword">
<br>
<br>
<input type="submit">

</form>

<% String message=(String)request.getAttribute("message"); %>
<% if(message!=null){ %>
<%= message %>
<%} %>


</body>
</html>