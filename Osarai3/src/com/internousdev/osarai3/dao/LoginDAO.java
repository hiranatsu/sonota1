package com.internousdev.osarai3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.osarai3.dto.LoginDTO;
import com.internousdev.osarai3.util.DBConnector;

public class LoginDAO {

	//username,paswordの宣言
	public String username;
	public String password;

	//loginDTOListの生成
	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public List<LoginDTO> select(String username, String password){
		/*DBConnector内でDB接続の設定がされているため、
		 * このクラスにインスタンス化し、conに入れてこのクラスでのDB接続を確立させる。*/
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		//実行するsql文を指定
		String sql = "select * from users where user_name=? and password=?";

		try{
			//preparedstatementのインターフェイスを使い、sqlを実行する。
			PreparedStatement ps = con.prepareStatement(sql);
			/*?への値の代入はsetString等のメソッドを使用。
			 * 第一引数はインデックスナンバーを指定。※配列と違い、１から始まる。
			 * 第二引数はセットする値を指定。
			 * sql文の実行は、今回は変化を伴わないselect文を利用しているため、
			 * executeQueryメソッドを使用する。*/
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				//select文でDBから取得した情報を、DTOクラスに格納
				LoginDTO dto = new LoginDTO();
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}

			/*loginDTOListの要素数が0以下の場合、DTOクラスにそれぞれ「該当ナシ」と設定している。*/
			if(loginDTOList.size() <=0){
				LoginDTO dto = new LoginDTO();
				dto.setUsername("該当ナシ");
				dto.setPassword("該当ナシ");
				loginDTOList.add(dto);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return loginDTOList;

	}

}
