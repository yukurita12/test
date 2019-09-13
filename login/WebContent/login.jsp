<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%><%--strutsのタグを使う宣言HTMLのh１、pのようなものがstrutsにもある。sを打てば使える。 --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
 	<s:form action="LoginAction"><%--loginactionにnameとpasswordを送りたい。 --%>
 		<s:textfield name="name"/>
 		<s:password name="password"/>
 		<s:submit value="ログイン"/>
 	</s:form>
</body>
</html>