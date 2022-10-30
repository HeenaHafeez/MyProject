package com.simplilearn.AdminController;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplelearn.bean.UserBean;
import com.simplilear.admindao.AdminDao;

/**
 * Servlet implementation class ClassServlet
 */
@WebServlet("/ClassServlet")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDao adm = new AdminDao();
		Integer class_id = Integer.parseInt(request.getParameter("class_id"));
		String class_std = request.getParameter("class_std");
		List<Object> l=new ArrayList<>();
		l.add(class_id);
		l.add(class_std);		
		int flag=adm.insertClass(l);
		if (flag==1) {
			request.setAttribute("Error","Record Inserted Successfully" );
			request.getRequestDispatcher("Class.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("Error","Some Problem occurred While insertion" );
			request.getRequestDispatcher("Class.jsp").forward(request,response);
		}
		
	}

	

}
