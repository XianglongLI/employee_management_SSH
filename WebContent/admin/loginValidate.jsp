<%
	String username = (String) session.getAttribute("username");
	if(username == null || username.equals("")) {
		response.sendRedirect("sign-in.jsp");
	}
%>
