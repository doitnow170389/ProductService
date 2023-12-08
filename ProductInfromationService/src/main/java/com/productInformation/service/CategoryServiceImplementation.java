package com.productInformation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productInformation.dto.CategoryRequest;
import com.productInformation.dto.CategoryResponse;
import com.productInformation.dto.ProductRequest;
import com.productInformation.dto.ProductResponse;
import com.productInformation.model.Category;
import com.productInformation.model.Product;
import com.productInformation.repository.CategoryRepository;
@Service
@Transactional
public class CategoryServiceImplementation implements CategoryService{

	@Autowired
	CategoryRepository cRepo;
	
	@Override
	public List<CategoryResponse> processCategory() {
		
		List<Category> cList= cRepo.findAll();
		List<CategoryResponse> cResponseList=new ArrayList<>();
		cList.forEach(e->{
			CategoryResponse cResponse=new CategoryResponse();
			cResponse.setSkuid(e.getSkucategoryid());
			cResponse.setSkucategoryname(e.getSkucategoryname());
			cResponse.setSkucategoytype(e.getSkucategorytype());
			List<ProductResponse> Prod =new ArrayList<ProductResponse>();
			for(Product p: e.getProduct())
			{
				Prod.add(new ProductResponse(p));
			}
			cResponse.setProduct(Prod);
			cResponseList.add(cResponse);
		});
		
		return cResponseList;
	}

	@Override
	public List<CategoryResponse> processCategoryid(int ID) {
		List<Category> cList = cRepo.findByskucategoryid(ID);
		List<CategoryResponse> cResponseList = new ArrayList<>();
		cList.forEach(e -> {
			CategoryResponse cResponse = new CategoryResponse();
			cResponse.setSkuid(e.getSkucategoryid());
			cResponse.setSkucategoryname(e.getSkucategoryname());
			cResponse.setSkucategoytype(e.getSkucategorytype());
			List<ProductResponse> Prod = new ArrayList<ProductResponse>();
			for (Product p : e.getProduct()) {
				Prod.add(new ProductResponse(p));
			}
			cResponse.setProduct(Prod);
			cResponseList.add(cResponse);
		});
	return cResponseList;
	}

	@Override
	public int processByID(int id) {
		// TODO Auto-generated method stub
		return cRepo.deleteByskucategoryid(id);
	}

	@Override
	public Category processSKUCategory(CategoryRequest cRequest, ProductService pService, CategoryService cService) {
		Category pCategory = new Category(cRequest);
		List<Product> productList=new ArrayList<Product>();
		if(cRequest.getProductinformation()!=null)
		{
		for(ProductRequest s : cRequest.getProductinformation())
		{
			Product pInfo=new Product();
			pInfo.setSkuname(s.getSkuname());
			pInfo.setSkuurl(s.getSkuurl());
			pInfo.setProductCategory(pCategory);
			productList.add(pInfo);
		}
		pService.processSKUName(productList);
		}
		pCategory.setProduct(productList);
		
		return cRepo.save(pCategory);
	}
	
}
