package com.capgemini.main;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class RestControllerTesting extends UpdateQuantityApplicationTests {

	


	@Autowired
	private WebApplicationContext webApplicationContext;

	
	//@InjectMocks
	//private OrderInformationController orderInformationController;
	
	private MockMvc mockMvc;
	
	
	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	
	}
	
	@Test
	public void demoTest() throws Exception
	{
		mockMvc.perform(get("/hello")).andExpect(status().isOk())
		.andExpect(content().contentType("Hello"));
	
	
	}
	
}
