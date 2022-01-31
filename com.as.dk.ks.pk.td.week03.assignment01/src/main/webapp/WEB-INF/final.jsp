<%-- Date - 25 January 2022
Author - Dashmeet Kaur
Description - Final jsp shows max, min marks and grade scored --%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="final.css" />
<title>Final jsp file</title>
</head>
<body>
<center><img src="lambtonLogo.PNG" /><br><br></center>
<div class="result">
<p>Result</p>
<%
out.println("Hello!  " + session.getAttribute("name") + "<br><br>");

out.println("The minimum marks are :	" + session.getAttribute("minMarks") + "<br>");
out.println("The maximum marks are :	" + session.getAttribute("maxMarks") + "<br>");
out.println("The average marks are :	" + session.getAttribute("avgMarks") + "<br><br>");
out.println("The overall grade is :	" + session.getAttribute("grade") + "<br>");
out.println("Grade Point :	" + session.getAttribute("msg") + "<br>");


%>
</div>

<div>
	<p>Submitted by:</p>
<ul>
  <li>Ayush Kumar Singh (C0799530)</li>
  <li> Dashmeet Kaur (C0800265) </li>
  <li>Kulwinder Singh (C0792797)</li>
  <li>Parampreet Kaur Gill (C0796418)</li>
  <li>Tarun Dutt (C0784296)</li>
</ul>


	
	
</div>
</body>
</html>