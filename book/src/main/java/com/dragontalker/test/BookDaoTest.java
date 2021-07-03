package com.dragontalker.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.dragontalker.dao.BookDao;
import com.dragontalker.dao.impl.BookDaoImpl;
import com.dragontalker.pojo.Book;

public class BookDaoTest {
	
	private BookDao bookdao = new BookDaoImpl();
	
	@Test
	public void testAddBook() {
		Book book = new Book(null, "国哥为什么这么帅!", "191125", new BigDecimal(9999), 110000, 0, null);
		bookdao.addBook(book);
	}

}
