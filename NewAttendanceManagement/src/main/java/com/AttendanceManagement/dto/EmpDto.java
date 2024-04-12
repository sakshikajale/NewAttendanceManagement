package com.AttendanceManagement.dto;

public class EmpDto {
	
    private String name;
    private String department;
    private String position;
    private String email;
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
	public EmpDto(String name, String department, String position, String email) {
		super();
		this.name = name;
		this.department = department;
		this.position = position;
		this.email = email;
	}

    // Constructors, getters, and setters
    
    
}
