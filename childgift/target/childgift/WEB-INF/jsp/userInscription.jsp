<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@include file="include/importTags.jsp" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>User</title>
	</head>
	
	<body>
		<form:form	id="formInscription"
					method="POST"
					action="/childgift/userInscription/send"
					modelAttribute="currentUser">
			<form:label path="name"><spring:message code="lastName"/></form:label>
			<form:input path="name"/>
			<br/><br/>
			
			<form:label path="age"><spring:message code="age"/></form:label>
			<form:input path="age"/>
			<br/><br/>
			
			<form:radiobutton path="male" value="true" label="Boy"></form:radiobutton>
			<form:radiobutton path="male" value="false" label="Girl"></form:radiobutton>
			<br/><br/>
			
			<form:select path="hobby">
						<form:options items="${hobbies}" itemValue="name" itemLabel="name" />
			</form:select>
			<form:button><spring:message code="sendButton"/></form:button>
		</form:form>
	</body>
</html>
>