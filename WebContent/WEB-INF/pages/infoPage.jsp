<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>InfoPage</title>
</head>
<body>
	<p>Enter your information:</p>
	<form:form method="POST" action="addInfo" commandName="user">
		<table>
			<tr>
				<td><form:label path="firstName">First name:</form:label></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last name:</form:label></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<h4>errors: ${errors}</h4>
	
	<p>Your Information:</p>
	<table>
		<tr>
			<td>First Name</td>
			<td>${firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${lastName}</td>
		</tr> 
	</table>

</body>
</html>
