<%@ page session="true" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="jp">
	<head>
	    <meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="安否登録・確認">
	    <meta name="author" content="李珍瑞">
			<title>ERROR</title>
		      	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		 	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		  	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	</head>
		<body>
		<!-- IS_mainmenu include -->
		<jsp:include page="../include/IS_mainmenu.jsp" flush="false" />
			<br/>
			<br/><br/><br/><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;発生中の災害が<span style="color:red">二個</span>以上です。</h1>
			<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;管理者に聞いてください。</h1><br/><br/>
			
		          <s:if test="%{#session.AuthorityId == 1}">
		          	<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;「管理者メニュー」</h1><br/><br/>
	                <s:form> 
		                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div class="btn-group-vertical">
		               		<s:submit class="btn btn-danger" value="災害情報管理" action="ListAction" /><br/>
		                </div> 
	                </s:form>
		          </s:if>	
				<!-- SideBar shadow  -->					
			    <center><jsp:include page="../include/bigPageControl.jsp" flush="false" /></center>
		</body>
</html>