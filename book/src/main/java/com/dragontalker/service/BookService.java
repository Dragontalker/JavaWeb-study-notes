package com.dragontalker.service;

import java.util.List;

import com.dragontalker.pojo.Book;

public interface BookService {

	public void addBook(Book book);
	
	public void deleteBook(Book book);
	
	public void updateBook(Book book);
	
	public Book queryBookById(Integer id);
	
	public List<Book> queryBooks();
}
