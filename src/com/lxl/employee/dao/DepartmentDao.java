package com.lxl.employee.dao;

import java.util.List;

import com.lxl.employee.model.Department;
import com.lxl.employee.model.Employee;

public interface DepartmentDao {
	/**
	 * select all departments
	 */
	public List<Department> list();
	
	/**
	 * insert a department and return the inserted id
	 */
	public Integer save(Department department);

	/**
	 * select a department by id
	 */
	public Department queryById(Integer id);
	
	/**
	 * update a department
	 */
	public void update(Department department);

	/**
	 * delete a department by id
	 */
	public void deleteById(Integer id);

	/**
	 * get the employees of a department by department id
	 */
	public List<Employee> getEmployeesById(Integer id);
}
