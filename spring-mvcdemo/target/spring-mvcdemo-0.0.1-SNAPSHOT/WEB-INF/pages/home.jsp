<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
<body>
<body style='background-color: red;'>
<div class="login">
<h1>${msg2}</h1>
<h1>Login Page</h1>
  <form action="login" method="post" >
    UserName:<input type ="text" name ="uname"/><br>
    Password:<input type ="password" name ="pwd"/><br>
    <input type = "submit" value = "login"/><br>
    </form>
<!--   <h1>Hello${message}</h1>-->

</div>
</body>
</html>