<%@page contentType="text/html; charset=UTF-8"%>
<%
/*
 * List.jsp
 *一覧画面
 * 金森未紗
 * 2023/06/22
 *  */
 %>

<html>

<head>
    <meta charset="UTF-8"> 
    <title>お問い合わせ一覧</title>
</head>
<body>
<table>
           <tr style="text-align:center">
                <td style="text-align:center; width:500px; font-size:40px;">お問い合わせ一覧</td>
                <td><a href="bookmark.html">ブックマーク一覧</a></td>
                <td><a href="adminInsert.html">管理者登録</a></td>
                <td><a href="login.html">ログアウト</a></td>
            </tr>
        </table>
        <hr> 
	<table style="margin:auto; width:1500px">
		<tr>
			<td>No.</td>
			<td>氏名</td>
			<td>種類</td>
			<td>問い合わせ日時</td>
			<td>お問い合わせ内容</td>
			<td>返信状況</td>
			<td>ブックマーク登録</td>
		</tr>
		
		
		
		<tr>
			<td><a href = "detail.html">3</a></td>
			<td>神田太郎</td>
			<td>料金・お支払いについて</td>
			<td>2023/05/18 14:20</td>
			<td>各種お支払方法を教えてほしいです。</td>
			<td>未返信</td>
			<td><a href = "bookmark.html">ブックマーク</a></td>
		</tr>
		<tr>
			<td>2</td>
			<td>西太郎</td>
			<td>講座、コース、教材について</td>
			<td>2023/05/18 13:10</td>
			<td>必要な教材等はありますでしょうか？</td>
			<td>返信済み</td>
			<td><a href = " ">ブックマーク</a></td>
		</tr>
		<tr>
			<td>1</td>
			<td>東太郎</td>
			<td>受講期限について</td>
			<td>2023/05/17 14:20</td>
			<td>どのくらいの期間なのでしょうか？</td>
			<td>返信済み</td>
			<td><a href = "bookmark.html">ブックマーク</a></td>
		</tr>
	</table>
</body>
</html>


</html>