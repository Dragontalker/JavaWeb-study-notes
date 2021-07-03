package com.dragontalker.dao.impl;

import java.util.List;

import com.dragontalker.dao.BookDao;
import com.dragontalker.pojo.Book;

public class BookDaoImpl extends BaseDao implements BookDao {

	@Override
	public int addBook(Book book) {
		String sql = "insert into t_book(`name` , `author` , `price` , `sales` , `stock` , `img_path`) values(?,?,?,?,?,?)";
		Object[] args = {book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getSales(), book.getStock(), book.getImgPath()};
		return update(sql, args);
	}

	@Override
	public int deleteBookById(Integer id) {
		String sql = "delete from t_book where id = ?";
		return update(sql, id);
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
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
