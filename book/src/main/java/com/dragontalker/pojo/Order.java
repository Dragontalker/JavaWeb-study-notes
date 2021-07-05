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
	
}
