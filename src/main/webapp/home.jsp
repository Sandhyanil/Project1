<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
     <h1>Please enter two numbers and click on suitable Operation</h1>
     <form action="add">
     <input type="text" name="t1"><br>
     <input type="text" name="t2"><br>
     <p>Please Click on the Operation</p>
     
<input type="radio" name="op" value="div">Divide
<input type="radio" name="op" value="rem">Remainder
<input type="radio" name="op" value="add"> Add
<input type="radio" name="op" value="sub"> Sub


<br>
<br>

     <input type="submit">
     
     
     </form>
     
     
     
     

</body>
</html>