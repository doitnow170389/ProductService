package com.productInformation.controller;

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

import com.productInformation.dto.CategoryRequest;
import com.productInformation.dto.CategoryResponse;
import com.productInformation.service.CategoryService;
import com.productInformation.service.ProductService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService cService;
	@Autowired
	ProductService pService;

	@PostMapping("/skucategory")
	public CategoryResponse saveCategory(@RequestBody CategoryRequest cRequest) {
		return new CategoryResponse(cService.processSKUCategory(cRequest, pService,cService));
	}

	@GetMapping("/sku")
	public ResponseEntity<List<CategoryResponse>> getEmployees() { 
		return new ResponseEntity<List<CategoryResponse>>(cService.processCategory(), HttpStatus.OK);
	}

	@GetMapping("/sku/{id}")
	public ResponseEntity<List<CategoryResponse>> getEmployeeByID(@PathVariable("id") int id) {
		return new ResponseEntity<List<CategoryResponse>>(cService.processCategoryid(id), HttpStatus.OK);
	}

	@DeleteMapping("/skudelete/{id}")
	public int deleteRecord(@PathVariable("id") int id) {
		return cService.processByID(id);

	}

}
