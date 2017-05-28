package com.lxl.employee.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.employee.model.Department;

public interface DepartmentDao {
	@Transactional
	public List<Department> list();
	
	@Transactional
	public Integer save(Department department);
	
	public boolean update(Department department);
	
	public boolean delete(Department department);
}
