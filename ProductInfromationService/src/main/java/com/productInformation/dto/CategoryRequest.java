package com.productInformation.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {

	String categoryname;
	String categorytype;
	List<ProductRequest> productinformation;
	
//	Category pCategory;
	 
	
}
