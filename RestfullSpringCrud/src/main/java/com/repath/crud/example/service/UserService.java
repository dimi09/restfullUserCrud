package com.repath.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repath.crud.example.entity.User;
import com.repath.crud.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	// 1 - endpoint -- add a user
	public User saveUser(User user) {
		return repository.save(user);
	}

	// 2 - endpoint -- get all users
	public List<User> getUsers() {
		return repository.findAll();
	}

	// 5 - endpoint -- get all users by the requested company
	public List<User> getUserByCompany(String company) {
		return repository.findByCompany(company);
	}

	// 4 - endpoint -- delete user
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "user was deleted " + id;
	}

	// 3 - endpoint -- update user
	public User updateUser(User user) {
		User existingUser = repository.findById(user.getId()).orElseThrow(() -> new RuntimeException("User not found"));

		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		existingUser.setCompany(user.getCompany());
		return repository.save(existingUser);
	}

}
