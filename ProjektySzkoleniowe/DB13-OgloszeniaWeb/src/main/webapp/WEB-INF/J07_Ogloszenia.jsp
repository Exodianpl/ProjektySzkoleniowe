<%@page import="ogloszenia.exn.BladBazyDanych"%>
<%@page import="ogloszenia.model.Samochodowe"%>
<%@page import="java.util.List"%>
<%@page import="ogloszenia.baza.OgloszeniaDAO"%>
<%@page import="ogloszenia.baza.DostepDoBazy"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='styl.css'>
<title>Ogłoszenia - wersja JSP 07</title>
</head>
<body>
<h1>Ogłoszenia</h1>
<p>Wersja zrobiona w oparciu o forward</p>

<form method="post" id="wyszukiwarka">
<h3>Wybierz według ceny</h3>
<table>
<tr><td>Cena minimalna:</td><td><input type="number" name="min" value="${param.min}"></td></tr>
<tr><td>Cena maksymalna:</td><td><input type="number" name="max" value="${param.max}"></td></tr>
<tr><td><button>Wybierz</button></td></tr>
</table>
</form>

<c:forEach var="ogl" items="${ogloszenia}">
	<div class="ogloszenie">
		<img class="foto" src="foto?id=${ogl.idOgloszenia}">
		<h2>${ogl.tytul}</h2>
		<p class="marka">${ogl.marka} ${ogl.model} ${ogl.generacja}</p>
		<p class="cena">${ogl.cena} PLN</p>
		<p class="dane">Rok produkcji: ${ogl.rocznik} km</p>
		<p class="dane">Przebieg: ${ogl.przebieg} km</p>
		<p>Lokalizacja: ${ogl.lokalizacja}</p>
		<p>Wystawione: ${ogl.wystawione}</p>
		<p class="opis">${ogl.opis}</p>
		<div class="sprzedawca">
		<h3>Sprzedawca</h3>
		<p>${ogl.sprzedawca.nazwa}</p>
		<p>tel. ${ogl.sprzedawca.telefon}</p>
		</div>
	</div>
</c:forEach>

</body>
</html>
