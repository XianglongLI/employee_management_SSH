package com.lxl.employee.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.employee.model.Employee;

public interface EmployeeService {

	@Transactional
	List<Employee> list();

	@Transactional
	Integer add(Employee employee);

}