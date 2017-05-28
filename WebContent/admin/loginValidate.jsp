<%
	String username = (String) session.getAttribute("username");
	if(username == null || username.equals("")) {
		response.sendRedirect("sign-in.jsp");
	}
	String path = request.getContextPath();  
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";  
%>
