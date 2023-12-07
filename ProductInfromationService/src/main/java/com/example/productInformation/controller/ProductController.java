package com.example.productInformation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/hello")
	String sayhello()
	{
		return "Hello Dear";
	}
}
