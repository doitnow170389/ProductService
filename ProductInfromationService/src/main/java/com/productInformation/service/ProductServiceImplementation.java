package com.productInformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productInformation.model.Product;
import com.productInformation.repository.ProductRepository;
@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository pRepo;

	@Override
	public List<Product> getCategory() {
		return pRepo.findAll();
	}

	@Override
	public Product saveSKUName(Product productName) {
		return pRepo.save(productName);
	}
	
	

}