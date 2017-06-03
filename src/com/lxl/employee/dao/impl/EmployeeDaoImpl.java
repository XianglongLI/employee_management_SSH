package com.lxl.employee.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.lxl.employee.dao.EmployeeDao;
import com.lxl.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Employee> list() {
		@SuppressWarnings("unchecked")
		List<Employee> employees = sessionFactory.getCurrentSession()
				   				   .createQuery("select e from Employee e").list();
		return employees;
	}

	@Override
	public Integer save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return employee.getId();
	}

}
