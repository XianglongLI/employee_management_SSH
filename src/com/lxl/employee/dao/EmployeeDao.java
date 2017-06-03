package com.lxl.employee.dao;

import java.util.List;

import com.lxl.employee.model.Employee;

public interface EmployeeDao {
	/**
	 * select all employees
	 */
	List<Employee> list();

	/**
	 * insert an employee and return the inserted id
	 */
	Integer save(Employee employee);

	/**
	 * select an employee by id
	 */
	Employee queryById(Integer id);

	/**
	 * update an employee
	 */
	void update(Employee employee);

	/**
	 * delete an employee by id
	 */
	void deleteById(Integer id);

}
