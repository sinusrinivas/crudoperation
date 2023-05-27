<%@page import="dto.Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%    List<Dto> l1= (List<Dto>)request.getAttribute("list"); %>

<table border="">
<tr>
<th>Id</th>
<th>Name</th>
<th>Number</th>
<th>Gender</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%for(Dto a:l1) {%>

<tr>

<td><%=a.getSid() %></td>
<td><%=a.getSname() %></td>
<td><%=a.getPhno() %></td>
<td><%=a.getGender() %></td>
<td><a href="remove?sid=<%=a.getSid()%>">Delete</a></td>
<td> <a href="update.jsp?id=<%=a.getSid() %>&name=<%= a.getSname()%> &phno=<%= a.getPhno()%> &gender=<%= a.getGender()%>">Update</a></td>
</tr>
<%} %>
 </table>


</body>
</html>