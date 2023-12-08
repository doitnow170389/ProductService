package com.productpriceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productpriceservice.model.ProducPrice;
import com.productpriceservice.repository.ProductPriceRepository;
@Service
@Transactional
public class ProductPriceServiceImplementation implements ProductPriceService{

	@Autowired
	ProductPriceRepository pRepo;
	
	@Override
	public List<ProducPrice> processProductPrice() {
		return pRepo.findAll();
	}

	@Override
	public List<ProducPrice> processProductPriceid(int ID) {
		// TODO Auto-generated method stub
		return  pRepo.findByproductID(ID);
	}

	@Override
	public int processByID(int id) {
		// TODO Auto-generated method stub
		return pRepo.deleteByproductID(id);
	}

	@Override
	public ProducPrice processProductwithPrice(ProducPrice pPrice) {
		// TODO Auto-generated method stub
		return pRepo.save(pPrice);
	}
	
}
