<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head><Title>Login Page</Title>
<link rel="stylesheet" href="<c:url value="/resources/css/login.css"/>">
<head>
<body>


<form class="box" action="loginController" method="post">
<h1> Login </h1>
<input type="text" name="username" placeholder="Username" >

<input type="password" name="password" placeholder="Password">

<input type="submit" value="Login">
<p>Not Registered?<a class="login" href="<c:url value="views/register.jsp"/>">Create an Account</a></p>
</form>
    
 


</body>
</html>

 