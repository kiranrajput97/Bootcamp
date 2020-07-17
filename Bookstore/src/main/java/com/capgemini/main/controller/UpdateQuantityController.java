package com.capgemini.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capgemini.main.service.UpdateQuantityService;

public class UpdateQuantityController {

	@Autowired
	UpdateQuantityService updateQuantityService;
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello";
	}


	@GetMapping("/UpdateQuantity/{orderId}")
	public ResponseEntity<String> DepositSlip(@PathVariable int orderId)  {
		String result="Order Id Not Found, Quantity cannot be updated";
		if(updateQuantityService.findOrderById(orderId))
		{
			
			result=updateQuantityService.updateQuantity(orderId);
			return new ResponseEntity<String>(result,HttpStatus.OK);
			 
		}
		else
			return new ResponseEntity<String>(result,HttpStatus.OK);
		
		
	    }
	

}
