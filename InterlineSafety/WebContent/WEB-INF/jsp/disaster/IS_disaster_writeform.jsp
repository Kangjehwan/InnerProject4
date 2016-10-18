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

<title>Disaster Write</title>
</head>
<body>
<!-- IS_mainmenu -->
<jsp:include page="/WEB-INF/jsp/include/IS_mainmenu.jsp" flush="false" />

<s:if test="vo == null">
	<font size="5">災害情報作成</font><p>
	<s:form action="WriteAction.action" method="post" validate="true">
	
	
<table border="1" width="50%">
	<tr align="center" bgcolor="#778899">
		<td>発生日時</td>
		<td>発生場所</td>
		<td>発生内容</td>
		<td>状況</td>
	</tr>
	
	<tr align="center">
		<td> <s:textfield name="YYYYMMDD" theme="simple" value="%{vo.YYYYMMDD}" /> </td>
		<td> <s:textfield name="DisasterPlace" theme="simple" value="%{vo.DisasterPlace}" /> </td>
		<td> <s:textfield name="Disaster" theme="simple" value="%{vo.Disaster}" /> </td>
		<td> <s:select name="DisasterStateId" theme="simple" headerKey="-1" headerValue=" <状況選択> "
			list="statelist" listKey="DisasterStateId" listValue="DisasterStateName" value="%{vo.DisasterStateId}"/>
		</td>
	</tr>
	
</table><br>

<font color="red"><s:fielderror /></font>

<s:submit value="登録" align="left"/><p>
<s:submit value="戻る" align="left" action="ListAction"/><p>

</s:form>
</s:if>

<s:else>
	<font size="5">災害情報修正</font><p>
	<s:form action="ModifyAction.action" method="post" validate="true">
	<s:hidden name="DisasterId" value="%{DisasterId}" />
	
	<table border="1" width="50%">
	<tr align="center" bgcolor="#778899">
		<td>発生日時</td>
		<td>発生場所</td>
		<td>発生内容</td>
		<td>状況</td>
	</tr>
	
	<tr align="center">
		<td> <s:textfield name="YYYYMMDD" theme="simple" value="%{vo.YYYYMMDD}" /> </td>
		<td> <s:textfield name="DisasterPlace" theme="simple" value="%{vo.DisasterPlace}" /> </td>
		<td> <s:textfield name="Disaster" theme="simple" value="%{vo.Disaster}" /> </td>
		<td> <s:select name="DisasterStateId" theme="simple" headerKey="-1" headerValue=" <状況選択> "
			list="statelist" listKey="DisasterStateId" listValue="DisasterStateName" value="%{vo.DisasterStateId}"/>
		</td>
	</tr>
	
</table><br>

<font color="red"><s:fielderror /></font>

<s:submit value="登録" align="left"/><p>
<s:submit value="戻る" align="left" action="ListAction"/><p>

</s:form>
</s:else>

</body>
</html>