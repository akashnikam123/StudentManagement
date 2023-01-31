package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StudentManagement.principal;
@WebServlet("/ca")
public class registration extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	String age=req.getParameter("age");
	String email=req.getParameter("email");
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	String phno=req.getParameter("phno");
	
	
	principal p=new principal(name, age, email, phno, password);
	p.setId(4);
	et.begin();
	em.persist(p);
	et.commit();
	
	PrintWriter pw=resp.getWriter();
	 pw.write("Account Created...");
	 RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
	 rd.include(req, resp);
	 resp.setContentType("text/html");
	
}
}
