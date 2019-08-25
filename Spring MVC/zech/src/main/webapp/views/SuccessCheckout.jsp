<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful Purchased</title>
<link rel="stylesheet" href="login.css" >
</head>
<body>
<form class="box">
<h1> Successfully Purchased </h1><br>
<%String arr[]={}; %>
<p><% ArrayList<String> ls=(ArrayList<String>)session.getAttribute("removeData");%>
<%for(String s:ls){ %>
<%arr=s.split(" "); %>
<%String[] z=Arrays.copyOfRange(arr, 3, arr.length); %>
<%for(String ma:z) {%>
<%=ma%>
<%}%>
<br>
<%}%>
</p>
<b><p>Next Step <a class="login" href="getCart?bab=36">Go to Login Page</a></p></b>
</form>
</body>
</html>