<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>
<body>
	<div id="global">
		<h1>Book List</h1>
		<a href="<c:url value="/book_input" />">Add Book</a>
		<table>
			<tr style="background: #ababff">
				<th>Category</th>
				<th>Title</th>
				<th>ISBN</th>
				<th>Author</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${books }" var="book" varStatus="status">
			
				<c:if test="${status.count%2==0}">
				${status.count}
					<tr style="background: #eeeeee">
				</c:if>
				<c:if test="${status.count%2!=0}">
					<tr style="background: #ffffff">
				</c:if>
				<td>${book.category.name }</td>
				<td>${book.title }</td>
				<td>${book.isbn }</td>
				<td>${book.author }</td>
				<td><a href="/book_edit/${book.id }">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>