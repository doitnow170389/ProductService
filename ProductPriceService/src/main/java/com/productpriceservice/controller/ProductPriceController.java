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
import org.springframework.web.bind.annotation.RestController;

import com.productpriceservice.model.ProducPrice;
import com.productpriceservice.service.ProductPriceService;

@RestController
public class ProductPriceController {

	@Autowired
	ProductPriceService cService;

	@PostMapping("/skuprice")
	public ResponseEntity<ProducPrice> processproductwithprice(@RequestBody ProducPrice pRequest) {
		return new ResponseEntity<ProducPrice>(cService.processProductwithPrice(pRequest), HttpStatus.CREATED);
	}

	@GetMapping("/skuprice")
	public ResponseEntity<List<ProducPrice>> processproductprice() { 
		return new ResponseEntity<List<ProducPrice>>(cService.processProductPrice(), HttpStatus.OK);
	}

	@GetMapping("/skuprice/{id}")
	public ResponseEntity<List<ProducPrice>> processpricebyid(@PathVariable("id") int id) {
		return new ResponseEntity<List<ProducPrice>>(cService.processProductPriceid(id), HttpStatus.OK);
	}

	@DeleteMapping("/skuprice/{id}")
	public int processbyid(@PathVariable("id") int id) {
		return cService.processByID(id);

	}

}
