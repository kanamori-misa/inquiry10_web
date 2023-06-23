<!-- 2023/06/22 杉田洋人 お問い合わせ送信完了フォーム  -->
<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>問い合わせ送信完了</title>
</head>
<body>


	<table>
           <tr style="text-align:center">
                <td style="text-align:center; width:500px; font-size:40px;">お問い合わせ送信完了</td>
            </tr>
        </table>
        <hr>
	<h2 style="text-align: center">以下の内容でお問い合わせを送信しました。</h2>
	<table style="margin: auto">
	<form action = form.html>

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
			<th style="text-align:center" colspan="4"><input type="submit" value="確認"></th>
		</tr>

	</form>
	</table>
</body>
</html>