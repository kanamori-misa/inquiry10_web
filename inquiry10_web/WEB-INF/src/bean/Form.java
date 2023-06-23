/*
 * Form.java
 *お問い合わせフォームウェブフォーム用DTO
 * 福田征範
 * 2023/06/22
 *  */

package bean;

public class Form {

	// フィールド変数
	private int formid; // フォームID
	private String name; // 名前
	private int age; // 年齢
	private String email; // メールアドレス
	private int sex; // 性別
	private String address; // 住所
	private int form; // お問い合わせ項目
	private String content; // お問い合わせ内容
	private int mailstate;// メール返信状況
	private String date;// 日時

	// セッター
	public void setFormid(int formid) {
		this.formid = formid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setForm(int form) {
		this.form = form;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setMailstate(int mailstate) {
		this.mailstate = mailstate;
	}

	public void setDate(String date) {
		this.date = date;
	}

	// ゲット
	public int getFormid() {
		return this.formid;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getEmail() {
		return this.email;
	}

	public int getSex() {
		return this.sex;
	}

	public String getAddress() {
		return this.address;
	}

	public int getForm() {
		return this.form;
	}

	public String getContent() {
		return this.content;
	}

	public int getMailstate() {
		return this.mailstate;
	}

	public String getDate() {
		return this.date;
	}
}
