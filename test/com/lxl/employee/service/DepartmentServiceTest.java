package com.lxl.employee.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.lxl.employee.model.Department;
import com.lxl.employee.service.DepartmentService;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class DepartmentServiceTest {
	@Resource(name = "departmentService")
	private DepartmentService departmentService;
	
	@Test
	public void add() {
		Department d = new Department();
		d.setName("a");
		d.setDescription("a");
		Integer i = departmentService.add(d);
		System.out.println(i);
	}
	
}
