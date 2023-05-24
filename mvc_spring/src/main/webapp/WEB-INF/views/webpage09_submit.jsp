<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<h3>파일업로드</h3>
	
	<c:choose>
		<c:when test="${not empty error}">
			<p>${error}
			<p><a href="<c:url value='form'/>">[웹 요청 URL /form으로 이동하기]</a>
		</c:when>
		<c:otherwise>
			<p>파일업로드 성공했습니다.
		</c:otherwise>
	</c:choose>
</body>
</html>