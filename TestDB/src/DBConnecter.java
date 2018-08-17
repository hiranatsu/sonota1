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
	private static String driverName = "com.mysql.jdbc.Driver";

	//DB接続URL
	private static String url
	= "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	//DB接続ユーザー名
	private static String user = "root";

	//DB接続パスワード
	private static String password = "mysql";


	/*Connection - 特定のデータベースとの接続(セッション)を表現します。
	 * 接続のコンテキスト内でSQL文が実行され結果が返されます。
	 *
	 *
	 */

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
