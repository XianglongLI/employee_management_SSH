package com.lxl.employee.service;

import java.util.List;

import com.lxl.employee.model.Department;

public interface DepartmentService {
	public Integer add(Department department);

	public List<Department> list();
	
	public void edit(Department department);

	public Department queryById(Integer id);

	public void deleteById(Integer id);
}
