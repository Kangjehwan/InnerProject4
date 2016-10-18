<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="jp">
<head>
  <title>Login Error</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 
 <script type="text/javascript">
    function ErrorMessage() {
      alert("登録されなかったアイディーであったり、アイディーまたはパスワードを誤って入力しました。");
      location.href='/InterlineSafety/IS_login.jsp'
    }
  </script>  
</head>
<body>

 	 <script>ErrorMessage()</script>

</body>
</html>