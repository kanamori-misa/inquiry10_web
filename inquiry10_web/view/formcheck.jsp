<!-- 2023/06/22 杉田洋人 お問い合わせ確認フォーム -->
<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>問い合わせ確認</title>
</head>
<body>
	<table>
		<tr style="text-align: center">
			<td style="text-align: center; width: 500px; font-size: 40px;">問い合わせ確認</td>
		</tr>
	</table>
	<hr>

	<form action="<%=request.getContextPath()%>/sendform">
		<table class="input-table" align="center">

			<tr>
				<th style="text-align: left">氏名:</th>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<th style="text-align: left">年齢:</th>
				<td><input type="text" name="age"></td>
				<th>性別:</th>
				<td><input type="radio" value = 1 name="sex">男<input type="radio" name="sex">女</td>
			</tr>

			<tr>
				<th style="text-align: left">住所:</th>
				<td><input type="text" name="address"></td>
			</tr>

			<tr>
				<th style="text-align: left">メールアドレス:</th>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<th style="text-align: left">問い合わせ項目:</th>
				<td><select name="form">
						<option value="1">料金・お支払いについて</option>
						<option value="2">講座、コース、教材について</option>
						<option value="3">学習の進め方について</option>
						<option value="4">受講期限について>/option>
						<option value="5">受講終了後のサポートについて</option>
				</select></td>
			</tr>

			<tr>
				<th style="text-align: left" colspan="2">自由記入欄(200文字まで入力可)：<br>
			</tr>
			<tr>
				<th><textarea name="content" rows="5" cols="40"></textarea></th>
			</tr>



			<tr>
			<td colspan=2 style="text-align: center"><input type="submit"
						name="login" value="ログイン"></td>
				<th style="text-align: center" colspan="4"><a
					href="<%=request.getContextPath()%>/view/sentform.jsp"><input
						type="submit" name="" value="送信"></a>&nbsp; <a
					href="<%=request.getContextPath()%>/view/form.jsp"><input
						type="submit" name="" value="修正"></a></th>
			</tr>


		</table>
	</form>
</body>
</html>
