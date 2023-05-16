<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<h3>파일업로드</h3>
	
	<form action="form?${_csrf.parameterName}=${_csrf.token}" method="POST" enctype="multipart/form-data">
		<p> 이름 : <input type="text" name="name"/>
		<p> 파일 : <input type="file" name="fileImage"/>
		<p> <input type="submit" value="전송하기"/>
			<input type="reset" value="다시쓰기"/>
		<%-- 	<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/> --%>
	</form>
</body>
</html>