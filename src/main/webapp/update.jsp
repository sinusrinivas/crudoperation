<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="update" method="post">

sid :<input type="number" name="sid" value=<%=request.getParameter("id") %>>
sname:<input type="text" name="sname" value=<%= request.getParameter("name") %>>
phno:<input type="number" name="phno" value= <%=request.getParameter("phno") %>>

<% if(request.getParameter("gender").equals("male")) {%>
male: <input type="radio" name="gender" value="male" checked="checked"><br>
female: <input type="radio" name="gender" value="female">
<%} else { %>

male:<input type="radio" name="gender" value="male"><br>
female : <input type="radio" name="gender" value="female" checked="checked">

<% } %>
<button >Update</button>
<button >Cancel</button>
</form>
</body>
</html>