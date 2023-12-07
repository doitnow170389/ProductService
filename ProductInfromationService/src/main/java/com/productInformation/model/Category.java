package com.productInformation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

import com.productInformation.dto.CategoryRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="category")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int SKUCategory_ID;
	
	String SKUCategory_Name;
	
	String SKUCategory_Type;
	
	
	@OneToMany(targetEntity=Product.class, cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="SKUCategory_ID", referencedColumnName="SKUCategory_ID")
	List<Product> pInformtation;
	
//	public ProductCategory(CategoryRequest PR){
//		this.SKUCategory_Name=PR.getCategoryname();
//		this.SKUCategory_Type=PR.getCategoryType();
//	}
}
