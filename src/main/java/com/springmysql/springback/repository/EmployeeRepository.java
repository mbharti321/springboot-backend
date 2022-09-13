package com.springmysql.springback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmysql.springback.model.Employee;
// @Repository Annotation is a specialization of @Component annotation which is used to indicate that the class 
// provides the mechanism for storage, retrieval, update, delete and search operation on objects.
public interface EmployeeRepository extends JpaRepository<Employee, Long>{ //<modelclasse, id datatype>

}
