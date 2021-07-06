package com.dragontalker.service.impl;

import java.util.Date;
import java.util.Map;

import com.dragontalker.dao.BookDao;
import com.dragontalker.dao.OrderDao;
import com.dragontalker.dao.OrderItemDao;
import com.dragontalker.dao.impl.BookDaoImpl;
import com.dragontalker.dao.impl.OrderDaoImpl;
import com.dragontalker.dao.impl.OrderItemDaoImpl;
import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Cart;
import com.dragontalker.pojo.CartItem;
import com.dragontalker.pojo.Order;
import com.dragontalker.pojo.OrderItem;
import com.dragontalker.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao = new OrderDaoImpl();
	private OrderItemDao orderItemDao = new OrderItemDaoImpl();
	private BookDao bookDao = new BookDaoImpl();

	@Override
	public String createOrder(Cart cart, Integer userId) {
		
		System.out.println("OrderServlet程序在[" + Thread.currentThread().getName() + "]中...");
		
		String orderId = System.currentTimeMillis() + "" + userId;
		
		Order order = new Order(orderId, new Date(), cart.getTotalPrice(), 0, userId);
				
		orderDao.saveOrder(order);
		
		for (Map.Entry<Integer, CartItem> entry : cart.getItems().entrySet()) {
			
			CartItem cartItem = entry.getValue();
			
			OrderItem orderItem = new OrderItem(null, cartItem.getName(), cartItem.getCount(), cartItem.getPrice(), cartItem.getTotalPrice(), orderId);
			
			orderItemDao.saveOrderItem(orderItem);
			
			Book book = bookDao.queryBookById(cartItem.getId());
			book.setSales(book.getSales() + cartItem.getCount());
			book.setStock( book.getStock() - cartItem.getCount());
			bookDao.updateBook(book);
		}
		
		cart.clear();
		
		return orderId;
	
	}

}
