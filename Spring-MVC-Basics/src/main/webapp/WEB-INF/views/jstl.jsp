<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL-Example</title>
</head>
<body>

	<h1>${name}</h1>
	<h1>${work}</h1>
	
	<c:ForEach value="user" items="$users">
		<h4>${user}</h4>
	</c:ForEach>
	
	<c:ForEach value="user" items="$users">
		<c:out value="user">DEFAULT_VALUE</c:out>   
	</c:ForEach>
	
	


</body>
</html>