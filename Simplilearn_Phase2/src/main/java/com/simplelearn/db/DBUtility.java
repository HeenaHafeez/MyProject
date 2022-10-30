package com.simplelearn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	public Connection getDBConn() {
		Connection conn = null;
		try {
			Class.forName(DaoConstant.CLASS_NAME);
			conn=DriverManager.getConnection(
					DaoConstant.DB_URl,DaoConstant.DB_USER,DaoConstant.DB_PASS);
			
		} catch (ClassNotFoundException|SQLException e) {
			
			e.printStackTrace();
		}
		return conn;		
		
	}
	

}
