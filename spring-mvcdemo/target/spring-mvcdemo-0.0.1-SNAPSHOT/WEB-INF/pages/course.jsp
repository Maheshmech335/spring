<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>COURSE_ID</th>
<th>C_NAME</th>
<th>C_DESP</th>
<th>C_FEES</th>
<th>C_RESOURCE</th>
<th>ACTION</th>
    <c:forEach items="${courseList}" var="item">
        <tr>
            <td>${item.getCourse_id()}</td>
            <td>${item.getC_name()}</td>
            <td>${item.getC_desp()}</td>
            <td>${item.getC_fees()}</td>
            <td>${item.getC_resource()}</td>
            <td><a href="enroll">enroll</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>