<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>TEST</title>
  </head>
<body>

<p>お名前を入力して下さい。</p>
<form method="post" action="total-out.jsp">
<input type = "text" name = "price">
円 *
<input type = "text" name = "count">
個 + 送料
<input type = "text" name = "delivery">
円 =

<input type = "submit" value = "確定">

</form>



</body>
</html>