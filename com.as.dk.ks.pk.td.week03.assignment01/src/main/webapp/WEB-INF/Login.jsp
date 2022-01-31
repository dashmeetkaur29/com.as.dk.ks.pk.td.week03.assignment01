<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="login.css" />
<title>Login form</title>
</head>
<body>

<br/>
<br/>

<form action = "FirstServlet" method="post" class="login">
<h2>Login Page</h2>
<label>User Name </label> <input type="text" size="20" name="userName" id="Uname" /> &nbsp;<br/>
<label>Password :</label>	<input type="password" size="20" name="password" id="Pass"/> &nbsp;<br>
<input type="submit" value="Login" id="log"/><br/></br>
</form>


<% 



%>
</body>
</html>