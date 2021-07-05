package com.dragontalker.pojo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
	
	private Integer totalCount;
	private BigDecimal totalPrice;
	private Map<Integer, CartItem> items = new LinkedHashMap<Integer, CartItem>();
	
	public void addItem(CartItem cartItem) {
		
		CartItem item = items.get(cartItem.getId());
		
		if (item == null) {
			items.put(cartItem.getId(), cartItem);
		} else {
			item.setCount(item.getCount() + 1);
			item.setTotalPrice(item.getPrice().multiply(new BigDecimal(item.getCount())));
		}
	}
	
	public void deleteItem(Integer id) {
		
		items.remove(id);
	}
	
	public void clear() {
		
		items.clear();
	}
	
	public void updateCount(Integer id, Integer count) {
		
		CartItem cartItem = items.get(id);
		
		if (cartItem != null) {
			cartItem.setCount(count);
			cartItem.setTotalPrice(cartItem.getPrice().multiply(new BigDecimal(cartItem.getCount())));
		}
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
	
	public Map<Integer, CartItem> getItems() {
		return items;
	}
	
	public void setItems(Map<Integer, CartItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [totalCount=" + totalCount + ", totalPrice=" + totalPrice + ", items=" + items + "]";
	}
	
}
