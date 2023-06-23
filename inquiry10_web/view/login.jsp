<!-- ログイン画面　　2023/06/22　　正路友梧 -->>
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="Servlet.LoginServlet"%>
<html>
<head>
<title>ログイン</title>
</head>
<body>
	<table>
		<tr style="text-align: center">
			<td style="text-align: center; width: 500px; font-size: 40px;">ログイン画面</td>
			<td><a href="/Web">Webサイトに戻る</a></td>
		</tr>
	</table>
	<hr>
	<div style="margin-bottom: 350px">
		<div style="margin-top: 100px"></div>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<table style="margin: auto">
				<tr>
					<th>ログインID:</th>
					<th><input type=text size="30" name="user"></input></th>
				</tr>
				<tr>
					<th>パスワード：</th>
					<th><input type=password size="30" name="password"></input></th>
				</tr>
				<tr>
					<td>&emsp;</td>
				</tr>
				<tr>
					<td>&emsp;</td>
				</tr>
				<tr>
					<td colspan=2 style="text-align: center"><input type="submit"
						name="login" value="ログイン"></td>
				</tr>
			</table>
		</form>
	</div>
	<div style="margin-bottom: 400px"></div>
</body>
</html>