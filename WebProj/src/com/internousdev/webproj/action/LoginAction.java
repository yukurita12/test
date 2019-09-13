package com.internousdev.webproj.action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;//フィールド変数（フィールド）:クラスブロック内に書かれた変数
	private String password;//フィールド変数（フィールド）
	
	public String execute() {
		return SUCCESS;
	}
	
	public String getUsername() {
		return username;//getの時は必ずリターンする
	}
	
	public void setUsername(String username) {
		this.username=username;//青字:フィールド変数　赤字:ローカル変数？
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	

}
