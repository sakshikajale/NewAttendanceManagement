package com.AttendanceManagement.Model;
import java.time.LocalDate;
import java.time.LocalTime;

public class EmployeeLoginInfo {
    private String email;
    private LocalTime Time;
    private LocalDate Date;

	public EmployeeLoginInfo(String email, DateTimeLocation dateTimeLocation) {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalTime getTime() {
		return Time;
	}

	public void setTime(LocalTime time) {
		Time = time;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public EmployeeLoginInfo(String email, LocalTime time, LocalDate date) {
		super();
		this.email = email;
		Time = time;
		Date = date;
	}

   
}
