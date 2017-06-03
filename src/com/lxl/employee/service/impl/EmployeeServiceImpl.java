package com.lxl.employee.service.impl;

import java.util.List;

import com.lxl.employee.dao.EmployeeDao;
import com.lxl.employee.model.Employee;
import com.lxl.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> list() {
		return employeeDao.list();
	}

	@Override
	public Integer add(Employee employee) {
		return employeeDao.save(employee);
	}
}
