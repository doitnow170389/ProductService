package com.productpriceservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productpriceservice.model.ProducPrice;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProducPrice, Long> {
	
	List<ProducPrice> findByproductID(int id);
	
	int deleteByproductID(int id);
}
