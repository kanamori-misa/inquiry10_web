/*
 * UserInsertServlet.java
 *管理者登録機能サーブレット
 * 福田征範
 * 2023/06/22
 *  */
package servlet;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

import bean.User;
import dao.UserDAO;

public class UserInsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 変数宣言
		String error = "";// エラー文表示用変数
		String cmd = "";// cmd用変数
		// オブジェクト化
		UserDAO userObjDao = new UserDAO();
		User user = new User();
		// コンテンツタイプの指定
		request.setCharacterEncoding("UTF-8");

		try {

			// パラメータ取得
			String name = request.getParameter("name");
			String password = request.getParameter("password");

			// 例外
			// 名前未入力時エラー
			if (name.equals("")) {
				error = "名前が未入力の為、管理者登録は行えませんでした。";
				cmd = "userinsert";
				return;
			}

			// 検索メソッド呼び出し
			user = userObjDao.selectByUser(name, password);
			// 名前既登録時エラー
			if (user.getName() != null) {
				error = "入力された名前は既に登録済みの為、管理者登録は行えませんでした。";
				cmd = "userinsert";
				return;
			}

			// パスワード未入力時エラー
			if (password.equals("")) {
				error = "パスワードが未入力の為、管理者登録は行えませんでした。";
				cmd = "userinsert";
				return;
			}
			// パスワード未入力時エラー
			if (name.equals("")) {
				error = "名前が未入力の為、管理者登録は行えませんでした。";
				cmd = "userinsert";
				return;
			}

			// セッター
			user.setName(name);
			user.setPassword(password);
			// 登録メソッド呼び出し
			userObjDao.insert(user);
		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、管理者登録は行えませんでした。";
			cmd = "logout";
		}  finally {
			// フォワード
			if (error.equals("")) {
				// 管理者登録登録へフォワード
				request.getRequestDispatcher("/view/insert.jsp").forward(request, response);
			} else {
				// エラー時フォワード
				request.setAttribute("cmd", cmd);
				request.setAttribute("error", error);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}

	}
}
