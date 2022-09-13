package com.springmysql.springback.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// for creating getter, setter, constructors, to string methods for this class
// and reduce boilerplate code,  use Data annotation from lombok
@Data //from Lombok library
// to make this class as a JPA entity
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	// to provide all attributes constraints
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;	
}
