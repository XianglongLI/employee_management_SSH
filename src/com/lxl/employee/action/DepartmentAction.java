package com.lxl.employee.action;

import java.util.List;

import com.lxl.employee.model.Department;
import com.lxl.employee.model.Employee;
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
	
	public String list() {
		List<Department> departments = departmentService.list();
		ActionContext.getContext().put("departments", departments);
		return "list";
	}
	
	public String add() {
		departmentService.add(department);
		return SUCCESS;
	}
	
	public String edit() {
		departmentService.edit(department);
		return SUCCESS;
	}
	
	public String query() {
		Department d = departmentService.queryById(department.getId());
		ActionContext.getContext().getValueStack().set("name", d.getName());
		ActionContext.getContext().getValueStack().set("description", d.getDescription());
		return "query";
	}
	
	public String delete() {
		departmentService.deleteById(department.getId());
		return SUCCESS;
	}
	
	public String employeesForDepartment() {
		List<Employee> employees = departmentService.getEmployeesById(department.getId());
		ActionContext.getContext().put("employees", employees);
		Department d = departmentService.queryById(department.getId());
		ActionContext.getContext().getValueStack().set("name", d.getName());
		return "employees";
	}

	@Override
	public Department getModel() {
		this.department = new Department();
		return department;
	}
}
