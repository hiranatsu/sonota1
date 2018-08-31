package com.internousdev.osarai3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.osarai3.dto.HelloStrutsDTO;
import com.internousdev.osarai3.util.DBConnector;


public class HelloStrutsDAO {
	//「helloStrutsDTO」というリストの生成
	List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

	public List<HelloStrutsDTO> select(){
		//DBConnectorをインスタンス化して、conに入れる。
		/*DBConnectorでDBへのコネクションを作成する設定ができているので
		 * conに入れてこのクラスでのDB接続を確立させている。
		*/
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

	//SQL文の定義をする
		String sql = "select * from users";

		try{
			//実行するSQL文を指定して、executeQueryでSQL文を実行。
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();


			/*
			 * 取得した結果をDTOクラスに格納。
			 * */
			while(rs.next()){
				HelloStrutsDTO dto = new HelloStrutsDTO();
				dto.setUserid(rs.getInt("user_id"));
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続可能です。");
				helloStrutsDTOList.add(dto);
			}
		}catch(SQLException e){
			//例外処理
			e.printStackTrace();
		}
		try{
			//DB接続の切断の処理
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return helloStrutsDTOList;

	}


}
