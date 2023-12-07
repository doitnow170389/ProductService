package com.productInformation.dto;

import java.util.List;

import com.productInformation.model.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {

//	String categoryname;
//	String categoryType;
//	 List<String> productinformation;
	Category pCategory;
	 
	
}
