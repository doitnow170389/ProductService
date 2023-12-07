package com.productInformation.service;

import java.util.List;

import com.productInformation.model.Category;

public interface CategoryService {

	List<Category> getCategory();
	
	Category saveSKUCategory(Category product);
	
}
