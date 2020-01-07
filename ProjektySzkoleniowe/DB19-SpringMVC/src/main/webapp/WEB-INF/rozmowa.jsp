<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rozmowa JSP</title>
</head>
<body>
<h1>Rozmowa Spring + JSP</h1>

<form method='post'>
Jak masz na imię?
<input type='text' name='imie'>
<button>Wyślij</button>
</form>

<div style="border: solid 2px red; padding:5px">
${powitanie}
</div>

</body>
</html>

