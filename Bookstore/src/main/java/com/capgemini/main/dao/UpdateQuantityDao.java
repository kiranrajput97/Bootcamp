package com.capgemini.main.dao;

import com.capgemini.main.entities.OrderInformation;

public interface UpdateQuantityDao {
	
		public boolean findOrder(int orderId);
		public OrderInformation getOrderDetails(int orderId);
		public void updateQuantity(int orderId);
		public void updateOrderStatus(int orderId,String orderStatus);

}
