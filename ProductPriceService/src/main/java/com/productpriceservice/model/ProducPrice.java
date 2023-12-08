package com.productpriceservice.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="product_price")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProducPrice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	private int skucategoryid;
	@NotNull
	private int productID;
	@NotNull
	private int skuPrice;
	
}
