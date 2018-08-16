/**
 *
 */

/**
 * @author internousdev
 *
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {

	//JDBCドライバー名
	private static String driverName = "com.mysql.jbdc.Driver";

	//DB接続URL
	private static String url
	= "jbdc:mysql://localhost/testdb?autooReconnect=true&useSSL=false";

	//DB接続ユーザー名
	private static String user = "root";

	//DB接続パスワード
	private static String password = "mysql";

  public Connection getConnection(){
	  Connection con = null;
	  try{
		  Class.forName(driverName);
		  con = DriverManager.getConnection(url,user,password);
	  } catch (ClassNotFoundException e){
		  e.printStackTrace();
	  } catch (SQLException e){
		  e.printStackTrace();
	  }
	  return con;
  }

}