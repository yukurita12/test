package com.internousdev.webproj2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj2.util.DBConnector;

public class HelloStrutsDAO {
	public boolean select() {
		boolean ret = false;
		DBConnector db;
		db = new DBConnector();
		Connection con=db.getConnection();//conにゲットコネクションメソッドを代入
		String sql="select * from users";
		try {
			PreparedStatement ps=con.prepareStatement(sql);//変数psにSQLにログインするためのconとデータが載っているSQLを代入
			ResultSet rs=ps.executeQuery();//データベースを実行させる、resultsetは結果を戻らせる。
			if(rs.next()) {//一つ以上のカラムがあればトゥルーが走る
				ret=true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}return ret;//trueかfalseを返す。
	}

}
