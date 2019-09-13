package com.internousdev.webproj2.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	
	private static String url="jdbc:mysql://localhost/testdb";
	
	private static String user="root";
	
	private static String password="root";
	
	
	public Connection getConnection() {//getConnectionメソッド
		Connection con=null;
		try {
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);//SQLにログインするための準備物を変数conに代入する。
		}catch(ClassNotFoundException e) {//エラーが起きた際に行う処理
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}return con;
	}

}
