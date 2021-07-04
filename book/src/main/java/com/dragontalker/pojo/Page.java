package com.dragontalker.pojo;

import java.util.List;

public class Page<T> {
	
	public static final Integer PAGE_SIZE = 4;
	
	private Integer pageNo;
	private Integer pageTotal;
	private Integer pageSize = PAGE_SIZE;
	private Integer pageTotalCount;
	private List<T> items;
	
	public Page() {}

	public Page(Integer pageNo, Integer pageTotal, Integer pageTotalCount, List<T> items) {
		this.pageNo = pageNo;
		this.pageTotal = pageTotal;
		this.pageTotalCount = pageTotalCount;
		this.items = items;
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

	public List<T> getitems() {
		return items;
	}

	public void setitems(List<T> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", pageTotal=" + pageTotal + ", pageSize=" + pageSize + ", pageTotalCount="
				+ pageTotalCount + ", items=" + items + "]";
	}
	
}
