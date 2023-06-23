<!--
	error.jsp
	問い合わせフォームウェブエラー画面
	福田征範
	2023/06/22
 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%
String error = (String)request.getAttribute("error");
String cmd = (String)request.getAttribute("cmd");
%>
<html>
	<head>
	<title>エラー</title>
	</head>
	<body style="text-align: center">
		<p >●●エラー●●</p>
		<%= error %>
		<br>
		<%if(cmd.equals("logout")){ %>
		<a href="<%=request.getContextPath()%>/logout"> ログイン画面へ</a>
		<%}else {%>
		<a href="<%=request.getContextPath()%>/list"> 問い合わせ一覧へ戻る</a>
		<%}%>
 	</body>
</html>