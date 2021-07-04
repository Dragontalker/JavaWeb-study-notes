package com.dragontalker.service;

import java.util.List;

import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Page;

public interface BookService {

	public void addBook(Book book);
	
	public void deleteBookById(Integer id);
	
	public void updateBook(Book book);
	
	public Book queryBookById(Integer id);
	
	public List<Book> queryBooks();

	public Page<Book> page(Integer pageNo, Integer pageSize);
}
