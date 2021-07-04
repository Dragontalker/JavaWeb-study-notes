package com.dragontalker.service.impl;

import java.util.List;

import com.dragontalker.dao.BookDao;
import com.dragontalker.dao.impl.BookDaoImpl;
import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Page;
import com.dragontalker.service.BookService;

import jdk.management.resource.internal.TotalResourceContext;

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
		Page<Book> page = new Page<>();
		
		// 求总记录数
		Integer pageTotalCount = bookDao.queryForPageTotalCount();
		
		// 设置总记录数
		page.setPageTotalCount(pageTotalCount);
		
		// 求总页数
		Integer pageTotal = pageTotalCount / pageSize;
		if (pageTotalCount % pageSize > 0) {
			pageTotal++;
		}
		
		// 设置总页码
		page.setPageTotal(pageTotal);
		
		// 设置每页显示的数量
		page.setPageSize(pageSize);
		
		// 设置当前页码
		page.setPageNo(pageNo);
		
		Integer begin = (page.getPageNo() - 1) * pageSize;
		// 求当前页数据
		List<Book> items = bookDao.queryForPageItems(begin, pageSize);
		// 设置当前页数据
		page.setItems(items);
		
		return page;
	}

	@Override
	public Integer getPageTotal(Integer pageSize) {
		// 求总记录数
		Integer pageTotalCount = bookDao.queryForPageTotalCount();
		
		// 求总页数
		Integer pageTotal = pageTotalCount / pageSize;
		if (pageTotalCount % pageSize > 0) {
			pageTotal++;
		}
		
		return pageTotal;
	}

}
