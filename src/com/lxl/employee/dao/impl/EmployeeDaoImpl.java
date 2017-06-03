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
		List<Employee> employees = sessionFactory.getCurrentSession().createQuery("select e from Employee e").list();
		return employees;
	}

	@Override
	public Integer save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return employee.getId();
	}

	@Override
	public Employee queryById(Integer id) {
		return sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public void update(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
	}

	@Override
	public void deleteById(Integer id) {
		sessionFactory.getCurrentSession()
		.createQuery("delete from Employee e where e.id = ?")
		.setParameter(0, id).executeUpdate();
	}

}
