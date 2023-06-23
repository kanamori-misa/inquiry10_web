/*
 * loginServlet.java
 * ログイン画面
 * 正路　友梧
 * 2023/06/22
 *
 */




package Servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.User;
import user_DAO.UserDAO;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 変数
		String error = "";
		String cmd = "";

		// オブジェクト宣言
		UserDAO userDaoObj = new UserDAO();

		// エンコードの設定
		request.setCharacterEncoding("UTF-8");

		try {
			// パラメータの取得
			String userid = request.getParameter("user");
			String password = request.getParameter("password");

			// 関連メソッドの呼び出し
			User user = userDaoObj.selectByUser(userid, password);

			if (userid.equals("")) {
				error = "ユーザーIDが未入力の為、ログインは行えませんでした。";
				cmd = "logout";
				return;
			} else if (password.equals("")) {
				error = "パスワードが未入力の為、ログイン出来ませんでした。";
				cmd = "logout";
				return;
			} else {
				// セッションスコープ
				HttpSession session = request.getSession();
				session.setAttribute("user", user);

				// ユーザー用クッキーの生成
				Cookie userCookie = new Cookie("userid", userid);
				userCookie.setMaxAge(60 * 60 * 24 * 5);
				response.addCookie(userCookie);

				// パスワード用クッキーの生成
				Cookie passwordCookie = new Cookie("password", password);
				passwordCookie.setMaxAge(60 * 60 * 24 * 5);
				response.addCookie(passwordCookie);
			}

		// エラー処理
		} finally {
			if (error.equals("")) {
				// フォワード処理
				request.getRequestDispatcher("/view/menu.jsp").forward(request, response);
			} else {
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);

				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}
	}

}
