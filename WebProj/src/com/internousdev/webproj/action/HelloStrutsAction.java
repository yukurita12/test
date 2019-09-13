package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport {//actionクラスでは基本的にstruts2が持つActionSupportを継承する
	public String execute() {
		return SUCCESS;//SUCCESSという結果をstruts.xmlに返す。
	}

}
