package com.website;

public class ManageServlet extends HttpServlet 
{
	public void service(HttpServletRequest rs,HttpServletResponse)
	{
		String j=getParameter("num2");
		printWriter(j);
	}

}
