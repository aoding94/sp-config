package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 通过订单id获取商品列表
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
