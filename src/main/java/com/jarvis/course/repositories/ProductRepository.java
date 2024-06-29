package com.jarvis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
