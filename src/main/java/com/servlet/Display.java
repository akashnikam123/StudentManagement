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
@WebServlet("/display")
public class Display extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		  String id=req.getParameter("id");
		  int id1=Integer.parseInt(id);
			
		  studentt s=em.find(studentt.class,id1);
		  
		  et.begin();
		  em.persist(s);
		  et.commit();
		  
		  
		  System.out.println(s.getId());
		  System.out.println(s.getName());
		  System.out.println(s.getBranch());
		  System.out.println(s.getFees());
		  
			    
		 PrintWriter pw=resp.getWriter();
		 pw.write("Display Student....");
		 RequestDispatcher rd=req.getRequestDispatcher("display.html");
		 rd.include(req, resp);
		 resp.setContentType("text/html");
	
	
}
}
