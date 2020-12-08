<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>You have visited <a href="/counter2">http://localhost:8080/counter2</a> <c:out value = "${count2}"/> times. <a href="/counter2">Test another visit?</a></h3>

<a href="/reset2">Reset Counter</a>

</body>
</html>