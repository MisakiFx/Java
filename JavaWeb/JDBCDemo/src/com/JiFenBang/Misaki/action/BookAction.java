package com.JiFenBang.Misaki.action;

import java.sql.SQLException;
import java.util.List;

import com.JiFenBang.Misaki.dao.BookDao;
import com.JiFenBang.Misaki.model.Book;

public class BookAction {
	public static void main(String[] args) throws SQLException {
		BookDao b = new BookDao();
		Book bk = new Book();
		bk.setId(4);
		bk.setName("��Լ");
		b.AddBook(bk);
	}
}
