<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>

<body>
	<% 
		response.setHeader("Cache-control","no-cahe, no-store, must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
	  if(session.getAttribute("username")==null)
		  response.sendRedirect("LoginT.jsp");
	%>
	Hi ${username}...
	<form action="Logout">
	<input type="submit" value="logout">
	</form>

</body>
</html>