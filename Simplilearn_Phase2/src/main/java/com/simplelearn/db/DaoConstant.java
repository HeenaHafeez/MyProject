package com.simplelearn.db;

public class DaoConstant {

	public static String DB_USER = "hr";
	public static String DB_PASS = "oracle";
	public static String DB_URl = "jdbc:oracle:thin:@localhost:1521/orcl";
	public static String CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	public static String UFETCH_QUERY = "Select userid,user_name,role,pass from usem where userid=";
	public static String INSERT_CLASS = "insert into class_info values(?,?)";
	public static String INSERT_TEACH = "insert into teacher_info values(?,?,?)";
	public static String INSERT_SUB = "insert into subject_info values(?,?,?)";
	public static String SHOW_STUDENT = "select stud_id,stud_name,class_std from student std,class_info cls where std.class_id=cls.class_id";
	public static String CLASS_REP = "select stud_name,class_std,teacher_name,sub_name from student std,class_info cls,teacher_info tech,subject_info sub"
			+ " where std.class_id=cls.class_id" + " and cls.class_id=tech.class_id" + " and tech.class_id=sub.class_id";
}
