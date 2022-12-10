<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.required {
	text-align:center; 
	margin-top:100px; 
	margin-left:200px; 
	background-color:slategray;
	height: 200px;
    padding: 30px;
    width: 400px;
    border: 30px;
}</style>
</head>
<body style="background-color:RosyBrown;">
<div class="welcome">
<h1>${msg1}</h1>
<p style="color:crimson;"><b><i>If you're already registered 
go to login or if you're new go to register</i></b></p>
<form action="enter" method="post">
<input type="submit" value ="login" style="background-color:DarkCyan;"/>
</form><br>
<form action="enter1" method="post">
<input type="submit" value ="Register" style="background-color:Aqua;"/></form>
</div>
</body>

</html>