<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transtitional//EN http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>새로 글 등록하기</h3>
		<hr>
		<form action="insertBoard" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">title</td><td align="left">
					<input type="text" name="title"></td>
				</tr>
				<tr>
					<td bgcolor="orange">writer</td><td align="left">
					<input type="text" name="writer" size="10"></td>
				</tr>
				<tr>
					<td bgcolor="orange">content</td><td align="left">
					<textarea name="content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="register new post"></td>
				</tr>
			</table>
		</form>
	</center>
<hr>
</body>
</html>