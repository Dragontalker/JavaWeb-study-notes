package com.dragontalker.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

	private String order_id;
	private Date create_time;
	private BigDecimal price;
	// 0未发货, 1已发货, 2已签收
	private Integer status = 0;
	private Integer userId;
	
	public Order() {}

	public Order(String order_id, Date create_time, BigDecimal price, Integer status, Integer userId) {
		this.order_id = order_id;
		this.create_time = create_time;
		this.price = price;
		this.status = status;
		this.userId = userId;
	}
	
}
