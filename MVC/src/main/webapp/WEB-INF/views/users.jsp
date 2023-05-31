<%@page import="spring.mvc.entity.Business"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> User details </h1>

<!-- Taking the data from the controller -->

<% String name = (String) request.getAttribute("name");
	Integer work = (Integer) request.getAttribute("work");
	List<String> users = (List<String>) request.getAttribute("users");
%>

<!-- Printing on the web page -->
<%=name %>
<%=work %>

<!-- 		Printing the list  method -1-->

<% for(String str : users){
	out.print(str);
	}
%>


 <!-- Printing list on the web page method -2 -->
 
<% for(String s : users){ %>
<%= s %>
<% } %>

<!-- GETTING THE DATA THROUGH MODEL AND VIEW  -->

<%
	Business bsn = (Business) request.getAttribute("business");
%>

<h3>Business id : <%= bsn.getId() %></h3><br>
<h3>Business name : <%= bsn.getName() %></h3><br>
<h3>Business age : <%= bsn.getAge() %></h3><br>

</body>
</html>