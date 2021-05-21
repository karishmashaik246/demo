<%@ page import="maven.mvc.controller.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Student stu=(Student) request.getAttribute("stu");
%>

id: ${stu.getId()} <br>
Name: ${stu.getName()}
</body>
</html>