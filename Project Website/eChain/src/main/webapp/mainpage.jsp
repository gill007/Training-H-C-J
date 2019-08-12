<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"  %>
<%@ page import="com.website.model.MainBean" %>


<html>
<head>
  <title>Main Page</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="login1.css" >
  
  <script src="https://unpkg.com/ionicons@4.5.10-0/dist/ionicons.js"></script>
  
  
</head>
<body>

<% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); %>
<div class="col1">
<nav class="navbar navbar-light" style="background-color:#58D68D ;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">e-Chain  Welcomes You "<%=(String) session.getAttribute("loginUsername") %>"</a>
      
    </div>
 
    <ul class="nav navbar-nav navbar-right">
      <li><div class="dropdown"> <button class="dropbtn"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</button>
            <div class="dropdown-content">
                <a href="getCart?unique=35">Edit Cart</a>        
           </div>
          </div>
      </li>
      <li ><div class="dropdown"><button class="dropbtn"><span class="glyphicon glyphicon-log-out"></span> Logout</button>
      <div class="dropdown-content">
                <a href="getCart?bab=36">Logout</a>        
           </div>
      </div>
      </li>
    </ul>
  </div>
</nav>
</div>
 <%ArrayList rs=(ArrayList)session.getAttribute("objectData"); 

 %>
<div class="container">
  <h2> New Arrivals </h2>
    <div class="row">
 

 <% for(int i=0;i<rs.size();i++){ %>
 <% MainBean mb=(MainBean) rs.get(i);%>
     <div class="col-md-4">
        <div class="product-top">
            <img class="site-image" src="<%=mb.getImageUrl()%>">
              <div class="overlay">
        <%   int id=mb.getId();    
          
       %>
  <a href="getCart?url=<%=mb.getImageUrl()%>&price=<%=mb.getPrice()%>&name=<%=mb.getItemName()%>&quantity=<%=mb.getQuantity()%>"> <button type="button" class="btn btn-secondary" title="Add to Cart" onclick="fun()"><ion-icon name="cart"></ion-icon></button></a>
            
       
              </div>
            <div class="product-bottom text-center">
        
              <h3> <%=mb.getItemName()%> </h3>
              <h5> $<%=mb.getPrice()%> </h5>
            </div>
        </div>
      </div>
<%} %>
</div>
</div>
 
</body>
</html>
