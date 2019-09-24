<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="bean.Userbean"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
%>
<table border=1 cellpadding="10" cellspacing="0">
<tr>
<th>id</th>
<th>title1</th>
<th>title2</th>
<th>title3</th>
<th>content</th>
<th>key</th>
<th>abstract1</th>
<th>classs</th>
</tr>

<c:forEach items="${list }" var="userbean">
<tr>
<th>${userbean.id }</th> 
<th>${userbean.title1 }</th>
<th>${userbean.title2 }</th>
<th>${userbean.title3 }</th>
<th>${userbean.content }</th>
<th>${userbean.key1 }</th>
<th>${userbean.abstract1 }</th>
<th>${userbean.classs }</th>
</tr>
</c:forEach>

</table>
</body>
</html>