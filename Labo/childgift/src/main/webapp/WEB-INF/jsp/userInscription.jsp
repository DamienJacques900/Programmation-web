<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@include file="include/importTags.jsp" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>User</title>
	</head>
	
	<body>
		<form>
			<label>Name</label>
			<input></input>
			<br>
			<label>Name</label>
			<input></input>
			<br>
			<input type="radio" name="boy" value="true">Boy
			<input type="radio" name="boy" value="false">Girl
			<br>
			<select>
				<option value="sport" label="Sport"/>
				<option value="nature" label="Nature"/>
				<option value="reading" label="Reading"/>
				<option value="music" label="Music"/>
			</select>
			<button>Send</button>
		</form>
	</body>
</html>