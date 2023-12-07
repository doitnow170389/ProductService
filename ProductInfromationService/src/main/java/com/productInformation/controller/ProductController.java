package com.productInformation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productInformation.dto.CategoryRequest;
import com.productInformation.model.Category;
import com.productInformation.model.Product;
import com.productInformation.service.CategoryService;
import com.productInformation.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	CategoryService cService;
	@Autowired
	ProductService pService;
	
	@PostMapping("/SKUCategory")
	public ResponseEntity<String> saveCategory(@RequestBody CategoryRequest cRequest)
	{
//		ProductCategory pCategory=new ProductCategory(cRequest);
//		pCategory=cService.saveSKUCategory(pCategory);
//		for(String s : cRequest.getProductinformation())
//		{
//			ProductInformation pInfo=new ProductInformation();
//			pInfo.setSKU_Name(s);
////			pInfo.setSKU_URL(s);
//			pInfo.setProductCategory(pCategory);
//			pService.saveSKUName(pInfo);
//		}
		System.out.println("Value-   "+cRequest.getPCategory().getSKUCategory_Name());
		cService.saveSKUCategory(cRequest.getPCategory());
		return new ResponseEntity<String>("Record Saved Successfully", HttpStatus.CREATED);
		
	}
}
