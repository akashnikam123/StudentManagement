package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StudentManagement.studentt;
@WebServlet("/update")
public class Update extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String branch=req.getParameter("branch");
		String fees=req.getParameter("fees");
		
		int id1=Integer.parseInt(id);	
		
		studentt s=new studentt(id1,name,branch,fees);
		
		s.setId(id1);
		s.setName(name);
		s.setBranch(branch);
		s.setFees(fees);
				
		et.begin();
		em.merge(s);
		et.commit();
				
		 PrintWriter pw=resp.getWriter();
		 pw.write("Student Update..");
		 RequestDispatcher rd=req.getRequestDispatcher("update.html");
		 rd.include(req, resp);
		 resp.setContentType("text/html");
				
}
}
