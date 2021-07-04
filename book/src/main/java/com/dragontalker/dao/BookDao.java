package com.dragontalker.dao;

import java.util.List;

import com.dragontalker.pojo.Book;

public interface BookDao {

	public int addBook(Book book);
	
	public int deleteBookById(Integer id);
	
	public int updateBook(Book book);
	
	public Book queryBookById(Integer id);
	
	public List<Book> queryBooks();

	public Integer queryForPageTotalCount();
}
