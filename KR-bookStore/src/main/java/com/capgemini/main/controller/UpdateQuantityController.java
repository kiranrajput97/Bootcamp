package com.capgemini.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entities.Admin;


@RestController
public class UpdateQuantityController {

	@GetMapping
	public String helloWorld()
	{
		return "Hello";
	}

}

