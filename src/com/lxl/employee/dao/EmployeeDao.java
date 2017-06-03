package com.lxl.employee.dao;

import java.util.List;

import com.lxl.employee.model.Employee;

public interface EmployeeDao {

	List<Employee> list();

	Integer save(Employee employee);

}
