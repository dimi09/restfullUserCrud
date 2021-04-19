package com.repath.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repath.crud.example.entity.User;
import com.repath.crud.example.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	// 1 endpoint add user controller
	@PostMapping
	public User addUser(@RequestBody User user) { 
		return service.saveUser(user);
	 }
	

	// 2 endpoint get all users controller
	@GetMapping("/all")
	public List<User> findAllUsers(){
		return service.getUsers();
	}
	
	// 5 endpoint get all users by the requested company controller
	@GetMapping("/company/{company}")
	public List<User> findUserByCompany (@PathVariable String company) {
		return service.getUserByCompany(company);
	}
	
	// 4 - endpoint -- delete user controller
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	// 3 - endpoint -- update user
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
		
	}
	
	
	
	
	
}
