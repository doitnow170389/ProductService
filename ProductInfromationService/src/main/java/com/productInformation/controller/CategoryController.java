package com.productInformation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productInformation.dto.CategoryRequest;
import com.productInformation.dto.CategoryResponse;
import com.productInformation.dto.ProductRequest;
import com.productInformation.dto.ProductResponse;
import com.productInformation.model.Category;
import com.productInformation.model.Product;
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
		Category pCategory = new Category(cRequest);
		pCategory = cService.processSKUCategory(pCategory, cRequest, pService);
		return new CategoryResponse(pCategory);
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
