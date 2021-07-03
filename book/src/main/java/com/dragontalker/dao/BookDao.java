package com.dragontalker.dao;

import com.dragontalker.pojo.Book;

public interface BookDao {

	public int addBook(Book book);
	
	public int deleteBookById(Integer id);
}
