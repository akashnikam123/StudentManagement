<%@page import="com.servlet.Teacher"%>
<%@page import="StudentManagement.teacher"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FROM</title>
</head>
<body>

<%
String id=request.getParameter("id");
int id1=Integer.parseInt(id);


EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
EntityManager em=emf.createEntityManager();

teacher t=em.find(teacher.class,id1);

%>

<form action="updatet" method="post" align="center">
<fieldset>
<legend align="center">FROM</legend>
<h4 class=" text-center">UPDATE STUDENT</h4>

<div class="form-group">
    <label for="exampleInputEmail1">Id:</label>
    <input type="text" name="id" value="<%=t.getId()%>">
  </div>
<br>

<div class="form-group">
    <label for="exampleInputEmail1">Name:</label>
    <input type="text" name="name" value="<%=t.getName()%>">
  </div>
<br>

<div class="form-group">
    <label for="exampleInputEmail1">Branch:</label>
    <input type="text" name="branch" value="<%=t.getSubject()%>">
  </div>

<br>

  <div class="form-group">
    <label for="exampleInputPassword1">Fees:</label>
    <input type="text" name="fees" value="<%=t.getSalary()%>">
  </div>

<br>
  
  <input type="submit" value ="submit">
  </fieldset>
</form>

</body>
</html>