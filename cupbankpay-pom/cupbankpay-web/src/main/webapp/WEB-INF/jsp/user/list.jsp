<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
</head>
<body>
	user list.
	<br />
	<c:forEach var="user" items="${userList}" varStatus="status">
		<br /> id: <c:out value="${user.id}" />
		<br /> number: ${user.number}
		<br /> name: ${user.name}
		<br />
	</c:forEach>
</body>
</html>