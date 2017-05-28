package com.lxl.employee.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.lxl.employee.dao.DepartmentDao;
import com.lxl.employee.model.Department;

public class DepartmentDaoImpl implements DepartmentDao {
	private SessionFactory sessionFactory;
	
	@Override
	public List<Department> list() {
		List<Department> departments = sessionFactory.getCurrentSession().createQuery("select d from Department d").list();
		return departments;
	}

	@Override
	public Integer save(Department department) {
		sessionFactory.getCurrentSession().save(department);
		return department.getId();
	}

	@Override
	public boolean update(Department department) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Department department) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
