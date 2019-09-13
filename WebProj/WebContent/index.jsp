<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--strutsタグを使うときに記述--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--1.ここまでJSPファイルの決まり文句 --%>


<title>INDEX</title>
</head>
<body>
	<%--2.フォームタグ内のSubmitでHelloStrutsボタンを作り、
それをHelloStrutsActionに送信する。 --%>
	<s:form action="HelloStrutsAction">
		<%--　<s:を記述することでstruts専用のhtmlタグを呼び出している。HTMLで書く時より少し楽。 --%>
		<s:submit value="HelloStruts" />
	</s:form>
	<%--2.ここまで --%>

	<s:form action="WelcomeAction">
		<s:submit value="Welcome" />
	</s:form>

	<s:form action="InquiryAction">
		<s:submit value="問い合わせ" />
	</s:form>
	
	<br>
	GET通信
	<s:form method="get" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>
	
	POST通信
	<s:form method="post" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>
	

</body>
</html>