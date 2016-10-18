<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page session="true" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="jp">
	<head>
	    <meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="安否登録・確認">
	    <meta name="author" content="李珍瑞">
			<title>Safety Check</title>
      	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
 	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	</head>
		<body>
		<!-- IS_mainmenu include -->
		<jsp:include page="../include/IS_mainmenu.jsp" flush="false" />
		 <div class="container"><br /><br />
		<s:if test="%{#request.Udate==WhereaboutsName}"><br />
			<h2>安否情報登録</h2><br />
			<s:form action="StateCheckWriteAction.action" method="post">
			<s:hidden name="DisasterId" value="%{DisasterId}" />
			<s:hidden name="UserId" value="%{UserId}" />

			<table border="1" width="50%" height="80">
				<tr align="center" bgcolor="#B8B8B8" style="font-weight: bolder;">
					<td>名前</td>
					<td>居場所</td>
					<td>体調</td>
					<td>コメント</td>
				</tr>
			
			<tr align="center">
				<td> <s:textfield name="UserName" theme="simple" value="%{vo.UserName}" readonly="true" /> </td>
				<td> <s:select name="WhereaboutsId" 
							   theme="simple" 
		         			   list="whereaboutsNameList" 
		         			   listKey="WhereaboutsId" 
		         			   listValue="WhereaboutsName" 
		         			   value="%{vo.WhereaboutsName}"/>
				<td> <s:select name="PhysicalCondtionId" 
				               theme="simple" 
		        			   list="physicalCondtionList" 
		        			   listKey="PhysicalCondtionId" 
		        			   listValue="PhysicalCondition" 
		        			   value="%{vo.PhysicalCondition}"/>
				<td> <s:textfield name="SafetyInformComment" 
								 theme="simple" 
								 value="%{vo.SafetyInformComment}" 
								 maxLength="4000" /> </td>
			 </tr>
		
			</table><br />
				<s:submit value="登録" align="left"/>
				<s:submit value="戻り" action="StateCheckListAction"/><br/>	 
			</s:form>
		</s:if>

		<s:else>
			<h2>安否情報登録 修正</h2><br />
			<s:form action="StateCheckUpdateAction.action" method="post">
				<s:hidden name="DisasterId" value="%{DisasterId}" />
				<s:hidden name="UserId" value="%{UserId}" />
			<table border="1" width="50%" height="80">
				<tr align="center" bgcolor="#B8B8B8" style="font-weight: bolder;">
					<td>名前</td>
					<td>居場所</td>
					<td>体調</td>
					<td>コメント</td>
				</tr>
				
				<tr align="center">
					<td> <s:textfield name="UserName" theme="simple" value="%{vo.UserName}" readonly="true" /> </td>
					<td> <s:select name="WhereaboutsId" 
								   theme="simple" 
			         			   list="whereaboutsNameList" 
			         			   listKey="WhereaboutsId" 
			         			   listValue="WhereaboutsName" 
			         			   value="%{vo.WhereaboutsName}"/>
					<td> <s:select name="PhysicalCondtionId" 
					               theme="simple" 
			        			   list="physicalCondtionList" 
			        			   listKey="PhysicalCondtionId" 
			        			   listValue="PhysicalCondition" 
			        			   value="%{vo.PhysicalCondition}"/>
					<td> <s:textfield name="SafetyInformComment" 
									 theme="simple" 
									 value="%{vo.SafetyInformComment}" 
									 maxLength="4000" /> </td>
				 </tr>
			
					</table><br />
						<s:submit value="登録" align="left"/>
						<s:submit value="戻る" action="StateCheckListAction"/><br/>	 
			</s:form>
		</s:else>						
				<!-- SideBar shadow  -->					
			    <center><jsp:include page="../include/bigPageControl.jsp" flush="false" /></center>
		</body>
</html>