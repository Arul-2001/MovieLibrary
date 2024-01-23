package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import dto.Admin;
@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  
	{
	  String adminmail=req.getParameter("adminemail");
	  String adminpassword=req.getParameter("adminpassword");
	  
	  Dao dao=new Dao();
	  Admin admin=dao.findByEmail(adminmail);
	  
	  
	  if(admin	!= null)
	  {
		  if(admin.getAdminmail().equals(adminmail))
		  {
		  if(admin.getAdminpassword().equals(adminpassword))
		  {
			  HttpSession session=req.getSession();
			  session.setAttribute("adminname",admin.getAdminname());
			 try 
			 {
				req.setAttribute("movies",dao.getAllMovies());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			 rd.include(req, resp);
		  }
		  else
		  {
			  req.setAttribute("message", "password is worng");
			  RequestDispatcher rd = req.getRequestDispatcher("alogin.jsp");
			  rd.include(req, resp);
		  }
		  }
		  
		  
	 }
	}
}
	  
		 
	  
	  
	  
	  

