/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2023-06-23 08:49:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import bean.Form;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.Form");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\r\n");
      out.write("detail.jsp\r\n");
      out.write("お問い合わせ詳細1件表示用JSPファイル\r\n");
      out.write("藤田夢望\r\n");
      out.write("2023/06/(作成完了日付)\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

Form form = (Form)request.getAttribute("form");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>お問い合わせ詳細</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t<td style=\"text-align:center; width:500px; font-size:40px;\">お問い合わせ詳細画面</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"");
      out.print(request.getContextPath() );
      out.write("/bookmark\">ブックマーク一覧</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"");
      out.print(request.getContextPath() );
      out.write("/list\">お問い合わせ一覧</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/view/sendmail.jsp\">\r\n");
      out.write("\t\t\t<table style=\"margin:auto\">\r\n");
      out.write("\t\t\t\t");
if(!(form == null)) {
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>No：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"text-align:left\">");
      out.print( form.getFormid() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t<td id=\"fav\" id=\"text\">ブックマーク</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>氏名：</th>\r\n");
      out.write("\t\t\t\t\t<th >&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getName() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>性別：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getSex() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>年齢：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getAge() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>メールアドレス：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getEmail() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>住所：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getAddress() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>問い合わせ項目：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getForm() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>問い合わせ内容：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.print( form.getContent() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"width: 8px\">&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<td colspan=2 style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"sendmail\"value=\"返信\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>No：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<td id=\"fav\" id=\"text\">ブックマーク</a></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>氏名：</th>\r\n");
      out.write("\t\t\t\t\t<th >&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>性別：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>年齢：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>メールアドレス：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>住所：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>問い合わせ項目：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>問い合わせ内容：</th>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"width: 8px\">&emsp;</th>\r\n");
      out.write("\t\t\t\t\t<td colspan=2 style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"sendmail\"value=\"返信\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t//テキスト\"ブックマーク\"をクリックしたら\r\n");
      out.write("\t\t\t\tdocument.getElementById('text').onclick = function(){\r\n");
      out.write("\t\t\t\t\tvar element = document.getElementById('fav');\r\n");
      out.write("\t\t\t\t\telement.innerHTML = \"ブックマーク削除\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//テキスト\"ブックマーク削除\"をクリックしたら\r\n");
      out.write("\t\t\t\tdocument.getElementById('text').onclick = function(){\r\n");
      out.write("\t\t\t\t\tvar element = document.getElementById('fav');\r\n");
      out.write("\t\t\t\t\telement.innerHTML = \"ブックマーク\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
