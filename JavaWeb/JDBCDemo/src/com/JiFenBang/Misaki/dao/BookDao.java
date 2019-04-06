package com.JiFenBang.Misaki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JiFenBang.Misaki.db.ConnectionClass;
import com.JiFenBang.Misaki.model.Book;

public class BookDao {
	/** ���� 
	 * @throws SQLException */
	public void AddBook(Book b) throws SQLException {
		Connection conn = ConnectionClass.getConnection();
		String sql = "" + "insert into book" + "(id, name)" + 
		"values(" +
		"?,?)";
		//Ԥ��������
		PreparedStatement ptmt = conn.prepareStatement(sql);
		//������Ĳ�������ŵ�������ȥ
		ptmt.setInt(1, b.getId());
		ptmt.setString(2, b.getName());
		ptmt.execute();
	}
	/** �޸� */
	public void UpdateBook() {
		
	}
	/** ɾ�� */
	public void DeleteBook() {
		
	}
	/** ��ѯ 
	 * @throws SQLException */
	public List<Book> query() throws SQLException {
		Connection conn = ConnectionClass.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id, name from book");
		//�������Ͻ��н���
		List<Book> book = new ArrayList<Book>();
		Book b = null;
		//��rs�еĽ��¼�뵽book������                     
		while(rs.next()) {
			b = new Book();
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			book.add(b);
		}
		return book;
	}
	public Book get() {
		return null;
	}
}
