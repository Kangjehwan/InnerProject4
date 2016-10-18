<%@ page session="true" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<head>
		<meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="メインメニュー">
	    <meta name="author" content="李珍瑞">
	<style>
		#wrapper {
		    padding-left: 0;
		    -webkit-transition: all 0.5s ease;
		    -moz-transition: all 0.5s ease;
		    -o-transition: all 0.5s ease;
		    transition: all 0.5s ease;
		}

		#wrapper.toggled {
		    padding-left: 250px;
		}

		#sidebar-wrapper {
		    z-index: 1000;
		    position: fixed;
		    left: 250px;
		    width: 0;
		    height: 100%;
		    margin-left: -250px;
		    overflow-y: auto;
			background-color: white;
			border: 1px solid #ccc;
		    -webkit-transition: all 0.5s ease;
		    -moz-transition: all 0.5s ease;
		    -o-transition: all 0.5s ease;
		    transition: all 0.5s ease;
		}

		#wrapper.toggled #sidebar-wrapper {
		    width: 250px;
		}

		#page-content-wrapper {
		    width: 100%;
		    position: absolute;
		    padding: 15px;
		}

		#wrapper.toggled #page-content-wrapper {
		    position: absolute;
		    margin-right: -250px;
		}

		/* Sidebar Styles */

		.sidebar-nav {
		    position: absolute;
		    top: 0;
		    width: 250px;
		    margin: 0;
		    padding: 0;
		    list-style: none;
		}

		.sidebar-nav li {
		    text-indent: 20px;
		    line-height: 100%;
		}

		.sidebar-nav li a {
		    display: block;
		    text-decoration: none;
		}
		
		.company_title p{
			font-size:		22px;
			color:			#003399;
			line-height:    100%;
			font-weight:    bold;
		}
		
		.btn {
			color:			#000000;
			line-height:    200%;
		}

		@media(min-width:768px) {
		    #wrapper {
		        padding-left: 250px;
		    }

		    #wrapper.toggled {
		        padding-left: 0;
		    }

		    #sidebar-wrapper {
		        width: 250px;
		    }

		    #wrapper.toggled #sidebar-wrapper {
		        width: 0;
		    }

		    #page-content-wrapper {
		        padding: 20px;
		        position: relative;
		    }

		    #wrapper.toggled #page-content-wrapper {
		        position: relative;
		        margin-right: 0;
		    }
		}
	</style>
	</head>
    <div id="wrapper">
        <!-- Sidebar -->
        <div id="sidebar-wrapper">
        　　　　　　<div class="text-center">
            <ul class="sidebar-nav">
                <li><br /><img src="<s:url value="/image/logo.png"/>" /><br /></li>
                <li class="company_title"><p><a href="Initial.action">INTERLINE<br/>SAFETY</a></p><br /></li>
                <li><div class="btn-group">
                		<s:form  action="Logout">${session.UserName}さん
                		<s:submit class="btn btn-primary btn-xs" value="ログアウト" align="center"/>
                		</s:form><br />
	                </div>
                </li>
                <li>     
	                <s:form>        
		               	<div class="btn-group-vertical">
		                	<s:submit class="btn btn-primary" value="安否登録・確認" action="StateCheckListAction" /><br/>
		                	<s:submit class="btn btn-primary" value="個人情報管理" action="UserInfoMove"/><br/>	                
		               		<s:if test="%{#session.AuthorityId == 1}">
		               		<s:submit class="btn btn-primary" value="災害情報管理" action="ListAction" /><br/>
		                	<s:submit class="btn btn-primary" value="ユーザー管理" action="MainListAction"/><br/>
		                	</s:if>	
		                </div>
	                </s:form>
                </li>
			</ul>  
       	</div>
      </div>
      <!-- /#sidebar-wrapper -->
