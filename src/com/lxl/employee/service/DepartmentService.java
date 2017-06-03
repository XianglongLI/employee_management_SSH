package com.lxl.employee.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.employee.model.Department;
import com.lxl.employee.model.Employee;

public interface DepartmentService {
	/**
	 * query all departments
	 */
	@Transactional
	public List<Department> list();
	
	/**
	 * add a department and return the inserted id
	 */
	@Transactional
	public Integer add(Department department);
	
	/**
	 * query a department by id
	 */
	@Transactional
	public Department queryById(Integer id);

	/**
	 * edit a department
	 */
	@Transactional
	public void edit(Department department);

	/**
	 * delete a department by id
	 */
	@Transactional
	public void deleteById(Integer id);

	/**
	 * get the employees of a department by department id
	 */
	@Transactional
	public List<Employee> getEmployeesById(Integer id);
}
