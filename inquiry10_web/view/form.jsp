<!-- 2023/06/22 杉田洋人 お問い合わせフォーム -->
<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>お問い合わせフォーム</title>
</head>
<body>
	<table>
           <tr style="text-align:center">
           <td style="text-align:center; width:500px; font-size:40px;">お問い合わせフォーム</td>
           </tr>
    </table>
    <hr>
	<table style="margin: auto">
	<form>
		<tr>
			<th style="text-align:left">氏名:</th>
			<th><input type="text" name="name"></input></th>
		</tr>

		<tr>
			<th style="text-align:left">年齢:&nbsp;<input type="text" size="2" name="age"></input></th>
			<th style="text-align:left">性別:<input type="radio" name="gender" value="man">男<input type="radio" name="gender" value="woman">女</th>
		</tr>

		<tr>
			<th style="text-align:left">住所:</th>
			<th><input type="text" name="address"></th>
		</tr>

		<tr>
			<th style="text-align:left">メールアドレス:</th>
			<th><input type="text" name="mail"></th>
		</tr>

		<tr>
			<th style="text-align:left">問い合わせ項目</th>
			<th><select name="koumoku">
			<option value="1" >料金・お支払いについて</option>
			<option value="2">講座、コース、教材について</option>
			<option value="3">学習の進め方について</option>
			<option value="4">受講期限について>/option>
			<option value="5">受講終了後のサポートについて</option>
			</select></th>
		</tr>

		<tr>
			<th style="text-align: left" colspan="2">自由記入欄(200文字まで入力可)：<br>
			<textarea name="message" rows="5" cols="40"></textarea></th>
		</tr>

		<tr>
			<th style="text-align:center" colspan="4"><input type="submit" value="確認"></th>
		</tr>

	</form>
	</table>
</body>
</html>
