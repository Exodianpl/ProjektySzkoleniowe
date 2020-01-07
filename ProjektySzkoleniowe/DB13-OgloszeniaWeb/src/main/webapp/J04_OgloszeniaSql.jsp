<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%-- Ten skrypt jest samowystarczalny, w ogóle nie korzysta z klas Ogloszenie, DostepDoBazy itd.
 	Działałby nawet w zupełnie pustym projekcie (pod warunkiem dostępności sterownika JDBC). --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wszystkie ogłoszenia 4</title>
<link rel="stylesheet" type="text/css" href="styl.css">
</head>
<body>
<h1>JSP - wersja z tagami do SQL-a</h1>

<%-- "taglibs" - biblioteki tagów, zaimplementowane w Javie, a w JSP używa się ich za pomocą składni "tagowej" (dokładnie składni XML) --%>
<sql:setDataSource var="baza" driver="org.postgresql.Driver"
	url="jdbc:postgresql://localhost/ogloszenia"
	user="ogloszenia" password="abc123"/>

<%-- składnia ${} , a czasami #{}  to jest "expression language"
	jest to stosowane także w innych technologiach webowych Javy, np. JSF, PrimeFace itp., ThymeLeaf
--%>

<sql:query dataSource="${baza}" scope="page" var="result">
SELECT * FROM ogloszenia JOIN samochodowe USING(id_ogloszenia)
<%-- <sql:param value="4000"/> --%>
</sql:query>

<c:forEach var="row" items="${result.rows}">
	<div class="ogloszenie">
		<h2>${row.tytul}</h2>
		<p class="marka">${row.marka} ${row.model} ${row.generacja}</p>
		<p class="cena">${row.cena} PLN</p>
		<p>Lokalizacja ${row.lokalizacja}</p>
		<p>Wystawione ${row.wystawione}</p>
		<p>${row.opis}</p>
	</div>
</c:forEach>

</body>
</html>
