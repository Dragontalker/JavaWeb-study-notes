package com.dragontalker.dao.impl;

import java.util.List;

import com.dragontalker.dao.BookDao;
import com.dragontalker.pojo.Book;

public class BookDaoImpl extends BaseDao implements BookDao {

	@Override
	public int addBook(Book book) {
		String sql = "insert into t_book(`name` , `author` , `price` , `sales` , `stock` , `img_path`) values(?,?,?,?,?,?)";
		Object[] args = {book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath()};
		return update(sql, args);
	}

	@Override
	public int deleteBookById(Integer id) {
		String sql = "delete from t_book where id = ?";
		return update(sql, id);
	}

	@Override
	public int updateBook(Book book) {
		
		System.out.println("BookDaoImpl程序在[" + Thread.currentThread().getName() + "]中...");
		
		String sql = "update t_book set `name`= ? , `author`=? , `price`=? , `sales`=? , `stock`=? , `img_path`=? where id = ?";
		Object[] args = {book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath(),  book.getId()};
		return update(sql, args);
	}

	@Override
	public Book queryBookById(Integer id) {
		String sql = "select `id`, `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from t_book where id = ?";
		return queryForOne(Book.class, sql, id);
	}

	@Override
	public List<Book> queryBooks() {
		String sql = "select `id`, `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from t_book";
		return queryForList(Book.class, sql);
	}

	@Override
	public Integer queryForPageTotalCount() {
		String sql = "select count(*) from t_book";
		Number count = (Number) queryForSingleValue(sql);
		return count.intValue();
	}

	@Override
	public List<Book> queryForPageItems(Integer begin, Integer pageSize) {
		String sql = "select `id`, `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from t_book limit ?, ?";
		return queryForList(Book.class, sql, begin, pageSize);
	}

	@Override
	public Integer queryForPageTotalCountByPrice(Integer min, Integer max) {
		String sql = "select count(*) from t_book where price between ? and ?";
		Number count = (Number) queryForSingleValue(sql, min, max);
		return count.intValue();
	}

	@Override
	public List<Book> queryForPageItemsByPrice(Integer begin, Integer pageSize, Integer min, Integer max) {
		String sql = "select `id`, `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from t_book where `price` between ? and ?  order by `price` limit ?, ?";
		return queryForList(Book.class, sql, min, max, begin, pageSize);
	}

}
