package com.capgemini.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.main.dao.UpdateQuantityDao;
import com.capgemini.main.entities.OrderInformation;

public class UpdateQuantityServiceImp implements UpdateQuantityService {
	@Autowired
	UpdateQuantityDao updateQuantityDao;
	@Override
	public boolean findOrderById(int orderId) {
		// TODO Auto-generated method stub
		
		return updateQuantityDao.findOrder(orderId);
		
	}
	
	@Override
	public String updateQuantity(int orderId) {
		// TODO Auto-generated method stub
		
		OrderInformation orderDetails=new OrderInformation();
			orderDetails=updateQuantityDao.getOrderDetails(orderId);
			
			if(orderDetails.getOrderStatus().equals("Processing"))
			{
				updateQuantityDao.updateOrderStatus(orderId, "processing");
				return "Updating the quantity of the books";
			}
			else if(orderDetails.getOrderStatus().equals("Cancelled"))
			{
				return "Book Order is already Cancelled, cannot update";
			}
			else if(orderDetails.getOrderStatus().equals("Shipped"))
			{
				return "Cannot update quantity of books, Order is already Shipped";
			}
			return null;
		
		 
	}



}
