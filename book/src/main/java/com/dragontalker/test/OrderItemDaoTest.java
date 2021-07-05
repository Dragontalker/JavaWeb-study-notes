package com.dragontalker.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.dragontalker.dao.OrderItemDao;
import com.dragontalker.dao.impl.OrderItemDaoImpl;
import com.dragontalker.pojo.OrderItem;

public class OrderItemDaoTest {

	@Test
	public void testSaveOrderItem() {
		
		OrderItemDao orderItemDao = new OrderItemDaoImpl();
		
		orderItemDao.saveOrderItem(new OrderItem(null, "Java: 0 to 1", 1, new BigDecimal(100), new BigDecimal(100), "1234567890"));
		orderItemDao.saveOrderItem(new OrderItem(null, "JavaScript: 0 to 1", 1, new BigDecimal(100), new BigDecimal(100), "1234567890"));
		orderItemDao.saveOrderItem(new OrderItem(null, "MySQL: 0 to 1", 1, new BigDecimal(100), new BigDecimal(100), "1234567890"));

	}
}
