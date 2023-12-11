package com.productpriceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productpriceservice.model.ProductPrice;
import com.productpriceservice.repository.ProductPriceRepository;
@Service
@Transactional
public class ProductPriceServiceImplementation implements ProductPriceService{

	@Autowired
	ProductPriceRepository pRepo;
	
	@Override
	public List<ProductPrice> processProductPrice() {
		return pRepo.findAll();
	}

	@Override
	public List<ProductPrice> processProductPriceid(int ID) {
		// TODO Auto-generated method stub
		return  pRepo.findByproductID(ID);
	}

	@Override
	public int processByID(int id) {
		// TODO Auto-generated method stub
		return pRepo.deleteByproductID(id);
	}

	@Override
	public ProductPrice processProductwithPrice(ProductPrice pPrice) {
		// TODO Auto-generated method stub
		return pRepo.save(pPrice);
	}

	@Override
	public ProductPrice processwithDynamicId(ProductPrice pPrice, Long id) {
		pPrice.setId(id);
		return pRepo.save(pPrice);
	}
	
}
