package com.simplilear.admindao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.simplelearn.bean.TeacherBean;
import com.simplelearn.bean.UserBean;
import com.simplelearn.db.DBUtility;
import com.simplelearn.db.DaoConstant;

public class AdminDao {
	UserBean ubean = new UserBean();

	public UserBean validateUser(int user_id) {
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(DaoConstant.UFETCH_QUERY + user_id);
			while (rs.next()) {

				ubean.setUser_id(rs.getInt(1));
				ubean.setUname(rs.getString(2));
				ubean.setLevel(rs.getString(3));
				ubean.setPass(rs.getString(4));

			}
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return ubean;

	}

	public int insertClass(List l) {
		int flag=0;
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
	    Integer class_id=(Integer) l.get(0);	
	    String class_std=(String)l.get(1);
		try {
			PreparedStatement pst = con.prepareStatement(DaoConstant.INSERT_CLASS);
			pst.setInt(1,class_id);
			pst.setString(2,class_std);
			flag=pst.executeUpdate();
		    con.close();
		}catch (SQLException e) {

			e.printStackTrace();
		}

		return flag;

	}
	
	public int insertSubjectClass(List l) {
		int flag=0;
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
	    Integer sub_id=(Integer) l.get(0);	
	    
	    String sub_name=(String)l.get(1);
	    Integer class_id=(Integer)l.get(2);
		try {
			PreparedStatement pst = con.prepareStatement(DaoConstant.INSERT_SUB);
			pst.setInt(1,sub_id);
			pst.setString(2,sub_name);
			pst.setInt(3,class_id);
			flag=pst.executeUpdate();
		    con.close();
		}catch (SQLException e) {

			e.printStackTrace();
		}

		return flag;

	}
	
	public int insertTeacherClass(List l) {
		int flag=0;
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
	    Integer teach_id=(Integer) l.get(0);	
	    
	    String teach_name=(String)l.get(1);
	    Integer class_id=(Integer)l.get(2);
		try {
			PreparedStatement pst = con.prepareStatement(DaoConstant.INSERT_TEACH);
			pst.setInt(1,teach_id);
			pst.setString(2,teach_name);
			pst.setInt(3,class_id);
			flag=pst.executeUpdate();
		    con.close();
		}catch (SQLException e) {

			e.printStackTrace();
		}

		return flag;

	}
	
	public List<Object> getStudentData(){
		List<Object> list=new ArrayList<>();
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
		try {
		  PreparedStatement pst=con.prepareStatement(DaoConstant.SHOW_STUDENT);
		  ResultSet rs=pst.executeQuery();
		  while(rs.next()) {
			  list.add(rs.getInt(1));
			  list.add(rs.getString(2));
			  list.add(rs.getString(3));
		  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Object> getClassData(){
		List<Object> list=new ArrayList<>();
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
		try {
		  PreparedStatement pst=con.prepareStatement(DaoConstant.CLASS_REP);
		  ResultSet rs=pst.executeQuery();
		  while(rs.next()) {
			  list.add(rs.getString(1));
			  list.add(rs.getString(2));
			  list.add(rs.getString(3));
			  list.add(rs.getString(3));
		  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int insertTeach(TeacherBean tbean) {
		int flag=0;
		DBUtility utl = new DBUtility();
		Connection con;
		con = utl.getDBConn();
	    Integer teach_id=tbean.getTeacher_id();
	    String teach_name=tbean.getTeacher_name();
		try {
			PreparedStatement pst = con.prepareStatement(DaoConstant.INSERT_TEACH);
			pst.setInt(1,teach_id);
			pst.setString(2,teach_name);
			pst.setInt(1,0);
			flag=pst.executeUpdate();
		    con.close();
		}catch (SQLException e) {

			e.printStackTrace();
		}

		return flag;

	}
}
