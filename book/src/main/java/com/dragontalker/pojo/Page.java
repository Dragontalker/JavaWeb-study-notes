package com.dragontalker.pojo;

import java.util.List;

public class Page {
	
	public static final Integer PAGE_SIZE = 4;
	
	private Integer pageNo;
	private Integer pageTotal;
	private Integer pageSize = PAGE_SIZE;
	private Integer pageTotalCount;
	private List<Book> books;
	
	public Page() {}

	public Page(Integer pageNo, Integer pageTotal, Integer pageTotalCount, List<Book> books) {
		this.pageNo = pageNo;
		this.pageTotal = pageTotal;
		this.pageTotalCount = pageTotalCount;
		this.books = books;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Integer getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(Integer pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
