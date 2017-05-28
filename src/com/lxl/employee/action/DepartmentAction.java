package com.lxl.employee.action;

import java.util.List;

import com.lxl.employee.model.Department;
import com.lxl.employee.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
	private DepartmentService departmentService;
	private Department department;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public String add() {
		departmentService.add(department);
		return SUCCESS;
	}
	
	public String list() {
		List<Department> departments = departmentService.list();
		ActionContext.getContext().put("departments", departments);
		return "list";
	}

	@Override
	public Department getModel() {
		this.department = new Department();
		return department;
	}
}
