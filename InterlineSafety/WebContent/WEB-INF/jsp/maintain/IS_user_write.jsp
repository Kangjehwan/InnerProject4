<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

<title>User Write</title>

</head>
<body>
<!-- IS_mainmenu -->
<jsp:include page="/WEB-INF/jsp/include/IS_mainmenu.jsp" flush="false" />

<s:if test="UserId != null">
	  <font size="5">ユーザー管理(修正)</font><p>
	  <s:form action="MainModifyAction" validate="true">
	  <s:hidden name="UserId" value="%{vo.UserId}"/>
	
	<table border="1" width=430>
	  <tr align="center" bgcolor="#778899">
		<td width=160>名前</td>
		<td width=160>ID</td>
		<td width=110>権限</td>
	  </tr>
	
	  <tr align="center">
		<td> <s:textfield name="UserName" theme="simple" value="%{vo.UserName}" /></td>
		<td> <s:label name="UserId" theme="simple"/> </td>
		<td><s:select name="AuthorityId" theme="simple" 
			list="list2" listKey="AuthorityId" listValue="AuthorityName" value="%{vo.AuthorityId}"/></td>
      </tr>
	</table><br>

	  <s:submit value="登録" align="left" />
	  <s:submit value="戻る" align="left" action="MainListAction"/>
	  <br>
	  <br>
	  <font color="red">${fieldErrors.UserName}</font>
	</s:form>
</s:if>

<s:else>
	<font size="5">ユーザー管理(新規登録)</font><p>
	<s:form action="MainWriteAction" validate="true">
	
	<table border="1" width=430>
	  <tr align="center" bgcolor="#778899">
		<td width=160>名前</td>
		<td width=160>ID</td>
		<td width=110>権限</td>
	  </tr>
	
	  <tr align="center">
		<td> <s:textfield name="UserName" theme="simple" value="%{vo.UserName}" /> </td>
		<td> <s:textfield name="UserId" theme="simple" value="%{vo.UserId}"/> </td>
		<td><s:select name="AuthorityId" theme="simple"  headerKey="-1" headerValue=" "
			list="list2" listKey="AuthorityId" listValue="AuthorityName" value="%{vo.AuthorityId}"/></td>
	  </tr>
	</table><br>


	 <s:submit value="登録" align="left" />
	 <s:submit value="戻る" align="left" action="MainListAction"/>
	 <br><br>
	 <font color="red">${fieldErrors.UserName}</font><br>
	 <font color="red">${fieldErrors.UserId}</font><br>
	　<font color="red">${ actionErrors[0] }</font><br>
</s:form>
</s:else>
</body>
</html>

