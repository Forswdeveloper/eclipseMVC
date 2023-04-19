<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href = "<c:url value="/resources/css/bootstrap.min.css"/>" rel ="stylesheet">
<meta charset="UTF-8">
<title>도서 상세 정보</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./home">Home</a>
			</div>
		</div>
	</nav>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서 정보</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3>${book.name}</h3>
				<p>${book.description}</p>
				<br>
				<p><b>도서코드 : </b><span class ="badge badge-info">${book.bookId}</span>
				<p><b>저   자</b> : ${book.author}
				<p><b></b>
				<br>
				<a href="<c:url value = "/books"/>" class = "btn btn-secondary">도서 목록 &raquo;</a>
			</div>
		</div>
	</div>
</body>
</html>