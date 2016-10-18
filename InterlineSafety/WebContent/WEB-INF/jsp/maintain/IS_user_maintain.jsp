<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="YYYYMMDD" class="java.util.Date" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	    <meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="初期画面">
	    <meta name="author" content="李直柱">
			<title>Main</title>
      	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
 	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  	  	
 
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
   
<title>User List</title>
</head>
<body>
		<!-- IS_mainmenu -->
		<jsp:include page="/WEB-INF/jsp/include/IS_mainmenu.jsp" flush="false" />
<font size="5">ユーザー管理</font><p>


<s:form>

		<s:submit value="新規登録" action="User"/>
		</s:form>	
<p>

<table border="1" width=460>
	<tr align="center" bgcolor="#778899">
		<td width=70>名前</td>
		<td width=70>ID</td>
		<td width=110>Password初期化</td>
		<td width=70>権限</td>
		<td width=70>修正</td>
		<td width=70>削除</td>
	</tr>
	
	<s:iterator value="list" status="stat">
	<s:form>
	<tr align="center">
		<s:hidden name="UserId" value="%{UserId}" />
		<td> <s:property value="UserName" /></td>
		<td> <s:property value="UserId" /></td>
		<td> <s:submit value="初期化" align="center" onclick='return confirm("パスワードを初期化します。");' action="MainModifyAction2" /> </td>
		<td> <s:property value="AuthorityName" /> </td>
		<td> <s:submit value="修正" action="MainViewAction"/></td>
		<td> <s:submit value="削除" align="center" onclick='return confirm("削除してよろしいでしょうか？");' action="MainDeleteAction" /> </td>
	</tr>
</s:form>			
	</s:iterator>

</table>
		
</body>
</html>