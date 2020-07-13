<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Welcome</h2>
	 <!-- <s:label value="first Name" />
	<s:property value="first_Name"/><br/>
	
	<s:label value="Last Name" />
	<s:property value="last_Name"/><br/>  -->

	<table width="1000" class="userTable" align="center" >
		<thead>
			<tr>
                <th>User ID</th>
                <th>Email Address</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th colspan="2" >Actions</th>
			</tr>
		</thead>
		<s:iterator value="users" var="user" >
		<tr>
			<td> <s:property value="#user.user_id"/> </td>
			<td> <s:property value="#user.email_Address"/></td>
			<td> <s:property value="#user.first_Name"/></td>
			<td> <s:property value="#user.last_Name"/></td>
			<td> <a href="updateUserAction?user_id=<s:property value="#user.user_id" />"><button>Update</button></a></td>
			<td> <a href="deleteAction?user_id=<s:property value="#user.user_id" />"><button>Delete</button></a></td>
		</tr>
		</s:iterator>
	</table>
	
</body>
</html>