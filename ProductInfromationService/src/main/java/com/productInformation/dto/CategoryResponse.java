package com.productInformation.dto;

import java.util.ArrayList;
import java.util.List;

import com.productInformation.model.Category;
import com.productInformation.model.Product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryResponse {
int skuid;
String skucategoryname;
String skucategoytype;
private List<ProductResponse> product;
//private List<String> productB;
public CategoryResponse(Category cResponse){
	this.skuid=cResponse.getSkucategoryid();
	this.skucategoryname=cResponse.getSkucategoryname();
	this.skucategoytype=cResponse.getSkucategorytype();
	
	if(cResponse.getProduct()!=null)
	{
		product=new ArrayList<ProductResponse>();
		for(Product pObject : cResponse.getProduct())
		{
			product.add(new ProductResponse(pObject));
		}
			
	}
	
	
}

}
