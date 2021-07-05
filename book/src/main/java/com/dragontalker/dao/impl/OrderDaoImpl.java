package com.dragontalker.dao.impl;


import com.dragontalker.dao.OrderDao;
import com.dragontalker.pojo.Order;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	@Override
	public int saveOrder(Order order) {
		String sql = "insert into t_order(`order_id`, `create_time`, `price`, `status`, `user_id`) values(?, ?, ?, ?, ?)";
		Object[] args = {order.getOrder_id()
	}

}
