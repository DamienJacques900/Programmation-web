<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix ="tiles"%>

<!DOCTYPE HTML>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<link type="text/css" href="<spring:url value='/css/first.css' />" rel="StyleSheet">
		
		<title>Welcome</title>
	</head>
	
	<body>
		<header>
			<p>www.siteTest.com</p>
		</header>
		
		<div>
			<tiles:insertAttribute name="main-content"/>
		</div>
		
		<spring:url var="localeFr" value="">
			<spring:param name="locale" value="fr"/>
		</spring:url>
		
		<spring:url var="localeEn" value="">
			<spring:param name="locale" value="en"/>
		</spring:url>
		
		<a href="${localeFr}">
			<img src ='<spring:url value="/images/francais.png"/>' height="50px" width="50px"/>
		</a>
		
		<a href="${localeEn}">
			<img src ='<spring:url value="/images/anglais.png"/>' height="50px" width="50px"/>
		</a>
		
		<img src ='<spring:url value="/images/mario.png"/>'/>
		
		<footer>
			<p>Copyright C taritata</p>
		</footer>
	</body>
</html>