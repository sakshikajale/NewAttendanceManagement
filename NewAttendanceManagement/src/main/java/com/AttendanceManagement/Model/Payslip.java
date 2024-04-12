package com.AttendanceManagement.Model;

import java.math.BigDecimal;

public class Payslip {
    private Long employeeId;
    private String employeeName;
    private BigDecimal basicSalary;
    private BigDecimal allowances;
    private BigDecimal deductions;
    private BigDecimal netSalary;
	
    public Payslip(Long employeeId, String employeeName, BigDecimal basicSalary, BigDecimal allowances,
			BigDecimal deductions, BigDecimal netSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.allowances = allowances;
		this.deductions = deductions;
		this.netSalary = netSalary;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BigDecimal getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(BigDecimal basicSalary) {
		this.basicSalary = basicSalary;
	}

	public BigDecimal getAllowances() {
		return allowances;
	}

	public void setAllowances(BigDecimal allowances) {
		this.allowances = allowances;
	}

	public BigDecimal getDeductions() {
		return deductions;
	}

	public void setDeductions(BigDecimal deductions) {
		this.deductions = deductions;
	}

	public BigDecimal getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(BigDecimal netSalary) {
		this.netSalary = netSalary;
	}

    
    
    
}
