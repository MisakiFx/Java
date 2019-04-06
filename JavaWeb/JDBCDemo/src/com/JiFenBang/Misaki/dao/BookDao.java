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
	/** 增加 
	 * @throws SQLException */
	public void AddBook(Book b) throws SQLException {
		Connection conn = ConnectionClass.getConnection();
		String sql = "" + "insert into book" + "(id, name)" + 
		"values(" +
		"?,?)";
		//预处理命令
		PreparedStatement ptmt = conn.prepareStatement(sql);
		//将传入的参数逐个放到命令中去
		ptmt.setInt(1, b.getId());
		ptmt.setString(2, b.getName());
		ptmt.execute();
	}
	/** 修改 */
	public void UpdateBook() {
		
	}
	/** 删除 */
	public void DeleteBook() {
		
	}
	/** 查询 
	 * @throws SQLException */
	public List<Book> query() throws SQLException {
		Connection conn = ConnectionClass.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id, name from book");
		//创建集合进行接收
		List<Book> book = new ArrayList<Book>();
		Book b = null;
		//将rs中的结果录入到book集合中                     
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
