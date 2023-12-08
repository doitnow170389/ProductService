package com.productInformation.service;

import java.util.List;

import com.productInformation.dto.CategoryRequest;
import com.productInformation.dto.CategoryResponse;
import com.productInformation.model.Category;

public interface CategoryService {

	List<CategoryResponse> processCategory();
	
	List<CategoryResponse> processCategoryid(int ID);
	
	int processByID(int id);

	Category processSKUCategory(CategoryRequest cRequest, ProductService pService, CategoryService cService);
	
}
