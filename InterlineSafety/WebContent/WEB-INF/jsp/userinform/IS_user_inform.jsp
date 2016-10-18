<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="初期画面">
<meta name="author" content="李珍瑞">
<title>Main</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<body>

	<!-- IS_mainmenu -->
	<jsp:include page="/WEB-INF/jsp/include/IS_mainmenu.jsp" flush="false" />

	<br>
	<br>
	<br>
	<br>
	<font size="5">個人情報管理</font>
	<p>


		<s:form action="UserInfoModify" method="post">
			<s:hidden name="UserId" value="%{UserInformVo.UserId}" />
			<s:hidden name="HPassword" value="%{UserInformVo.Password}" /><!-- DBから登録済みのパスワード -->

			<br>
			<br>
			<table border="1" radius="3">
				<tr>
					<td bgcolor="#778899" width="120">名前</td>
					<td width="170">&nbsp;&nbsp;<s:property
							value="UserInformVo.UserName" /></td>
				</tr>

				<tr>
					<td bgcolor="#778899" width="120">ID</td>
					<td width="170">&nbsp;&nbsp;<s:property
							value="UserInformVo.UserId" /></td>
				</tr>

				<tr>
					<td bgcolor="#778899" align="left" width="120">パスワード</td>
					<td width="170"><s:password showPassword="true" name="Password"
							theme="simple" maxlength="45" value="%{UserInformVo.Password}" /></td>
				</tr>

				<tr>
					<td bgcolor="#778899" align="left" width="120">パスワード確認</td>
					<td width="170"><s:password name="PasswordCk" theme="simple"
							maxlength="45" value="%{UserInformVo.PasswordCk}" /></td>
				</tr>

				<tr>
					<td bgcolor="#778899" align="left" width="120">住所</td>
					<td width="170"><s:textfield name="Address" theme="simple"
							maxlength="500" value="%{UserInformVo.Address}" /></td>
				</tr>

				<tr>
					<td bgcolor="#778899" align="left" width="120">電話番号</td>
					<td width="170"><s:textfield name="Tell" theme="simple"
							maxlength="45" value="%{UserInformVo.Tell}" /></td>
				</tr>

				<tr>
					<td bgcolor="#778899" align="left" width="120">Eメール</td>
					<td width="170"><s:textfield name="Email" theme="simple"
							maxlength="45" value="%{UserInformVo.Email}" /></td>
				</tr>
			</table>

			<table>
				<tr>
					<td align="center"><s:submit value="登録" class="btn btn-primary btn-xs" /></td>
					<td><font color="red"><s:fielderror/>
					<s:if test="%{UserInformVo.Password==1111}">
					パスワードが初期値のままです。変更してください。
					</s:if>
					</font></td>
				</tr>
			</table>
		</s:form>
</html>