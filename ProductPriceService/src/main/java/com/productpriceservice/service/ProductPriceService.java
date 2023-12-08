package com.productpriceservice.service;

import java.util.List;

import com.productpriceservice.model.ProducPrice;

public interface ProductPriceService {

	List<ProducPrice> processProductPrice();
	
	List<ProducPrice> processProductPriceid(int ID);
	
	int processByID(int id);

	ProducPrice processProductwithPrice(ProducPrice pPrice);
	
}
