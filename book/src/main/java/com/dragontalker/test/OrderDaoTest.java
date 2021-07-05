package com.dragontalker.test;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.dragontalker.dao.OrderDao;
import com.dragontalker.dao.impl.OrderDaoImpl;
import com.dragontalker.pojo.Order;

public class OrderDaoTest {

	@Test
	public void testSaveOrder() {
		
		OrderDao orderDao = new OrderDaoImpl();
		
		orderDao.saveOrder(new Order("1234567890", new Date(), new BigDecimal(10), 0, 1));
		
	}
}
