package com.productInformation.service;

import java.util.List;

import com.productInformation.dto.ProductResponse;
import com.productInformation.model.Product;

public interface ProductService {


	public List<ProductResponse> processProduct(ProductServiceImplementation pService);
	
	List<Product> processSKUName(List<Product> productName);
	

}
