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
	
	/**
	 * list all employees
	 */
	public String list() {
		List<Employee> employees = employeeService.list();
		ActionContext.getContext().put("employees", employees);
		return "list";
	}
	
	/**
	 * add an employee
	 */
	public String add() {
		employeeService.add(employee);
		employee.setDepartment(departmentService.queryById(employee.getDepartment().getId()));
		return SUCCESS;
	}
	
	/**
	 * query an employee by its id
	 */
	public String query() {
		Employee e = employeeService.queryById(employee.getId());
		ActionContext.getContext().getValueStack().setValue("name", e.getName()); 
		ActionContext.getContext().getValueStack().setValue("age", e.getAge());
		ActionContext.getContext().getValueStack().setValue("joinTime", e.getJoinTime());
		ActionContext.getContext().getValueStack().setValue("department", e.getDepartment());
		List<Department> departments = departmentService.list();
		ActionContext.getContext().put("departments", departments);
		return "query";
	}
	
	/**
	 * edit an employee
	 */
	public String edit() {
		employeeService.edit(employee);
		employee.setDepartment(departmentService.queryById(employee.getDepartment().getId()));
		return SUCCESS;
	}
	
	/**
	 * delete an employee
	 */
	public String delete() {
		employeeService.deleteById(employee.getId());
		return SUCCESS;
	}
	
	/**
	 * query all departments, of which an employee can be part
	 */
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
