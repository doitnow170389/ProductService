package com.productInformation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productInformation.dto.ProductResponse;
import com.productInformation.model.Product;
import com.productInformation.repository.ProductRepository;
@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository pRepo;


	@Override
	public List<Product> processSKUName(List<Product> productName) {
		return pRepo.saveAll(productName);
	}

	public List<ProductResponse> processProduct(ProductServiceImplementation pService) {

		List<Product> pList=pRepo.findAll();
		List<ProductResponse> plistResponse=new ArrayList<>();
		pList.forEach(p->{
		ProductResponse pResponse=new ProductResponse();
		pResponse.setPid(p.getPid());
		pResponse.setSkuname(p.getSkuname());
		pResponse.setSkuurl(p.getSkuurl());
		pResponse.setSkuid(p.getProductCategory().getSkucategoryid());
		plistResponse.add(pResponse);
		});
		return plistResponse;
	}
	
	

}