/*
 * UserDAO.java
 * 管理者DAO   登録,ログイン
 * 正路 友梧
 * 2023/06/22
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.User;

public class UserDAO {
	// フィールド変数
	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/formdb";
	private static String USER = "root";
	private static String PASSWD = "root123";

	// DB接続を行うメソッド定義
	public static Connection getConnection() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	// 新規登録を行うメソッド定義
	public void insert(User user) {
		// 変数宣言
		Connection con = null;
		Statement smt = null;

		try {
			// SQＬ文
			String sql = "INSERT INTO userinfo VALUES('" + user.getUserid() + "','" + user.getPassword() +"','" + user.getName() + ")";

			// オブジェクト生成
			con = getConnection();
			smt = con.createStatement();

			// SQL文を発行
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			// 接続解除
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}

	}

	// 条件に合致する情報を取得するメソッド定義
	public User selectByUser(String userid, String password) {

		// 変数宣言
		Connection con = null;
		Statement smt = null;

		// オブジェクト宣言
		User user = new User();
		try {

			// SQL文
			String sql = "SELECT * FROM userinfo WHERE user ='" + userid + "' AND password='" + password + "'";

			// オブジェクト生成
			con = UserDAO.getConnection();
			smt = con.createStatement();

			// 結果を変数rsに格納
			ResultSet rs = smt.executeQuery(sql);

			// 繰り返し
			while (rs.next()) {
				user.setUserid(rs.getInt("userid"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			// 接続解除
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return user;
	}

}
