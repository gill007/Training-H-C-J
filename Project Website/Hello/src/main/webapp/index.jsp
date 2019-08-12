<%@ page import="java.util.ArrayList" %>
<html>
<body>
<h2>Hello World!</h2>
<%ArrayList<String> st=new ArrayList(); %>
<%HttpSession session1=request.getSession();
 session1.setAttribute("objectData",st); 
 %>
<form action="adds" action="get" >
username:<input type="text" >
<%st.add("hello"); st.add("beckham");%>
<input type="submit" value="submit">
</form>
</body>
</html>
