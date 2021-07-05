package com.dragontalker.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.dragontalker.pojo.Cart;
import com.dragontalker.pojo.CartItem;
import com.dragontalker.service.OrderService;
import com.dragontalker.service.impl.OrderServiceImpl;

public class OrderServiceTest {
	
	@Test
	public void testCreateOrder() {
		Cart cart = new Cart();
		cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000)));
		cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000)));
		cart.addItem(new CartItem(2, "数据结构与算法", 1, new BigDecimal(100), new BigDecimal(100)));
		
		OrderService orderService = new OrderServiceImpl();
		
		System.out.println("订单号是: " + orderService.createOrder(cart, 1));
	}
}
