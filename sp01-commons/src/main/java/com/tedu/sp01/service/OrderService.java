package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	
	Order getOrder(String OrderId);
	/**
	 * ���涩��
	 */
	void addOrder(Order order);
}
