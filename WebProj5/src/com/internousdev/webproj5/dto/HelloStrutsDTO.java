package com.internousdev.webproj5.dto;
//DAOがDBから取得した値をActionへ戻す時、値を格納するのに利用される。
//DTOクラスには必要なテーブルのデータのカラムに対応したフィールド変数とゲッターセッターのみを定義する。
public class HelloStrutsDTO {
	private int userId;
	private String userName;//テーブルから取得するデータに対応したフィールド変数を宣言
	private String password;
	private String result;
	
	
	
	//フィールド変数に対応したgetterとsetterを定義
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId=userId;
	}
	
	public String getUserName() {//Actionクラスから呼び出され、userNameフィールドの値をActionに渡す。
		return userName;
	}
	
	public void setUserName(String userName) {//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のnameフィールドに格納する。
		this.userName=userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result=result;
	}

}
