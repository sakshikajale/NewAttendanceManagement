package com.AttendanceManagement.dto;

import java.time.LocalDate;
import java.util.Date;

public class LeaveRequestDTO {

    private Long employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LeaveRequestDTO(Long employeeId, LocalDate startDate, LocalDate endDate, String reason) {
		super();
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reason = reason;
	}

    
    
}    