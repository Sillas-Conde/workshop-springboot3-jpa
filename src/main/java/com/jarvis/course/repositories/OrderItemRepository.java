package com.jarvis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.course.entities.OrderItem;
import com.jarvis.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	
	
}
