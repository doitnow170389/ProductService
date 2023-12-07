package com.productInformation.service;

import java.util.List;

import com.productInformation.model.Product;

public interface ProductService {


	List<Product> getCategory();
	
	Product saveSKUName(Product productName);
	

}
