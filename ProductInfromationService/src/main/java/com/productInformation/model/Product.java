package com.productInformation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.productInformation.dto.ProductRequest;

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
	private int pid;
	
	private String skuname;
	
	private String skuurl;
//	
	@ManyToOne
	@JoinColumn(name="skucategoryid")
	Category ProductCategory;
	
//	public Product(ProductRequest prequest) {
//		this.skuname=prequest.getSkuname();
//		this.skuurl=prequest.getSkuurl();
//	}
}
