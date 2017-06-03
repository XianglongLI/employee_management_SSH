package com.lxl.employee.dao;

import java.util.List;

import com.lxl.employee.model.Department;
import com.lxl.employee.model.Employee;

public interface DepartmentDao {
	public List<Department> list();
	
	public Integer save(Department department);
	
	public void update(Department department);

	public Department queryById(Integer id);

	public void deleteById(Integer id);

	public List<Employee> getEmployeesById(Integer id);
}
