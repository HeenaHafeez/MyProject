package com.simplilearn.AdminController;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
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
@WebServlet("/Teacher")
public class Teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDao adm = new AdminDao();
		TeacherBean tbean=new TeacherBean();
		Integer teach_id = Integer.parseInt(request.getParameter("teach_id"));
		String teach_name = request.getParameter("teach_name");
		tbean.setTeacher_id(teach_id);
		tbean.setTeacher_name(teach_name);
		int flag=adm.insertTeach(tbean);
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
