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
		Book book = new Book(null, "GuoGeHaoShuai", "191125", new BigDecimal(9999), 110000, 0, null);
		bookdao.addBook(book);
	}
	
	@Test
	public void testUpdateBook() {
		Book book = new Book(21, "TaJiaDouKeYiZheMeShuai", "191125", new BigDecimal(9999), 110000, 0, null);
		bookdao.updateBook(book);
	}
	
	@Test
	public void testQueryBookById() {
		System.out.println(bookdao.queryBookById(21));
	}
	
	@Test
	public void testQueryBooks() {
		for (Book book : bookdao.queryBooks()) {
			System.out.println(book);
		}
	}

}
