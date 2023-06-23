package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Form;
import dao.FormDAO;

public class SendFormServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String error = "";
		String cmd = "";
		Form formObj = new Form();
		// BookDAOオブジェクト生成
		FormDAO formObjDAO = new FormDAO();
		try {

			// 入力データの文字コードの指定
			request.setCharacterEncoding("UTF-8");

			// お問い合わせの入力パラメータを取得する
			//String formid = request.getParameter("formid");
			String name = request.getParameter("name");
			String strAge = request.getParameter("age");
			String email = request.getParameter("email");
			String sex = request.getParameter("sex");
			String address = request.getParameter("address");
			String form = request.getParameter("form");
			String content = request.getParameter("content");

			// 取得したパラメータの各エラーチェックをおこなう
			// パラメータの空白チェック（パラメータが入力されているかどうか）
			if (name.equals("")) {
				error = "nameが未入力の為、お問い合わせ処理は行えませんでした。";
				cmd = "list";
				return;
			}

			if (email.equals("")) {
				error = "emailが未入力の為、お問い合わせ処理は行えませんでした。";
				cmd = "list";
				return;
			}

			if (form.equals("")) {
				error = "formが未入力の為、お問い合わせ処理は行えませんでした。";
				cmd = "list";
				return;
			}

			if (content.equals("")) {
				error = "contentが未入力の為、お問い合わせ処理は行えませんでした。";
				cmd = "list";
				return;
			}

			int age;
			try {
				//整数かどうか）
				age = Integer.parseInt(strAge);
			} catch (NumberFormatException e) {
				error = "価格の値が不正の為、処理は行えませんでした。";
				cmd = "list";
				return;
			}



			// formのオブジェクトを生成し、各setterメソッドを利用し設定する

			//formObj.setFormid(Integer.parseInt(formid));
			formObj.setName(name);
			formObj.setAge(age);
			formObj.setEmail(email);
			formObj.setSex(Integer.parseInt(sex));
			formObj.setAddress(address);
			formObj.setForm(Integer.parseInt(form));
			formObj.setContent(content);


			// ↑で生成したFormObjのオブジェクトを引数として、関連メソッドを呼び出す
			formObjDAO.insert(formObj);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、処理は行えませんでした。";
			cmd = "menu";
		}
		finally {
			// エラーの有無でフォワード先を呼び分ける
			if (error.equals("")) {
				// エラーが無い場合はsentformにフォワード
				request.getRequestDispatcher("/view/sentform.jsp").forward(request, response);
			} else {
				// エラーが有る場合はerror.jspにフォワードする
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}
	}

}
