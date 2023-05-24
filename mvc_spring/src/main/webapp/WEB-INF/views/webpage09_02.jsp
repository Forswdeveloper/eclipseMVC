<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<h3>파일업로드</h3>
	
	<form:form action="form?${_csrf.parameterName}=${_csrf.token}" modelAttribute="member" method="POST" enctype="multipart/form-data">
		<p> 이름 : <input type="text" name="name"/>
		<p> 파일 : <input type="file" name="imageFile"/>
		<p> <input type="submit" value="전송하기"/>
			<input type="reset" value="다시쓰기"/>
		<%-- 	<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/> --%>
	</form:form>
</body>
</html>