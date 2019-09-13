package com.internousdev.webproj3.action;
import com.internousdev.webproj3.dao.HelloStrutsDAO;
import com.internousdev.webproj3.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport {
	private String result;
	
	public String execute() {
		String ret=ERROR;//エラーが起きた時にsuccessが実行されないように最初にret変数にerrorを代入する。
		HelloStrutsDAO dao=new HelloStrutsDAO();
		HelloStrutsDTO dto =new HelloStrutsDTO();
		dto=dao.select();
		System.out.println(dto.getResult());
		result=dto.getResult();
		
		if(result.equals("MySQLと接続できます。")) {
			ret=SUCCESS;
		}
		else {
			ret=ERROR;		}
		return ret;//successかerrorを返す
	}public String getResult() {
		return result;
	}public void setResult(String result) {
		this.result=result;
	}

}
