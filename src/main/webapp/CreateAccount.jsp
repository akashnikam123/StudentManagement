<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register From</title>
</head>
<body>

<form action="ca" method="post" align="center">

<fieldset>
<legend align="center">FROM</legend>
<h4 class=" text-center">Registration Page</h4>

<div class="form-group">
    <label for="exampleInputEmail1">Name:</label>
    <input type="text" name="name">
  </div>
<br>

<div class="form-group">
    <label for="exampleInputEmail1">Age:</label>
    <input type="text" name="age">
  </div>

<br>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address:</label>
    <input type="email" name="email">
   
  </div>
 <br> 
  <div class="form-group">
    <label for="exampleInputEmail1">Phone No:</label>
    <input type="number" name="phno">
  </div>
 <br> 
  <div class="form-group">
    <label for="exampleInputPassword1">Password:</label>
    <input type="password" name="password">
  </div>
  <br>
  <input type="submit" value ="submit">
  </fieldset>
</form>
</body>
</html>