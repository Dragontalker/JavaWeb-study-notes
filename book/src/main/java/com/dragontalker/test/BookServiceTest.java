package com.dragontalker.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.dragontalker.pojo.Book;
import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;

public class BookServiceTest {

	private BookService bookService = new BookServiceImpl();
	
	@Test
	public void testAddBook() {
		bookService.addBook(new Book(null, "GuoGeZaiShou, TianXiaWoYou", "1125", new BigDecimal(100000), 11125, 0, null));
	}
	
	@Test
	public void testUpdateBook() {
		bookService.updateBook(new Book(22, "SheHuiWoGuoGe, RenHenHuaBuDuo", "1125", new BigDecimal(100000), 0, 11111, null));
	}
	
	@Test
	public void testQueryBookById() {
		System.out.println(bookService.queryBookById(22));
	}
}