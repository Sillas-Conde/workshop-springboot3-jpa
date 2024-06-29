package com.jarvis.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Sillas", "sillasconde@outlook.com", "97779", "1234567");
		return ResponseEntity.ok().body(u);
	}
	
}
