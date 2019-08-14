package com.exercise.springboot.app.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exercise.springboot.app.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT new com.exercise.springboot.app.cruddemo.dao.NamesOnly(e.firstName, e.lastName) from Employee e")
    List<NamesOnly> findAllNames();
	
}
