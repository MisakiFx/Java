package com.JiFenBang.Misaki.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {
	private static String url = "jdbc:mysql://47.112.23.227/test";
	private static String user = "root";
	private static String password = "hyx19990925";
	private static Connection conn = null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//连接到数据库
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//加载驱动
		
//		System.out.println(conn);
//		try {
//			Thread.sleep(50000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//使用数据库指令
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id, name from book");
		while(rs.next()) {
			System.out.println(rs.getInt("id") + "," + rs.getString("name"));
		}
	}
}
