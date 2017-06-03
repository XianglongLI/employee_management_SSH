package com.lxl.employee.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.lxl.employee.dao.DepartmentDao;
import com.lxl.employee.model.Department;
import com.lxl.employee.model.Employee;

public class DepartmentDaoImpl implements DepartmentDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Department> list() {
		@SuppressWarnings("unchecked")
		List<Department> departments = sessionFactory.getCurrentSession().createQuery("select d from Department d").list();
		return departments;
	}

	@Override
	public Integer save(Department department) {
		sessionFactory.getCurrentSession().save(department);
		return department.getId();
	}

	@Override
	public void update(Department department) {
		sessionFactory.getCurrentSession().update(department);
	}

	@Override
	public void deleteById(Integer id) {
		sessionFactory.getCurrentSession()
		.createQuery("delete from Department d where d.id = ?")
		.setParameter(0, id).executeUpdate();
	}
	
	@Override
	public Department queryById(Integer id) {
		return sessionFactory.getCurrentSession().get(Department.class, id);
	}

	@Override
	public List<Employee> getEmployeesById(Integer id) {
		Department department = (Department) sessionFactory.getCurrentSession()
		.createQuery("select d from Department d left join fetch d.employees where d.id=?")
		.setParameter(0, id).uniqueResult();
		List<Employee> employees = department.getEmployees();
		return employees;
	}
	
}
