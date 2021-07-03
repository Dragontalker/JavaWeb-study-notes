package com.dragontalker.service.impl;

import java.util.List;

import com.dragontalker.dao.BookDao;
import com.dragontalker.dao.impl.BookDaoImpl;
import com.dragontalker.pojo.Book;
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
		// TODO Auto-generated method stub

	}

	@Override
	public Book queryBookById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> queryBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
