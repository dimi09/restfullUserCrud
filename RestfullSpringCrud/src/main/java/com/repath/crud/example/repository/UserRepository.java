package com.repath.crud.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repath.crud.example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByCompany(String company);

	
}
