package servlet;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Form;



public class ListServlet extends HttpServlet{
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException ,IOException{
		

		String error = "";

		try {
			//フォームのインスタンス化
			Form form = new Form();
			
			//
			
			


	}catch(IllegalStateException e){
		error = "DB接続エラーの為、一覧表示は行えませんでした。";

	}finally{

		//フォワード先を分ける
		if(error.equals("")) {
			request.getRequestDispatcher("/list").forward(request, response);
		}else {
			//エラー画面へ
			request.setAttribute("error",error);
			request.getRequestDispatcher("/view/error.jsp").forward(request, response);
		}
	}
	
	}
}
