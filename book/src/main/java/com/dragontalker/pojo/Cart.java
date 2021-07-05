package com.dragontalker.pojo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
	
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
	
	public void updateCount(Integer id,Integer count) {
        // 先查看购物车中是否有此商品。如果有，修改商品数量，更新总金额
        CartItem cartItem = items.get(id);
        if (cartItem != null) {
            cartItem.setCount(count);// 修改商品数量
            cartItem.setTotalPrice( cartItem.getPrice().multiply(new BigDecimal( cartItem.getCount() )) ); // 更新总金额
        }
    }
	
	public Integer getTotalCount() {
		
		Integer totalCount = 0;
		
		for (Map.Entry<Integer, CartItem> entry : items.entrySet()) {
			totalCount +=entry.getValue().getCount();
		}
		
		return totalCount;
	}
	
	public BigDecimal getTotalPrice() {
		
		BigDecimal totalPrice = new BigDecimal(0);
		
		for (Map.Entry<Integer, CartItem> entry : items.entrySet()) {
			totalPrice = totalPrice.add(entry.getValue().getTotalPrice());
		}
		
		return totalPrice;
	}
	
	public Map<Integer, CartItem> getItems() {
		return items;
	}
	
	public void setItems(Map<Integer, CartItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [" + "totalCount=" + getTotalCount() + ", totalPrice=" + getTotalPrice() + ", items=" + items + "]";
	}

}
