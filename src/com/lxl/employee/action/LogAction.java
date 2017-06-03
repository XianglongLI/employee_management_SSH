package com.lxl.employee.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogAction extends ActionSupport implements ServletRequestAware {
	private HttpSession session;
	private String username;
	private String password;
	
	public String login() {
		if(username.equals("admin") && password.equals("admin")) {
			session.setAttribute("username", username);
			return SUCCESS;
		} else {
			this.addFieldError("loginError", "username or password not valid, please retype");
			return ERROR;
		}
	}
	
	public String logout() {
		session.removeAttribute("username");
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.session = request.getSession();
	}

}
