/*
 * ListServlet.java
 * 一覧
 * 金森未紗
 * 2023/06/23
 *
 */

package servlet;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Form;
import dao.FormDAO;

public class ListServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String error = "";
		String cmd = "";

		try {
			// フォームのインスタンス化
			Form form = new Form();

			// DAOのインスタンス化
			FormDAO formObjDAO = new FormDAO();

			// 関連メソッドの呼び出し
			ArrayList<Form> list = formObjDAO.selectAll();

			//リクエストスコープ
			request.setAttribute("list", list);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示は行えませんでした。";
			cmd = "logout";

		} finally {

			// フォワード先を分ける
			if (error.equals("")) {
				// Listへ
				request.getRequestDispatcher("/view/list.jsp").forward(request, response);

			} else {
				// エラー画面へ
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}

	}
}
