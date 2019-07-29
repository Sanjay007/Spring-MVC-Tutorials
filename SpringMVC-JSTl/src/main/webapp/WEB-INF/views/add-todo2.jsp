<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Example - Register an Employee</title>
</head>

<body>
${msg}

<form:form method="POST" action="/addemp" modelAttribute="employee">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name"  /></td>
			</tr>
			
			<tr>
				<td><form:label path="contactNumber">Contact Number</form:label></td>
				<td><form:input path="contactNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="workingArea">Working Area</form:label></td>
				<td><form:input path="workingArea" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>



    <form action="/add-todo" method="POST" >
        Description : <input name="desc" type="text" /> <input type="submit" value="add" />
    </form>
</body>
</html>