package com.learn.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Ecommerce.entity.Product;
@CrossOrigin

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByProductPriceLessThan(int price);
	List<Product> findByProductPriceGreaterThan(int price);
	List<Product> findByProductPriceLessThanEqual(int price);
	List<Product> findByProductPriceBetween(int startPrice,int endPrice);
 
}
