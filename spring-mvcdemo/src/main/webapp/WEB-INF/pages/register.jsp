<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.register {
	text-align:center; 
	margin-top:100px; 
	margin-left:200px; 
	background-color:Chocolate;
	height: 400px;
    padding: 30px;
    width: 500px;
    border: 30px;
	}
	.table {
		margin-top:40px;
	}
	label {
		display:inline-block;
		width:100px;
		margin:5px 5px 5px 5px;
		text-align:left;
	}
</style>
</head>
<body style="background-color:burlywood">
<div class ="register">
<h1>${msg3}</h1>
<form action="register" method="post"  >
<table class="table" align="center">
<tr>
<td><b><label for="uname">UserName : </label></b></td>
<td><input type = "text" name="uname"/></td>
</tr>
<tr>
<td><b><label for="password" >Password : </label></b></td>
<td><input type = "password" name="pwd"/></td>
</tr>
<tr>
<td><b><label for="fname">FirstName : </label></b></td>
<td><input type = "text" name="fname"/></td>
</tr>
<tr>
<td><b><label for="lname">LastName : </label></b></td>
<td><input type = "text" name="lname"/></td>
</tr>
<tr>
<td><b><label for="mobile">MobileNo : </label></b></td>
<td><input type = "text" name="number"/></td>
</tr>
<tr>
<td><b><label for="email">EmailId : </label></b></td>
<td><input type = "text" name="email"/></td>
</tr>
<tr>
<td><b><label for="address">Address : </label></b></td>
<td><input type = "text" name="address"/></td>
</tr>

</table><br></br>
<input type="submit" value ="Register" style="height:30px; width:80px; color:;"/>
</form>
</div>

</body>
</html>