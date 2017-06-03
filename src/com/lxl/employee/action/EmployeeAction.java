package com.lxl.employee.action;

import java.util.List;

import com.lxl.employee.model.Department;
import com.lxl.employee.model.Employee;
import com.lxl.employee.service.DepartmentService;
import com.lxl.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	private EmployeeService employeeService;
	private DepartmentService departmentService;
	private Employee employee;
	
	public String list() {
		List<Employee> employees = employeeService.list();
		ActionContext.getContext().put("employees", employees);
		return "list";
	}
	
	public String add() {
		employeeService.add(employee);
		employee.setDepartment(departmentService.queryById(employee.getDepartment().getId()));
		return SUCCESS;
	}
	
	public String departmentListForEmployee() {
		List<Department> departments = departmentService.list();
		ActionContext.getContext().put("departments", departments);
		return "departmentList";
	}
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@Override
	public Employee getModel() {
		this.employee = new Employee();
		return employee;
	}

}
