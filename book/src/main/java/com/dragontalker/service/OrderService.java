package com.dragontalker.service;

import com.dragontalker.pojo.Cart;

public interface OrderService {

	public String createOrder(Cart cart, Integer userId);
}
