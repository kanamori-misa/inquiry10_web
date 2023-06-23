<!--
	userinsert.jsp
	問い合わせフォーム一覧画面
	福田征範
	2023/06/22
 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList"%>
<html>
	<head>
	<title>管理者登録</title>
	</head>
	<body >
	<table>
		<tr style="text-align:center">
			<td style="text-align:center; width:500px; font-size:40px;">管理者登録</td>
			<td><a href="<%=request.getContextPath()%>/view/list.jsp">お問い合わせ一覧</a></td>
			<td><a href="<%=request.getContextPath()%>/logout">ログアウト</a></td>
		</tr>
	</table>
		<hr style="height: 2; background-color: #000000" />
		<form action="<%=request.getContextPath() %>/userinsert">
			<table style="margin:0 auto">
				<tr>
				<th style="text-align: center">管理者ID：</th>
  				<th><input type=text size="30" name="name"></input></th>　
			</tr>
			<tr>
				<th style="text-align: center">パスワード：</th>
  				<th><input type=password size="30" name="password"></input></th>
			</tr>
			<tr>
 				<td colspan=2 style="text-align:center">
 					<input type="submit" value="登録">
 				</td>
 			</tr>
 		</table>
 	</form>
</body>
</html>