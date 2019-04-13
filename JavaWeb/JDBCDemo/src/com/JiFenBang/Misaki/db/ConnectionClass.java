package com.JiFenBang.Misaki.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {
	private static String url = "jdbc:mysql://47.92.196.104/ScoreBoard";
	private static String user = "root";
	private static String password = "web003";
	private static Connection conn = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//���ӵ����ݿ�
//			conn = DriverManager.getConnection(url, user, password);
			conn = DriverManager.getConnection(url+"?useUnicode=true&characterEncoding=UTF8", user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		System.out.println(ConnectionClass.getConnection());
	}
	
	//	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		//��������
//		
////		System.out.println(conn);
////		try {
////			Thread.sleep(50000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		//ʹ�����ݿ�ָ��
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery("select id, name from book");
//		while(rs.next()) {
//			System.out.println(rs.getInt("id") + "," + rs.getString("name"));
//		}
//	}
}
