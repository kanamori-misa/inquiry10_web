package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// セッションオブジェクトの取得
		HttpSession session = request.getSession();
		// セッションがある場合、セッションを破棄
		if (session != null) {
			session.invalidate();
		}
		// ログインにフォワード
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
}
