package com.productInformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productInformation.model.Category;
import com.productInformation.repository.CategoryRepository;
@Service
public class CategoryServiceImplementation implements CategoryService{

	@Autowired
	CategoryRepository cRepo;
	
	@Override
	public List<Category> getCategory() {
		
		return cRepo.findAll();
	}

	@Override
	public Category saveSKUCategory(Category product) {
		// TODO Auto-generated method stub
		return cRepo.save(product);
	}

}
