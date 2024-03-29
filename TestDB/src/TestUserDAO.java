import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestUserDAO {

		String name = "";
		String password = "";

		/*■■①■■
		 * クラスDBConnecterをここでインスタンス化。
		 * クラスDBCeonnecterで宣言したgetConnectionを変数dbに付随させてconにインスタンス化。
		 */

	public void select(String name, String password){
		DBConnecter db = new DBConnecter();
		Connection con = db.getConnection();

		/*
		 * ここではsqlの設定の準備を行っている。
		 * name=?、password=?なのは入れる値が時々によって違ってくるため。
		 */

		String sql = "select * from test_table where user_name=? and password=?";

		// 宣言したsqlをconに付随させて変数psに代入。

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			//if文で変数rsが値をてにいれられたら、対象のuser_name,passwordを表示する。
			//
			//catch以降は実行に失敗した際の受け皿的な宣言。
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	     //■■ここまで■■

		 //■■②■■

	public void selectAll(){
		DBConnecter db = new DBConnecter();
		Connection con = db.getConnection();

		/*
		 * ここではテーブルすべての値をセレクトしている。
		 */

		String sql ="select * from test_table";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			/*
			 * whileで繰り返しているため、すべての値が表示される。
			 */
			while (rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

    //■■ここまで■■

	 //■■③■■

	public void selectByName(String name){
		DBConnecter db = new DBConnecter();
		Connection con = db.getConnection();

		String sql ="select * from test_table where user_name=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	//■■ここまで■■

	//■■④■■

	 public void selectByPassword(String password){
		 DBConnecter db = new DBConnecter();
		 Connection con = db.getConnection();

		 String sql = "select * from test_table where password=?";
		 try {
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, password);
			 ResultSet rs = ps.executeQuery();

			 while(rs.next()){
				 System.out.println(rs.getString("user_name"));
				 System.out.println(rs.getString("password"));
			 }
		 }catch(SQLException e){
			 e.printStackTrace();
		 }try{
			 con.close();
		 }catch (SQLException e){
			 e.printStackTrace();
		 }
	 }

		//■■ここまで■■

		//■■⑤データの更新■■

	 public void updateUserNameByUserName(String oldName, String newName){
		 DBConnecter db = new DBConnecter();
		 Connection con = db.getConnection();

		 String sql = "update test_table set user_name=? where user_name=?";
		 try {
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, newName);
			 ps.setString(2, oldName);
			 int i = ps.executeUpdate();
			 if(i>0){
				 System.out.println(i + "件更新されました");
			 }else{
				 System.out.println("該当するデータはありませんでした");
			 }
		 }catch(SQLException e){
			 e.printStackTrace();
		 }try{
			 con.close();
		 }catch(SQLException e){
			 e.printStackTrace();
		 }

	 }

		//■■ここまで■■

		//■■⑥データの削除■■

	 public void delete(String name){
		 DBConnecter db = new DBConnecter();
		 Connection con = db.getConnection();

		 String sql = "delete from test_table where user_name=?";
		 try{
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, name);
			 int i = ps.executeUpdate();
			 if(i>0){
				 System.out.println(i + "件削除されました");
			 }
		 }catch (SQLException e){
			 e.printStackTrace();
		 }try{
			 con.close();
		 }catch (SQLException e){
			 e.printStackTrace();
		 }
	 }

}











