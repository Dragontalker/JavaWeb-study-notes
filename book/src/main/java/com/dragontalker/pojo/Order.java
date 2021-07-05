package com.dragontalker.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

	private String order_id;
	private Date create_time;
	private BigDecimal price;
	private Integer status = 0;
}
