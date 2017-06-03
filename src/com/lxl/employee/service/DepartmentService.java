package com.lxl.employee.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.employee.model.Department;

public interface DepartmentService {
	@Transactional
	public Integer add(Department department);

	@Transactional
	public List<Department> list();
	
	@Transactional
	public void edit(Department department);

	@Transactional
	public Department queryById(Integer id);

	@Transactional
	public void deleteById(Integer id);
}
