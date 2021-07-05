package com.dragontalker.pojo;

import java.math.BigDecimal;

public class OrderItem {

	private Integer id;
	private String name;
	private Integer count;
	private BigDecimal price;
	private BigDecimal totalPrice;
	private String orderId;
	
	public OrderItem() {

	}

	public OrderItem(Integer id, String name, Integer count, BigDecimal price, BigDecimal totalPrice, String orderId) {
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
		this.totalPrice = totalPrice;
		this.orderId = orderId;
	}
	
}
