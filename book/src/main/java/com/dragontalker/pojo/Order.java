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

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", create_time=" + create_time + ", price=" + price + ", status="
				+ status + ", userId=" + userId + "]";
	}
	
}
