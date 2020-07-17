package com.capgemini.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.main.dao.CancleOrderDao;
import com.capgemini.main.entities.OrderInformation;

public class UpdateQuantityServiceImp implements UpdateQuantityService {
	@Autowired
	CancleOrderDao UpdateQuantityDao;
	@Override
	public boolean findOrderById(int orderId) {
		// TODO Auto-generated method stub
		
		return UpdateQuantityDao.findOrder(orderId);
		
	}
	
	@Override
	public String updateQuantity(int orderId) {
		// TODO Auto-generated method stub
		
		OrderInformation orderDetails=new OrderInformation();
			orderDetails=UpdateQuantityDao.getOrderDetails(orderId);
			
			if(orderDetails.getOrderStatus().equals("Processing"))
			{
				UpdateQuantityDao.updateOrderStatus(orderId, "Cancelled");
				return "Order is Cancelled";
			}
			else if(orderDetails.getOrderStatus().equals("Cancelled"))
			{
				return "Order is already Cancelled";
			}
			else if(orderDetails.getOrderStatus().equals("Shipped"))
			{
				return "Cannot Cancelled Order, Order is already Shipped";
			}
			return null;
		
		 
	}



}
