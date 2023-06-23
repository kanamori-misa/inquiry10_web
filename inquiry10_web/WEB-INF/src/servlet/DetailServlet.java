/*
 * DetailServlet.java
 * お問い合わせ詳細1件表示用サーブレット
 * 藤田夢望
 * 2023/06/23
 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Form;
import dao.FormDAO;

public class DetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		Form form = new Form();
		FormDAO Fdao = new FormDAO();

		// 文字コードの設定
		request.setCharacterEncoding("UTF-8");

		// エラーメッセージ格納変数
		String error = "";
		String cmd = "";

		// パラメータを取得
		String formid = request.getParameter("formid");

		try {
			form = Fdao.selectByFormid(formid);
			if(form == null) {
				//errorにメッセージを代入
				error = "該当データが存在しなかったため、詳細表示ができませんでした。";

				//cmdに次のフォワード先を指定するコードを代入
				cmd = "list";
				return;
			}
			request.setAttribute("form", form);
		} catch (Exception e) {
			// errorにエラーメッセージを代入。
			error = "DB接続エラーの為、お問い合わせの詳細は表示できませんでした。";

			// cmdに次のフォワード先を指定するコードを代入
			cmd = "logout";
		} finally {
			if (!error.equals("")) {
				// JSPファイルerrorへフォワード
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			} else {
				// JSPファイルdetailへ遷移する。
				request.getRequestDispatcher("/view/detail.jsp").forward(request, response);
			}
		}

	}

}
