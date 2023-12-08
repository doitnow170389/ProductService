package com.productInformation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	private int skucategoryid;
	
	private String skucategoryname;
	
	private String skucategorytype;
	
	
	@OneToMany(targetEntity=Product.class, cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="skucategoryid", referencedColumnName="skucategoryid")
	private List<Product> product= new ArrayList<>();
	
	public Category(CategoryRequest PR){
		this.skucategoryname=PR.getCategoryname();
		this.skucategorytype=PR.getCategorytype();
	}
}
