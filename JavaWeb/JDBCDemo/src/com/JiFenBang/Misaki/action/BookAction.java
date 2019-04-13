package com.JiFenBang.Misaki.action;

import java.sql.SQLException;
import java.util.List;

import com.JiFenBang.Misaki.dao.BookDao;
import com.JiFenBang.Misaki.model.Book;

public class BookAction {
	public static void main(String[] args) throws SQLException {
		BookDao b = new BookDao();
		Book bk = new Book();
		List<Book> book = b.query();
		for(Book b1 : book) {
			System.out.println(b1.getId() + "\t" + b1.getName());
		}
		
	}
}
