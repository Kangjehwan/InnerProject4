<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>新規会員登録 &amp; </title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="form-2/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="form-2/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="form-2/assets/css/form-elements.css">
        <link rel="stylesheet" href="form-2/assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="form-2/assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="form-2/assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="form-2/assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="form-2/assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="form-2/assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>
        <!-- Top content -->
        <div class="top-content">
            <div class="inner-bg">
                <div class="container">

                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>新規会員登録</strong></h1>
                            <div class="description">
                            	 <p>

                            	</p>
                            </div>
                        </div>
                    </div>

                    <div class="row">

                        <div class="col-sm-6 col-sm-offset-3">

                        	<div class="form-box">
                        		<div class="form-top">
	                        		<div class="form-top-left">
	                        			<h3>今すぐ会員登録</h3>
	                            		<p>登録は、たったの<strong>3分</strong>で完了します。</p>
	                        		</div>
	                        		<div class="form-top-right">
	                        			<i class="fa fa-pencil"></i>
	                        		</div>
	                            </div>
	                            <div class="form-bottom">
				                    <s:form  action="UserConfirmAction" method="post" class="registration-form">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-last-name">ID</label>
				                        	<s:textfield name="ID" placeholder="ID" class="form-id form-control" id="form-id" />
				                        </div>
 				                        <div class="form-group">
				                        	<label class="sr-only" for="form-password">パスワード</label>
				                        	<s:password name="password" placeholder="パスワード" class="form-password form-control" id="form-password" />
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-password2">パスワード確認</label>
				                        	<s:password name="password2" placeholder="パスワード確認" class="form-password2 form-control" id="form-password2" />
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-name">名前</label>
				                        	<s:textfield name="name" placeholder="名前" class="form-name form-control" id="form-name" />
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-email">メールアドレス</label>
				                        	<s:textfield  name="email" placeholder="メールアドレス" class="form-email form-control" id="form-email" />
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-phone">電話番号</label>
				                        	<s:textfield name="phone" placeholder="電話番号" class="form-phone form-control" id="form-phone" />
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-address">住所</label>
				                        	<s:textfield name="address" placeholder="住所" class="form-address form-control" id="form-address" />
				                        </div>
				                        <button id="memberAdd" type="submit" class="btn">会員登録</button>
				                    </s:form>

				                    <s:form  action="Return" method="post" class="registration-form">
				                        <button id="return" type="submit" class="btn2" >戻る</button>
				                    </s:form>
			                    </div>
                        	</div>

                        </div>

                    </div>
                </div>
            </div>


        </div>

        <!-- Footer -->
        <footer>
        	<div class="container">
        		<div class="row">

        			<div class="col-sm-8 col-sm-offset-2">
        				<div class="footer-border"></div>
        				<p>Made by Interline at <a href="http://www.interline.co.jp" target="_blank"><strong>JIN</strong></a>
        					having a lot of fun. <i class="fa fa-smile-o"></i></p>
        			</div>

        		</div>
        	</div>
        </footer>

        <!-- Javascript -->
        <script src="form-2/assets/js/jquery-1.11.1.min.js"></script>
        <script src="form-2/assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="form-2/assets/js/jquery.backstretch.min.js"></script>
        <script src="form-2/assets/js/scripts.js"></script>
        <script src="js/password.js"></script>

        <!--[if lt IE 10]>
            <script src="form-2/assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>