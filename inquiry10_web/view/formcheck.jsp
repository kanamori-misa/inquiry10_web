<!-- 2023/06/22 杉田洋人 お問い合わせ確認フォーム -->
<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>問い合わせ確認</title>
</head>
<body>
<table>
	<tr style="text-align:center">
		<td style="text-align:center; width:500px; font-size:40px;">問い合わせ確認</td>
	</tr>
</table>
<hr>
<table style="margin: auto">
	<form action = formsend.html>

		<tr>
			<th style="text-align:left">氏名:</th>
			<th>神田太郎</th>
		</tr>

		<tr>
			<th style="text-align:left">年齢:&nbsp;22</th>
			<th style="text-align:left">性別:男</th>
		</tr>

		<tr>
			<th style="text-align:left">住所:</th>
			<th>********</th>
		</tr>

		<tr>
			<th style="text-align:left">メールアドレス:</th>
			<th>*********</th>
		</tr>

		<tr>
			<th style="text-align:left">問い合わせ項目</th>
			<th>料金・お支払いについて</th>
		</tr>

		<tr>
			<th style="text-align: left" colspan="2">自由記入欄(200文字まで入力可)：<br>
			*******************************</th>
		</tr>

		<tr>
			<th style="text-align:center" colspan="4"><a
				href="<%=request.getContextPath()%>/view/formsend.jsp"><input type="submit" name="" value="送信"></a>&nbsp;
			<a href="<%=request.getContextPath()%>/view/form.jsp"><input type="submit" name="" value="修正"></a></th>
		</tr>

	</form>
	</table>
</body>
</html>
