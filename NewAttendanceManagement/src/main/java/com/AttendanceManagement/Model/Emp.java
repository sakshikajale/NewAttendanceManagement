package com.AttendanceManagement.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private String position;
    private String email;
    private String password;
    private LocalDateTime loginTime;
    //Default Constructor
	public Emp() {


	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}
	public Emp(Long id, String name, String department, String position, String email, String password,
			LocalDateTime loginTime) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.email = email;
		this.password = password;
		this.loginTime = loginTime;
	}
	
    
}