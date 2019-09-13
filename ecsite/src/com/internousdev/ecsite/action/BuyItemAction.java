package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	private Map<String,Object> session;
	private int count;
	private String pay;
	
	public String execute() {
		String result=SUCCESS;
		session.put("count", count);
		int intCount=Integer.parseInt(session.get("count").toString());//OBJECT型で入っている値をまずSTRING型に変更。その値をINT型に変えることで19行目の掛け算が可能になる。
		int intPrice=Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price", intCount * intPrice);
		String payment;//今定義した変数
		
		if(pay.equals("1")) {
			payment="現金払い";//変数paymentに現金払いを代入
			session.put("pay", payment);//現金払いという値の入ったpaymentをセッションに入れる。keyはpay。
		}else {
			payment="クレジットカード";
			session.put("pay", payment);
		}return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

}
