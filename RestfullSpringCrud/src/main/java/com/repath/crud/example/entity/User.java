package com.repath.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class User {

//	Ο πίνακας χρηστών θα έχει τα πεδία id, name, email, company.

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String email;

	private String company;

	public User() {

	}

	public User(int id, String name, String email, String company) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public User(String name, String email, String company) {

		this.name = name;
		this.email = email;
		this.company = company;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
