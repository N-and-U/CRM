package com.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.model.EmployeeManager;

@ManagedBean(name = "reg", eager = true)
public class AddDetails {
	   String username;
	   String password;
	   String email;
	   String phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	int l;
	public void getList() {
		try {
			EmployeeManager SM = new EmployeeManager();
			l = SM.writeData(username,password,email,phone);
			if(l==1)
				FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "regsuccess.xhtml");
		}
			catch (Exception e) {
             System.out.println(e.getMessage());
		}
	}
	}