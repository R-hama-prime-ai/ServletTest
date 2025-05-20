<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録フォーム</title>
</head>
<body>

<form action="FormTest" method="post">
	氏名：<input type="text" name="name" size=10 required><br>
	会社名：<input type="text" name="company"><br>
	メールアドレス：<input type="email" name="e-mail" required><br>
	お問い合わせ：<textarea name="msg" rows="5" cols="50" required></textarea><br>
	メルマガ種類:<input type="checkbox" name="melmaga" value="総合案内">総合案内
	             <input type="checkbox" name="melmaga" value="セミナー案内">セミナー案内
	             <input type="checkbox" name="melmaga" value="求人採用情報">求人採用情報<br>
	資料請求：<br><input type="radio" name="requestInformation" value="yes">Yes<br>
			  <input type="radio" name="requestInformation" value="no">No<br>
	<input type="submit" value="送信">
	







</form>


</body>
</html>