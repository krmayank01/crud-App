package com.personal.crudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.crudApp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
