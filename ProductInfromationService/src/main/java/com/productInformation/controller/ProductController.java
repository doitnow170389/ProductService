package com.productInformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productInformation.dto.ProductResponse;
import com.productInformation.service.ProductServiceImplementation;
@RestController
public class ProductController {

	@Autowired
	ProductServiceImplementation pService;
	
	@GetMapping("/product")
	public List<ProductResponse> getProducts()
	{
	return pService.processProduct(pService);
	}
}
