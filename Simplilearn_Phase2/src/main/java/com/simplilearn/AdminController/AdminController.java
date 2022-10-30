package com.simplilearn.AdminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplelearn.bean.UserBean;
import com.simplilear.admindao.AdminDao;

/**
 * Servlet implementation class AdminController
 * 
 * Devloped by Heena
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminDao adm = new AdminDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		UserBean ubean = new UserBean();
		int user_id = Integer.parseInt(request.getParameter("UserId"));
		String Pass = request.getParameter("pass");
		ubean = adm.validateUser(user_id);
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		if (user_id == ubean.getUser_id() && Pass.equals(ubean.getPass())) {
			HttpSession session=request.getSession();
			session.setAttribute("Name",ubean.getUname());
			rd.forward(request, response);

		} else {
			
			request.setAttribute("Error","Invalid User name and password" );
			request.getRequestDispatcher("AdminLogin.jsp").forward(request,response);

		}

	}
}


