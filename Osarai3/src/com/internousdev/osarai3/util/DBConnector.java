package com.internousdev.osarai3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	//DB接続情報を設定
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/projdb5";
	private static String user = "root";
	private static String password = "mysql";


	public Connection getConnection(){
		//変数定義
		Connection con = null;
		try{
			//JDBCドライバをロードする
			Class.forName(driverName);
			//DBへのコネクションを作成
			con = DriverManager.getConnection(url,user,password);
			//例外発生時の処理
		}catch(ClassNotFoundException e){
			e.printStackTrace();  //エラー内容をコンソールに出力
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}
