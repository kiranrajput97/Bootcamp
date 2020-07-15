package com.capgemini.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.main.dao.UpdateQuantityDao;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTesting {
	
	@Autowired
	UpdateQuantityDao updateQuantityDao;
	
	
	@Test
	public void checkOrderNotExist()
	{
		boolean val=false;
		assertEquals(val,11800010);
	}
	
	@Test
	public void checkOrderExist()
	{
		boolean val=true;
		assertEquals(val,11800001);
	}
	
	
	
	
	

}
