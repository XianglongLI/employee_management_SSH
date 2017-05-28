package com.lxl.employee.service;

import java.util.List;

import com.lxl.employee.model.Department;

public interface DepartmentService {
	public Integer add(Department department);

	public List<Department> list();
}
