<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>

<h1>以下のユーザーが登録されました。</h1>

<br>
<table>
<tbody>
<tr>
	<th>USERNAME</th>
	<th>PASSWORD</th>
</tr>
<s:iterator value="#session.loginDTOList">
<tr>
	<td><s:property value="username"/></td>
	<td><s:property value="password"/></td>
</tr>

</s:iterator>

</tbody>
</table>

</body>
</html>