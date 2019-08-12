<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <link rel="stylesheet" href="login1.css" >
<script type="text/javascript">


</script>

 
<meta charset="ISO-8859-1">
<title>CheckOut</title>
</head>
<body>
<%int price=0; %>
<% ArrayList rs=new ArrayList();%>

<%rs=(ArrayList)session.getAttribute("cartData"); %>
<%HttpSession session1=request.getSession();
  session1.setAttribute("removeData", rs);
%>
<% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); %>
<div class="col1">
<nav class="navbar navbar-light" style="background-color:#58D68D ;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">e-Chain  Check Out </a>
      
    </div>
 
    <ul class="nav navbar-nav navbar-right">
      <li><div class="dropdown"> <button class="dropbtn"><span class="glyphicon glyphicon-home"></span> Home</button>
            <div class="dropdown-content">
                <a href="mainpage.jsp">Main Page</a>        
           </div>
          </div>
      </li>
      <li ><div class="dropdown"><button class="dropbtn" ><span class="glyphicon glyphicon-log-out"></span> Logout</button>
      <div class="dropdown-content">
                <a href="getCart?bab=36">Logout</a>        
           </div>
      </div>
      </li>
    </ul>
  </div>
</nav>

<form class="box" action="checkoutServlet" method="post">
<h1> Cart </h1>
<br>
<br>
<table >
<tr>
<th ><p style="text-align:center;">	Item Image</p></th>
<th ><p style="text-align:center;">Item Price</p></th>
<th ><p style="text-align:center;">Item Name</p></th>
<th ><p style="text-align:center;">Remove Item</p></th>
</tr>

<%String arr[]={}; %>
<% for(int i=0;i<rs.size();i++){ %>

<%String e=(String)rs.get(i); %>
<%arr=e.split(" "); %>
<tr>
<td><img src="<%=arr[0]%>" width="100" height="100"></td>
<%price=price+Integer.parseInt(arr[2]); %>
<td>$<%=arr[2]%></td>
<td><%String[] z=Arrays.copyOfRange(arr, 3, arr.length);%>
<%for(String a:z){%>
	<%=a %>
<%}%>
</td>
<td><a style="color:red" href="checkoutServlet?id=<%=i%>">Remove</a></td>
</tr>
<%}%>
</table>
<!--  session.removeAttribute("cartData");-->

<!--rs.clear();  -->


<h2 style="color:#7F8C8D">Total: <%=price %></h2>
<input type="submit" value="Checkout">

</form>
</body>
</html>