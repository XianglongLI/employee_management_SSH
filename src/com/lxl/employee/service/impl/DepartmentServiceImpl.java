package com.lxl.employee.service.impl;

import java.util.List;

import com.lxl.employee.dao.DepartmentDao;
import com.lxl.employee.model.Department;
import com.lxl.employee.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public Integer add(Department department) {
		return departmentDao.save(department);
	}

	@Override
	public List<Department> list() {
		return departmentDao.list();
	}

	@Override
	public void edit(Department department) {
		departmentDao.update(department);
	}

	@Override
	public Department queryById(Integer id) {
		return departmentDao.queryById(id);
	}

	@Override
	public void deleteById(Integer id) {
		departmentDao.deleteById(id);
	}

}
