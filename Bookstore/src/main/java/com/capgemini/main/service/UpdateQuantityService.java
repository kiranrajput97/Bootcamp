package com.capgemini.main.service;

public interface UpdateQuantityService {
	public boolean findOrderById(int orderId);
	public String updateQuantity(int orderId);
}
