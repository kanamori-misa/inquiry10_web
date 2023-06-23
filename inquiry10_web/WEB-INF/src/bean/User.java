/*
 * User.java
 * ユーザー情報用DTO
 * 大久保レイ
 * 2023/06/22
 *
 * */
package bean;

public class User {
	//ユーザーのID
		private int userid;

		//名前
		private String name;

		//パスワード
		private String password;


	//getメソッド
		//userid
		public int getUserid() {
			return userid;
		}

		//name
		public String getName() {
			return name;
		}

		//password
		public String getPassword() {
			return password;
		}

	//setメソッド
		//userid
		public void setUserid(int userid) {
			this.userid = userid;
		}

		//name
		public void setName(String name) {
			this.name = name;
		}

		//password
		public void setPassword(String password) {
			this.password = password;
		}

}
