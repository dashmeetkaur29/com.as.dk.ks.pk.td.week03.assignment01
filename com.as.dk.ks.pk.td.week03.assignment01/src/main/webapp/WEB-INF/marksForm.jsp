<%-- Date - 25 January 2022
Author - Dashmeet Kaur
Description - MarksForm jsp to accept user Name and marks in 5 subject --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="marksForm.css" />
<title>Marks Form</title>
</head>
<body>

	<form action = "SecondServlet" method="post" class="marks">
	Enter Your Name : <input type="text" size="20" name="studName"/> &nbsp; &nbsp; <br><br><br>
	<div id="sheet">
	Enter your marks in Subject 1 :	<input type="sub1Marks" size="3" name="sub1Marks"/> <br> <br>
	Enter your marks in Subject 2 :	<input type="sub2Marks" size="3" name="sub2Marks"/> <br> <br>
	Enter your marks in Subject 3 :	<input type="sub3Marks" size="3" name="sub3Marks"/> <br> <br>
	Enter your marks in Subject 4 :	<input type="sub4Marks" size="3" name="sub4Marks"/> <br> <br>
	Enter your marks in Subject 5 :	<input type="sub5Marks" size="3" name="sub5Marks"/> <br> <br>
	</div>
	<input type="submit" value="Get Marks Details" id="submit"/>
	

</form>
</body>
</html>