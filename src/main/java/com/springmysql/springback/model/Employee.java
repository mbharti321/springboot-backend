package com.springmysql.springback.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// for creating getter, setter, constructors, to string methods for this class
// and reduce boilerplate code,  use Data annotation from lombok
@Data //from Lombok library
// to make this class as a JPA entity
@Entity
@Table(name = "Employees")
public class Employee {
	@Id
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;	
}
