<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transtitional//EN http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>게시글 상세</h1>
		<hr>
		<form action="updateBoard" method="post">
		<input name="seq" type="hidden" value="${board.seq }">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">title</td>
					<td align="left"><input name="title" type="text" value="${board.title }"></td>
				</tr>
				<tr>
					<td bgcolor="orange">writer</td>
					<td align="left">${board.writer }</td>
				</tr>
				<tr>
					<td bgcolor="orange">content</td>
					<td align="left"><textarea name="content" cols="40" rows="10">${board.content }</textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">date</td>
					<td align="left"><fmt:formatDate value="${board.createDate }" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">hit</td>
					<td align="left">${board.cnt }</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="edit post">
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoardView">create post</a>&nbsp;&nbsp;&nbsp;
		<a href="deleteBoard?seq=${board.seq }">delete post</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList">forum list</a>
	</center>
</body>
</html>