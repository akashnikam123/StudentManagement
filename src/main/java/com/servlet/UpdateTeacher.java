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
@WebServlet("/updatet")
public class UpdateTeacher extends HttpServlet
 {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	String id=req.getParameter("id");
	int id1=Integer.parseInt(id);	
	String name=req.getParameter("name");
	String subject=req.getParameter("subject");
	String salary=req.getParameter("salary");
	
	teacher t=new teacher(id1,name,subject,salary);
	
	t.setId(id1);
	t.setName(name);
	t.setSubject(subject);
	t.setSalary(salary);
		
	et.begin();
	em.merge(t);
	et.commit();
	
	 PrintWriter pw=resp.getWriter();
	 pw.write("Teacher Update..");
	 RequestDispatcher rd=req.getRequestDispatcher("updateT.html");
	 rd.include(req, resp);
	 resp.setContentType("text/html");
			
}
}
