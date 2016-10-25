<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
 	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>Login</title>
<style>
.company_title p{
	padding:		0 0 0 5px;
	margin:			5px 0 5px 0;
	font-size:		24px;
	color:			#003399;
	font-weight:    bold;
}

.myfont {
    width:60px;
    vertical-align: middle;
    font-size:		20px;
    float: left;
}

</style>
</head>
<body>
	<div class="container">
		<div class="col-md-8" style="border: 3px solid #0066ff">
			<br/>



			<s:form method="post"  action="LoginAction"  class="form-inline">
				<img src="<s:url value="/image/logo.png"/>" width="15%" height="15%" /><br/>
				<div class="company_title"><p>INTERLINE SAFETY<br/>ログイン</p></div><br/>
				<p class="myfont">ID : </p>
				<s:textfield  class="form-control" name="uId"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red">${fieldErrors.uId}</font><br/><br/>
				<p class="myfont">PW : </p>
				<s:password  class="form-control" name="uPw"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red">${fieldErrors.uPw}</font><br/><br/>
		  		<s:submit class="btn btn-primary" value="ログイン" />&nbsp;&nbsp;&nbsp;<font color="red">${ actionErrors[0] }</font>
			<!-- 2016.10.25 修正 姜 Start -->
			<s:submit class="btn" value="会員登録" action="UserAddAction"/>&nbsp;&nbsp;&nbsp;<font color="red">${ actionErrors[0] }</font>
			<!-- 2016.10.25 修正 姜 End -->
			</s:form><br>





	 	</div>
	</div>
</body>
</html>