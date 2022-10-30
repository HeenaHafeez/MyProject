package com.simplilearn.AdminController;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplelearn.bean.TeacherBean;
import com.simplelearn.bean.UserBean;
import com.simplilear.admindao.AdminDao;

/**
 * Servlet implementation class ClassServlet
 */
@WebServlet("/ShowStudent")
public class ShowStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDao adm = new AdminDao();
	
		List<Object> list=adm.getStudentData();
		if(!list.isEmpty()) {
			request.setAttribute("data", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ShowStudentData.jsp");
			dispatcher.include(request, response);			
		}
		
	
		
	}

	

}
