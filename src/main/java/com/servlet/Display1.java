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
import StudentManagement.teacher;
@WebServlet("/display1")
public class Display1 extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	  String id=req.getParameter("id");
	  int id1=Integer.parseInt(id);
		
	   teacher   t=em.find(teacher.class,id1);
	  
	  et.begin();
	  em.persist(t);
	  et.commit();
	  
	  
	  System.out.println(t.getId());
	  System.out.println(t.getName());
	  System.out.println(t.getSalary());
	  System.out.println(t.getSubject());
	  
		    
	 PrintWriter pw=resp.getWriter();
	 pw.write("Display Teacher....");
	 RequestDispatcher rd=req.getRequestDispatcher("display1.html");
	 rd.include(req, resp);
	 resp.setContentType("text/html");

	
}
}
