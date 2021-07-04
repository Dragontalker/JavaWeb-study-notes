package com.dragontalker.pojo;

import java.util.List;

public class Page {
	
	public static final Integer PAGE_SIZE = 4;
	
	private Integer pageNo;
	private Integer pageTotal;
	private Integer pageSize = PAGE_SIZE;
	private Integer pageTotalCount;
	private List<Book> books;
}
