package com.productpriceservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productpriceservice.model.ProductPrice;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
	
	List<ProductPrice> findByproductID(int id);
	
	int deleteByproductID(int id);
}
