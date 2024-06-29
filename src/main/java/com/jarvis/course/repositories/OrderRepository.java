package com.jarvis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	
}
