package com.productInformation.dto;

import com.productInformation.model.Product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class ProductResponse {
	int pid;
	String skuname;
	String skuurl;
	int skuid;
	
	public ProductResponse(Product presponse) {
		this.pid=presponse.getPid();
		this.skuname=presponse.getSkuname();
		this.skuurl=presponse.getSkuurl();
		this.skuid=presponse.getProductCategory().getSkucategoryid();
	}
	}

