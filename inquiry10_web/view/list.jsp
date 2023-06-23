<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,bean.Form"%>
<!--
	list.jsp
	一覧画面
	金森未紗
	2023/06/23
-->

<html>

<head>
	<meta charset="UTF-8">
	<title>お問い合わせ一覧</title>
</head>
<body>
<table>
	<tr style="text-align:center">
		<td style="text-align:center; width:500px; font-size:40px;">お問い合わせ一覧</td>
		<td><a href="<%=request.getContextPath() %>/view/bookmark.jsp">ブックマーク一覧</a></td>
		<td><a href="<%=request.getContextPath() %>/view/userinsert.jsp">管理者登録</a></td>
		<td><a href="<%=request.getContextPath() %>/logout">ログアウト</a></td>
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
				<%
				ArrayList<Form> list =(ArrayList<Form>)request.getAttribute("list");
				if(list != null){
					for(int i=0;i<list.size();i++){
						Form forms = (Form)list.get(i);
				%>
		<tr>
					<td style="text-align:center; width:200px"><a href="<%=request.getContextPath() %>/detail?formid=<%=forms.getFormid()%>"><%=forms.getFormid()%></a></td>
					<td><%=forms.getName()%></td>
					<td><%=forms.getAge()%></td>
					<td><%=forms.getForm()%></td>
					<td><%=forms.getDate()%></td>
					<td><%=forms.getContent()%></td>
					<td><%=forms.getMailstate()%></td>
					<td><a href = "<%=request.getContextPath() %>/bookmark">ブックマーク</a></td>

		</tr>
		<%
			}
		}
		%>

	</table>
</body>
</html>
