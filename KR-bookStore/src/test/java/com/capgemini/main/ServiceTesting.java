package com.capgemini.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.main.service.CancleOrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTesting {
	@Autowired
	UpdateQuantityApplication updateQuantityService;
	
	/*
	@Test
	public void cancleOrder()
	{
		String val="Quantity updated";
		assertEquals(val,"Quantity updated");
	}

	@Test
	public void alreadyQuantityUpdated()
	{
		String val="quantity is already updated";
		assertEquals(val,"quantity is already updated");
	}
	
	@Test
	public void notExistsOrder()
	{
		String val="Wrong Order Number";
		assertEquals(val,"Wrong Order Number");
	}
	*/
}
