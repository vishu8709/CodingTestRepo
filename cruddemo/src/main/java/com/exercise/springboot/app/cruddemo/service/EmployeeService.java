package com.exercise.springboot.app.cruddemo.service;

import java.util.List;

import com.exercise.springboot.app.cruddemo.dao.NamesOnly;
import com.exercise.springboot.app.cruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy);
	
	public List<NamesOnly> findAllNames();
	
	
}
