<!--
detail.jsp
お問い合わせ詳細1件表示用JSPファイル
藤田夢望
2023/06/(作成完了日付)
-->

<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,bean.Form" %>

<%
Form form = (Form)request.getAttribute("form");
%>

<html>
	<head>
		<title>お問い合わせ詳細</title>
	</head>
	<body>
		<table>
			<tr style="text-align:center">
				<td style="text-align:center; width:500px; font-size:40px;">お問い合わせ詳細画面</td>
				<td><a href="<%=request.getContextPath() %>/bookmark">ブックマーク一覧</a></td>
				<td><a href="<%=request.getContextPath() %>/list">お問い合わせ一覧</a></td>
			</tr>
		</table>
		<hr>
		<form action="<%=request.getContextPath() %>/view/sendmail.jsp">
			<table style="margin:auto">
				<%if(!(form == null)) {%>
				<tr>
					<th>No：</th>
					<th>&emsp;</th>
					<th style="text-align:left"><%= form.getFormid() %></th>
					<td id="fav" id="text">ブックマーク</td>
				</tr>
				<tr>
					<th>氏名：</th>
					<th >&emsp;</th>
					<th><%= form.getName() %></th>
				</tr>
				<tr>
					<th>性別：</th>
					<th>&emsp;</th>
					<th><%= form.getSex() %></th>
				</tr>
				<tr>
					<th>年齢：</th>
					<th>&emsp;</th>
					<th><%= form.getAge() %></th>
				</tr>
				<tr>
					<th>メールアドレス：</th>
					<th>&emsp;</th>
					<th><%= form.getEmail() %></th>
				</tr>
				<tr>
					<th>住所：</th>
					<th>&emsp;</th>
					<th><%= form.getAddress() %></th>
				</tr>
				<tr>
					<th>問い合わせ項目：</th>
					<th>&emsp;</th>
					<th><%= form.getForm() %></th>
				</tr>
				<tr>
					<th>問い合わせ内容：</th>
					<th>&emsp;</th>
					<th><%= form.getContent() %></th>
				</tr>
				<tr>
					<th>&emsp;</th>
					<th style="width: 8px">&emsp;</th>
					<td colspan=2 style="text-align: center">
					<input type="submit" name="sendmail"value="返信"></td>
				</tr>
				<%}else{ %>
				<tr>
					<th>No：</th>
					<th>&emsp;</th>
					<td id="fav" id="text">ブックマーク</a></td>
				</tr>
				<tr>
					<th>氏名：</th>
					<th >&emsp;</th>
				</tr>
				<tr>
					<th>性別：</th>
					<th>&emsp;</th>
				</tr>
				<tr>
					<th>年齢：</th>
					<th>&emsp;</th>
				</tr>
				<tr>
					<th>メールアドレス：</th>
					<th>&emsp;</th>
				</tr>
				<tr>
					<th>住所：</th>
					<th>&emsp;</th>
				</tr>
				<tr>
					<th>問い合わせ項目：</th>
					<th>&emsp;</th>
				</tr>
				<tr>
					<th>問い合わせ内容：</th>
					<th>&emsp;</th>
				</tr>
				<tr>
					<th>&emsp;</th>
					<th style="width: 8px">&emsp;</th>
					<td colspan=2 style="text-align: center">
					<input type="submit" name="sendmail"value="返信"></td>
				</tr>
				<%} %>
			</table>
			<script type="text/javascript">
				//テキスト"ブックマーク"をクリックしたら
				document.getElementById('text').onclick = function(){
					var element = document.getElementById('fav');
					element.innerHTML = "ブックマーク削除";
				}
				//テキスト"ブックマーク削除"をクリックしたら
				document.getElementById('text').onclick = function(){
					var element = document.getElementById('fav');
					element.innerHTML = "ブックマーク";
				}
			</script>
		</form>
	</body>
</html>
