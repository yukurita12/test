package com.internousdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj5.dao.HelloStrutsDAO;
import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport implements SessionAware {
	private List<HelloStrutsDTO> helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();
	private Map<String, Object> session;
	
	public String execute() {
		String ret=ERROR;//エラーが起きた時にsuccessが実行されないように最初にret変数にerrorを代入する。
		HelloStrutsDAO dao=new HelloStrutsDAO();
		helloStrutsDTOList =dao.select();
		
		if(helloStrutsDTOList.size()>0) {
			session.put("helloStrutsDTOList", helloStrutsDTOList);
			ret=SUCCESS;
		}else {
			ret=ERROR;
		}
		System.out.println(session);
		return ret;
	}public Map<String, Object>getSession(){
		return session;
	}
	public void setSession(Map<String, Object>session) {
		this.session=session;
	}
		

}
