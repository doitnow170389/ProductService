package com.productpriceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productpriceservice.exception.ProductPriceExceptionHandler;
import com.productpriceservice.exception.ProductPriceNotFoundException;
import com.productpriceservice.model.ProductPrice;
import com.productpriceservice.service.ProductPriceService;

import net.bytebuddy.implementation.bytecode.Throw;

@RestController
public class ProductPriceController {

	@Autowired
	ProductPriceService cService;

	@PostMapping("/skuprice")
	public ResponseEntity<ProductPrice> processproductwithprice(@RequestBody ProductPrice pRequest) {
		return new ResponseEntity<ProductPrice>(cService.processProductwithPrice(pRequest), HttpStatus.CREATED);
	}

	@GetMapping("/skuprice")
	public ResponseEntity<List<ProductPrice>> processproductprice() { 
		return new ResponseEntity<List<ProductPrice>>(cService.processProductPrice(), HttpStatus.OK);
	}

	@GetMapping("/skuprice/{id}")
	public ResponseEntity<List<ProductPrice>> processpricebyid(@PathVariable("id") int id) {
		if(cService.processProductPriceid(id).isEmpty())
		throw new ProductPriceNotFoundException("No Record foudn with the this ID", new Throwable().getCause());
		return new ResponseEntity<List<ProductPrice>>(cService.processProductPriceid(id), HttpStatus.OK);
	}

	@DeleteMapping("/skuprice/{id}")
	public int processbyid(@PathVariable("id") int id) {
		return cService.processByID(id);
	}


	@RequestMapping(method=RequestMethod.PUT, value="/skuprice/{id}")
	public  ResponseEntity<ProductPrice> updateEmployees(@RequestBody ProductPrice pPrice, @PathVariable Long id)
	{
	return new ResponseEntity<ProductPrice>(cService.processwithDynamicId(pPrice,id), HttpStatus.OK);
	}
	
}
