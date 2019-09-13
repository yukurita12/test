package com.internousdev.webproj4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dto.HelloStrutsDTO;
import com.internousdev.webproj4.util.DBConnector;

public class HelloStrutsDAO {
	List<HelloStrutsDTO> helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();
	
	public List<HelloStrutsDTO> select() {
		DBConnector db;
		db = new DBConnector();
		Connection con = db.getConnection();//conにゲットコネクションメソッドを代入

		String sql = "select * from users";
		try {
			PreparedStatement ps = con.prepareStatement(sql);//変数psにSQLにログインするためのconとデータが載っているSQLを代入
			ResultSet rs = ps.executeQuery();//データベースを実行させる、resultsetは結果を戻らせる。
			while (rs.next()) {//一つ以上のカラムがあればトゥルーが走る
				HelloStrutsDTO dto=new HelloStrutsDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続できます。");
				helloStrutsDTOList.add(dto);
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return helloStrutsDTOList;
	}

}
