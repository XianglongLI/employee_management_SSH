package com.lxl.employee.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.employee.model.Department;

public interface DepartmentDao {
	@Transactional
	public List<Department> list();
	
	@Transactional
	public Integer save(Department department);
	
	@Transactional
	public void update(Department department);

	@Transactional
	public Department queryById(Integer id);

	@Transactional
	public void deleteById(Integer id);
}
