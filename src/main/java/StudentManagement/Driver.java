package StudentManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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


@WebServlet("/ll")
public class Driver extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Akash");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	Query q=em.createQuery("select c from principal c where c.email='"+email+"' and c.password='"+password+"' ");
	List<principal>check=q.getResultList();
	
     if(check.size()>0)
     {
    	 RequestDispatcher rd=req.getRequestDispatcher("index.html");
    	 rd.forward(req, resp);
     }
     else
     {
    	 PrintWriter pw=resp.getWriter();
    	 pw.write("invalid credintials");
    	 RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
    	 rd.include(req, resp);
    	 resp.setContentType("text/html");
     }
}
}
