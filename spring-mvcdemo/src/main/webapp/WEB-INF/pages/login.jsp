<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.login {
	text-align:center; 
	margin-top:100px; 
	margin-left:200px; 
	background-color:SteelBlue;
	height: 200px;
    padding: 30px;
    width: 400px;
    border: 30px;
	
	}
</style>
</head>
<body style="background-color:DarkGray;">
<div class="login">
<h1>${msg2}</h1>
<form action="login" method="post">
<b>UserName: </b><input type = "text" name="uname"/><br></br>
<b>Password  : </b><input type = "password" name="pwd"/><br></br>
<input type="submit" value ="Login" style="background-color:PaleGreen;"/>
</form>
<h3>${msg4}</h3>
</div>
</body>
</html>