package com.dragontalker.service.impl;

import com.dragontalker.dao.OrderDao;
import com.dragontalker.dao.OrderItemDao;
import com.dragontalker.dao.impl.OrderDaoImpl;
import com.dragontalker.dao.impl.OrderItemDaoImpl;
import com.dragontalker.pojo.Cart;
import com.dragontalker.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao = new OrderDaoImpl();
	private OrderItemDao orderItemDao = new OrderItemDaoImpl();

	@Override
	public String createOrder(Cart cart, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
