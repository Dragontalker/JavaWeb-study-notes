package com.dragontalker.pojo;

import java.util.List;

public class Page<T> {
	
	public static final Integer PAGE_SIZE = 4;
	
	private Integer pageTotal;
	private Integer pageNo;
	private Integer pageSize = PAGE_SIZE;
	private Integer pageTotalCount;
	private List<T> items;

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}
	
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		if (pageNo < 1) {
			pageNo = 1;
		}
		
		if (pageNo > this.pageTotal) {
			pageNo = this.pageTotal;
		}
		
		this.pageNo = pageNo;
	}

	public Integer getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(Integer pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", pageTotal=" + pageTotal + ", pageSize=" + pageSize + ", pageTotalCount="
				+ pageTotalCount + ", items=" + items + "]";
	}
	
}
