package com.dragontalker.pojo;

import java.math.BigDecimal;

public class CartItem {

	private Integer id;
	private String name;
	private Integer count;
	private BigDecimal price;
	private BigDecimal totalPrice;
	
	public CartItem() {
		
	}

	public CartItem(Integer id, String name, Integer count, BigDecimal price, BigDecimal totalPrice) {
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
		this.totalPrice = totalPrice;
	}
	
}
