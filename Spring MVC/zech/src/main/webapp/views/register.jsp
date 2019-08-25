<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head><Title>Registration Page</Title>
<link rel="stylesheet" href="<c:url value="/resources/css/login1.css"/>" >

<head>
<body>
<form class="box" action="register" method="post">
<h1> Register Here </h1>
<input type="text" name="firstname" placeholder="First Name" >
<input type="text" name="lastname" placeholder="Last Name" >
<input type="text" name="phonenumber" placeholder="Phone Number">
<input type="text" name="email" placeholder="Email">
<input type="text" name="username" placeholder="Username">
<input type="password" name="password" placeholder="Password">
<input type="password" name="repassword" placeholder="Confirm Password">
<input type="submit" value="Register">
<p>Already Registered?<a class="login" href="<c:url value="../index.jsp"/>">Login Here</a></p>

</form>
</body>
</html>