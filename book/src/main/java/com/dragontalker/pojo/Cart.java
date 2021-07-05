package com.dragontalker.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private Integer totalCount;
	private BigDecimal totalPrice;
	private List<CartItem> items = new ArrayList<CartItem>();
}
