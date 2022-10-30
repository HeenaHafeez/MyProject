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
@WebServlet("/AssignTeacher")
public class AssignTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flag=0;
		AdminDao adm = new AdminDao();
		String[] class_id=request.getParameterValues("class_id");
		String teach_name = request.getParameter("teach_name");
		
		List<Object> l=new ArrayList<>();
		for(int i=0;i<class_id.length;i++) {
			l.add(i);
			l.add(teach_name);
			l.add(class_id[i]);
			
			flag=adm.insertSubjectClass(l);
			l.removeAll(l);
		}
		
		if (flag==1) {
			request.setAttribute("Error","Record Inserted Successfully" );
			request.getRequestDispatcher("AssignTeacherjsp").forward(request,response);
		}
		else
		{
			request.setAttribute("Error","Some Problem occurred While insertion" );
			request.getRequestDispatcher("AssignTeacher.jsp").forward(request,response);
		}
		
	}

	

}
