<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@include file="include/importTags.jsp" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Welcome</title>
	</head>
	
	<body>
		Welcome in our magic world!
		<h1>Validation</h1>
		<form:form	id="form"
					method="POST"
					action="/childgift/welcome/send"
					modelAttribute="magicKeyForm">
			<label>Magic Key :</label>
			<input></input>
			<button>Send</button>
		</form:form>
	</body>
</html>