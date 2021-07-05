package com.dragontalker.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private Integer totalCount;
	private BigDecimal totalPrice;
	private List<CartItem> items = new ArrayList<CartItem>();
	
	public void addItem(CartItem cartItem) {
		items.add(cartItem);
	}
	
	public Integer getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public List<CartItem> getItems() {
		return items;
	}
	
	public void setItems(List<CartItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [totalCount=" + totalCount + ", totalPrice=" + totalPrice + ", items=" + items + "]";
	}
	
}
