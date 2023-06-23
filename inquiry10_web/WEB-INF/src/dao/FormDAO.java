/*
 * FormDAO.java
 *お問い合わせフォームウェブフォーム用DAO
 * 濵岡楓芽
 * 2023/06/22
 *  */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Form;

public class FormDAO {


	private static final String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/formdb";
	private static final String USER = "root";
	private static final String PASSWD = "root123";

	public static Connection getConnection() {
		try{
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		}catch(Exception e){
			throw new IllegalStateException(e);
		}
	}

	public void insert(Form form) {

		//変数宣言
		Connection con = null;
		Statement smt = null;

		try {
			//変数sqlにSQL文を格納
			String sql = "INSERT INTO forminfo(formid,name,age,email,sex,address,form,content,date,mailstate) " +
									"VALUES(NULL,'"+form.getName()+"',"+form.getAge()+",'"
					+form.getEmail()+"',"+form.getSex()+",'"+form.getAddress()+"',"
									+form.getForm()+",'"+form.getContent()+"',CURDATE(),"+0+")";

			//オブジェクト生成
			con = getConnection();
			smt = con.createStatement();

			//SQL文の発行
			smt.executeUpdate(sql);
		}catch(Exception e) {
			throw new IllegalStateException(e);
		}finally {
			//接続解除
			if(smt != null) {
				try {smt.close();}catch(SQLException ignore) {}
			}
			if(con != null) {
				try {con.close();}catch(SQLException ignore) {}
		}
	}

	}
	public Form selectByFormid(String formid){
		// Bookクラスをインスタンス化・SQL文作成
		Form form = new Form(); // これは戻り値
		String sql = "SELECT * FROM forminfo WHERE formid = '" + formid + "'";

		Connection con = null;
		Statement smt = null;

		try {
			con = getConnection();
			smt = con.createStatement();

			// SQL文発行
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) { // 検索結果をbookに格納
				form.setFormid(rs.getInt("formid"));
				form.setName(rs.getString("name"));
				form.setAge(rs.getInt("age"));
				form.setEmail(rs.getString("email"));
				form.setSex(rs.getInt("sex"));
				form.setAddress(rs.getString("address"));
				form.setForm(rs.getInt("form"));
				form.setContent(rs.getString("content"));
			}

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally { // リソースの開放
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {}
			}
		}
		return form;
	}

	public ArrayList<Form> selectAll()	{

		ArrayList<Form> list = new ArrayList<Form>();
		String sql = "SELECT * FROM forminfo ORDER BY formid";

		Connection con = null;
		Statement  smt = null;
		try{
			con = FormDAO.getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while(rs.next()){
				Form forms = new Form();
				forms.setFormid(rs.getInt("formid"));
				forms.setName(rs.getString("name"));
				forms.setForm(rs.getInt("form"));
				forms.setDate(rs.getString("date"));
				forms.setContent(rs.getString("content"));
				forms.setMailstate(rs.getInt("mailstate"));

				list.add(forms);
			}

		}catch(Exception e){
			throw new IllegalStateException(e);
		}finally{
			if(smt != null){
				try{smt.close();}catch(SQLException ignore){}
			}
			if(con != null){
				try{con.close();}catch(SQLException ignore){}
			}
		}
		return list;

	}


	public ArrayList<Form> search(String form,String mailstate){

		ArrayList<Form> list = new ArrayList<Form>();
		String sql = "SELECT form,mailstate FROM forminfo " + "WHERE form LIKE '%" + form + "%' AND mailstate LIKE '%" + mailstate + "%'";

		Connection con = null;
		Statement  smt = null;

		try {

			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while(rs.next()){
				Form forms = new Form();
				forms.setFormid(rs.getInt("formid"));
				forms.setName(rs.getString("name"));
				forms.setForm(rs.getInt("form"));
				forms.setDate(rs.getString("date"));
				forms.setContent(rs.getString("content"));
				forms.setMailstate(rs.getInt("mailstate"));

				list.add(forms);
			}

		}catch(Exception e) {
			throw new IllegalStateException(e);
		}finally {
			//接続解除
			if(smt != null) {
				try {smt.close();}catch(SQLException ignore) {}
			}
			if(con != null) {
				try {con.close();}catch(SQLException ignore) {}
			}
		}
		return list;
	}


}
