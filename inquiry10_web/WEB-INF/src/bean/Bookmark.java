package bean;

public class Bookmark {

	//管理者ID
	private int bookid;

	//対象ユーザID
	private int userid;

	//問い合わせID
	private int formid;

	/*
	 * コンストラクタ
	 * ブックマーク情報(管理者ID,対象ユーザID,問い合わせID)の
	 * 初期設定を行う
	 */


	public Bookmark() {
		this.bookid = 0;
		this.userid = 0;
		this.formid = 0;
	}

	//getメソッド
	public int getBookid() {
		return bookid;
	}

	public int getUserid() {
		return userid;
	}

	public int getFormid() {
		return formid;
	}

	//setメソッド
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public void setFormid(int formid) {
		this.formid = formid;
	}


}
