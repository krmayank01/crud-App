package com.personal.crudApp.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.crudApp.entity.Employee;
import com.personal.crudApp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> saveEmployees(List<Employee> employees) {
		return repository.saveAll(employees);
	}

	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	public Employee getEmployeesById(int id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee removed !! " + id;
	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
		existingEmployee.setName(employee.getName());
		existingEmployee.setSalary(employee.getSalary());
		return repository.save(existingEmployee);
	}

}
