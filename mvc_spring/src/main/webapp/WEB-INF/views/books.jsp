<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
<link href = "<c:url value="/resources/css/bootstrap.min.css"/>" rel ="stylesheet">
<meta charset="UTF-8">
<title>도서목록</title>
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
			<h1 class="display-3">도서 목록</h1>
		</div>
		<div align="right">
			<p><a href="<c:url value="/books/add"/>" class="btn btn-Secondary" role="button">도서등록 &raquo;</a>
		</div>
	</div>
	
	<div class = "container">
		<div class="row" align="center">
			<c:forEach items="${bookList}" var="book">
				<div class="col-md-4">
					<%-- <img src="<c:url value="/resources/images/${book.bookId}.jpg"/>" style="width:60%"/> --%>
					<c:choose>
						<c:when test="${book.getBookImage()==null}">
							<img src="<c:url value="\\Users\\jeongdong-in\\Documents\\uploadFile\\${book.getBookId()}.jpg"/>" style="width:60%"/>
						</c:when>
						<c:otherwise>
							<img src="<c:url value="\\Users\\jeongdong-in\\Documents\\uploadFile\\${book.getBookImage().getOriginalFilename()}"/>" style="width:60%"/>
						</c:otherwise>
					</c:choose>
					<h3>${book.name}</h3>
					<p>${book.author}
						<br>${book.publisher} | ${book.releaseDate}
					<p align=left>${fn.substring(book.description, 0, 100)}...
					<p>${book.unitPrice}원
					<p><a href="<c:url value="/books/book?id=${book.bookId}"/>" class="btn btn-Secondary" role="button">상세정보 &raquo;</a>
				</div>
			</c:forEach>
		</div>
		<hr>
		<footer>
			<p>&copy; BookMarket</p>
		</footer>
	</div>
	
</body>