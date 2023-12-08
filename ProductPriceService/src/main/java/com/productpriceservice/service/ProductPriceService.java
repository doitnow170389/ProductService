package com.productpriceservice.service;

import java.util.List;

import com.productpriceservice.model.ProductPrice;

public interface ProductPriceService {

	List<ProductPrice> processProductPrice();
	
	List<ProductPrice> processProductPriceid(int ID);
	
	int processByID(int id);

	ProductPrice processProductwithPrice(ProductPrice pPrice);
	
	ProductPrice processwithDynamicId(ProductPrice pPrice, Long id);
}
