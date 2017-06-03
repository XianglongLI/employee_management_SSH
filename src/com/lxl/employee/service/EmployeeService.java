package com.lxl.employee.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.employee.model.Employee;

public interface EmployeeService {
	/**
	 * query all employees
	 */
	@Transactional
	List<Employee> list();

	/**
	 * add an employee and return the inserted id
	 */
	@Transactional
	Integer add(Employee employee);

	/**
	 * query an employee by id
	 */
	@Transactional
	Employee queryById(Integer id);

	/**
	 * edit an employee
	 */
	@Transactional
	void edit(Employee employee);

	/**
	 * delete an employee by id
	 */
	@Transactional
	void deleteById(Integer id);

}
