<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body></table border="1">
  
  <tr><b>SOURCE:</b><%=request.getParameter("src") %></tr><br>
  <tr><b>DESTINATION:</b><%=request.getParameter("des") %></tr></br> 
  <tr><b> FARE: </b><%=request.getAttribute("flight_name") %></tr></br>
  <tr><b>NO OF TICKETS:</b><%=request.getAttribute("num") %></tr>

<table>
</body>
</html>