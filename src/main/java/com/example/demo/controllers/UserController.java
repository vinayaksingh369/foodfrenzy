package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserServices;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserServices services;

	@GetMapping
	public List<User> getAllUsers() {
		return services.getAllUser();
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return services.getUser(id);
	}

	@PostMapping
	public void addUser(@RequestBody User user) {
		services.addUser(user);
	}

	@PutMapping("/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user) {
		services.updateUser(user, id);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		services.deleteUser(id);
	}
}
