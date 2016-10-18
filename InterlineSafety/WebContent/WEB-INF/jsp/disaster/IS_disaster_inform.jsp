<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	    <meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="初期画面">
	    <meta name="author" content="李珍瑞">
			<title>Main</title>
      	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
 	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>Disaster List</title>
</head>
<body>

<!-- IS_mainmenu -->
<jsp:include page="/WEB-INF/jsp/include/IS_mainmenu.jsp" flush="false" />

<font size="5">災害情報管理</font><p>

<s:form action="Write" method="post"><s:submit value="新規登録"/></s:form><p>

<table border="1" width="50%">
	<tr align="center" bgcolor="#778899">
		<td>発生日時</td>
		<td>発生場所</td>
		<td>発生内容</td>
		<td>状況</td>
		<td>修正</td>
		<td>削除</td>
	</tr>

	<s:iterator value="list" status="stat">
	<s:form>
	<tr align="center">
		<s:hidden name="DisasterId" value="%{DisasterId}" />
		<td> <s:property value="YYYYMMDD" /> </td>
		<td> <s:property value="DisasterPlace" /> </td>
		<td> <s:property value="Disaster" /> </td>
		<td> <s:property value="DisasterStateName" /> </td>
		<td> <s:submit value="修正" align="center" action="ModifyFormAction" /> </td>
		<td> <s:submit value="削除" align="center" onclick='return confirm("削除してよろしいでしょうか？");' action="DeleteAction" /> </td>
	</tr>
	</s:form>
	</s:iterator>

</table>

</body>
</html>