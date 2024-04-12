package com.AttendanceManagement.Model;



public class LeaveResponse {
    private Long Id;
    private String status; // Approved, Rejected
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    // Getters and setters
    
    
}
