package com.jarvis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
