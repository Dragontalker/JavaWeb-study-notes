package com.dragontalker.service.impl;

import java.util.List;

import com.dragontalker.dao.BookDao;
import com.dragontalker.dao.impl.BookDaoImpl;
import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Page;
import com.dragontalker.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao = new BookDaoImpl();

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Override
	public void deleteBookById(Integer id) {
		bookDao.deleteBookById(id);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

	@Override
	public Book queryBookById(Integer id) {
		return bookDao.queryBookById(id);
	}

	@Override
	public List<Book> queryBooks() {
		return bookDao.queryBooks();
	}

	@Override
	public Page<Book> page(Integer pageNo, Integer pageSize) {
		Page<Book> page = new Page();
		
		// 设置当前页码
		page.setP
		
		
		return page;
	}

}
