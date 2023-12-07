package com.productInformation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Product")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	
	String SKUName;
	
	String SKUURL;
//	
//	@ManyToOne
//	@JoinColumn(name="skucategory_ID")
//	ProductCategory ProductCategory;
}
