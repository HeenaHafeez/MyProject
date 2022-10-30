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
@WebServlet("/AssignSubject")
public class AssignSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flag=0;
		AdminDao adm = new AdminDao();
		String[] sub=request.getParameterValues("sub");
		String class_std = request.getParameter("class_std");
		Integer class_id = Integer.parseInt(request.getParameter("class_id"));
		List<Object> l=new ArrayList<>();
		for(int i=0;i<sub.length;i++) {
			l.add(i);	
			l.add(sub[i]);
			l.add(class_id);
			
			flag=adm.insertSubjectClass(l);
			l.removeAll(l);
		}
		
		if (flag==1) {
			request.setAttribute("Error","Record Inserted Successfully" );
			request.getRequestDispatcher("AssignSubject.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("Error","Some Problem occurred While insertion" );
			request.getRequestDispatcher("AssignSubject.jsp").forward(request,response);
		}
		
	}

	

}
