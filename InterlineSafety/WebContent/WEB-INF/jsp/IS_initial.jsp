<%@ page session="true" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="jp">
	<head>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="初期画面">
	    <meta name="author" content="min">
		<title>Main</title>
      	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
 	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  	  	
  
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
   
	</head>
		<body>
		<!-- IS_mainmenu -->
		<jsp:include page="../jsp/include/IS_mainmenu.jsp" flush="false" />
			<br/><br/><br/>
			<h3>&nbsp;&nbsp;&nbsp;${UserName}さん</h3><br/><br/>
			<s:if test="disasterVo.size()==0">
			災害の情報はありません。<br/>
			</s:if>
			<s:else>
			<s:iterator value="disasterVo" >
			<h2>&nbsp;&nbsp;&nbsp;<s:property value = "%{@jp.interlinesafety.erp.util.ModifyFormat@YYYYMMDDtoJapanese(YYYYMMDD)}"/> 災害が発生しています。</h2><br/>
			<h2>&nbsp;&nbsp;&nbsp;安否情報を登録してください。</h2><br/><br/>
			</s:iterator>
			</s:else>
		</body>
</html>