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

import StudentManagement.studentt;
@WebServlet("/student")
public class Student extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	String id=req.getParameter("id");
	String branch=req.getParameter("branch");
	String fees=req.getParameter("fees");
	String name=req.getParameter("name");
	int id1=Integer.parseInt(id);	
	
	studentt s=new studentt(id1,name,branch,fees);
	
	et.begin();
	em.persist(s);
	et.commit();
	
	
	 PrintWriter pw=resp.getWriter();
	 pw.write("Student Add..");
	 RequestDispatcher rd=req.getRequestDispatcher("Student1.html");
	 rd.include(req, resp);
	 resp.setContentType("text/html");
	
	
}
}
