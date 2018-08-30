package com.internousdev.osarai2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	public static String driverName = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost/projdb3";
	public static String user = "root";
	public static String password = "mysql";

public Connection getConnection(){
	Connection con = null;
	try{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
}

}
