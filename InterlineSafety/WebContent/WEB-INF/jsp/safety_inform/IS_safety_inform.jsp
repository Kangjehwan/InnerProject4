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
		<style>
		table { 
		    display: table;
		    border-collapse: collapse;
		    border-spacing: 2px;
		    border-color: black;
		    empty-cells: show;
		}
		</style>	
	</head>
		<body>
		<!-- IS_mainmenu include -->
		<jsp:include page="../include/IS_mainmenu.jsp" flush="false" />
			<s:if test="%{#session.DisasterId==null}">
			<br/><br/><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;災害の情報はありません。</h1>
			</s:if>
			<s:else>		
		  <div class="container"><br />
					<h2>災害の状況</h2><br />
						<center>
			<table border="1" align="left" >
				<s:iterator value="list">				
				<tr align="center">
					<td bgcolor="#B8B8B8" width="140" height="30" style="font-weight: bolder;">発生日時</td>
					<td>&nbsp;&nbsp;<s:property value="%{@jp.interlinesafety.erp.util.ModifyFormat@YYYYMMDDtoJapanese(YYYYMMDD)}" /></td>
				</tr>
				<tr align="center">
					<td bgcolor="#B8B8B8" height="30" style="font-weight: bolder;">発生場所</td>
					<td width="50">&nbsp;&nbsp;<s:property value="DisasterPlace" /></td>
				</tr>
				<tr align="center">
					<td bgcolor="#B8B8B8" height="30" style="font-weight: bolder;">発生の内容</td>
					<td width="250">&nbsp;&nbsp;<s:property value="Disaster" /></td>
				</tr>
				</s:iterator>				
			</table>		
						</center>
					</div><br/><br/><br/><br/>
					
				<div class="container">
					<h2>安否状況</h2><br />
					<table border="1">
						<tr align="center" bgcolor="#B8B8B8" style="font-weight: bolder;">
							<td width="90" height="40">名前</td>
							<td width="80" height="40">居場所</td>
							<td width="80" height="40">体調</td>
							<td width="220" height="40">コメント</td>
							<td width="180" height="40">更新日</td>
							<td width="80" height="40">登録</td>
						</tr>
						
						<s:iterator value="list2" status="vo">
							<s:form action="StateCheckWriteFormAction" method="post">
						<tr align="center">
											<s:hidden name="DisasterId" value="%{#session.DisasterId}" />
											<s:hidden name="UserId" value="%{UserId}" />
											<s:hidden name="UserName" value="%{UserName}" />
											<s:hidden name="WhereaboutsName" value="%{WhereaboutsName}" />
											<s:hidden name="PhysicalCondition" value="%{PhysicalCondition}" />
											<s:hidden name="SafetyInformComment" value="%{SafetyInformComment}" />
											<s:hidden name="WhereaboutsId" value="%{WhereaboutsId}" />
											<s:hidden name="PhysicalCondtionId" value="%{PhysicalCondtionId}" />
											<s:hidden name="Udate" value="%{Udate}" />
											<td height="40"><s:property value="UserName"/></td>
											<td><s:property value="WhereaboutsName"/></td>
											<td><s:property value="PhysicalCondition"/></td>
											<td><s:property value="SafetyInformComment"/></td>
											<td><s:property value="Udate"/></td>
											<td>
												<s:if test="%{#session.UserId == #request.UserId}">
														<s:submit value="登録" />
												</s:if>
											</td>
						</tr>
							</s:form>	
						</s:iterator>
					</table>	
				</div><br/><br/><br/><br/><br/>			
			</s:else>			
													
				<!-- SideBar shadow  -->					
			    <center><jsp:include page="../include/bigPageControl.jsp" flush="false" /></center>
		</body>
</html>