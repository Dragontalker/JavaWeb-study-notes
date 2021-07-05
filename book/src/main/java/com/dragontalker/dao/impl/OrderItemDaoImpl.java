package com.dragontalker.dao.impl;

import com.dragontalker.dao.OrderItemDao;
import com.dragontalker.pojo.OrderItem;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {

	@Override
	public int saveOrderItem(OrderItem orderItem) {
		String sql = "insert into t_order_item(`name`, `count`, `price`, `total_price`, `order_id`) values(?, ?, ?, ?, ?)";
		Object[] args = {orderItem.getName(), orderItem.getCount(), orderItem.getPrice(), orderItem.getTotalPrice(), orderItem.getOrderId()};
		return update(sql, args);
	}

}
