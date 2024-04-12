package com.AttendanceManagement.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity	
@Table(name = "Registration")
public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "Name is required")
	    @Pattern(regexp = "^[a-zA-Z]+(\\s+[a-zA-Z]+)*$", message = "Name should be a full name")
	    private String name;

	    @NotBlank(message = "Phone number is required")
	    @Size(min = 10, max = 10, message = "Phone number must be 10 digits")
	    @Pattern(regexp = "\\d+", message = "Phone number must contain only digits")
	    private String phoneNumber;

	    @NotBlank(message = "Email is required")
	    @Email(message = "Invalid email format")
	    private String email;

	    @NotBlank(message = "Password is required")
	    @Size(min = 8, message = "Password must be at least 8 characters long")
	    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).*$", message = "Password must contain at least one digit, one special character, and one alphabet")
	    private String password;

	    private String bloodGroup;
	    private String marriageStatus;
	    private String designation;
	    private String department;
	    private String currentAddress;
	    private String permanentAddress;
	    private LocalDate dob;
	    private LocalDate doj;
	    

		//Getter Setter
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

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
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

		public String getBloodGroup() {
			return bloodGroup;
		}

		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}

		public String getMarriageStatus() {
			return marriageStatus;
		}

		public void setMarriageStatus(String marriageStatus) {
			this.marriageStatus = marriageStatus;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getCurrentAddress() {
			return currentAddress;
		}

		public void setCurrentAddress(String currentAddress) {
			this.currentAddress = currentAddress;
		}

		public String getPermanentAddress() {
			return permanentAddress;
		}

		public void setPermanentAddress(String permanentAddress) {
			this.permanentAddress = permanentAddress;
		}

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		public LocalDate getDoj() {
			return doj;
		}

		public void setDoj(LocalDate doj) {
			this.doj = doj;
		}

		  public Employee() {
		        // Initialize any default values if needed
		    }

		public Employee(Long id,
				@NotBlank(message = "Name is required") @Pattern(regexp = "^[a-zA-Z]+(\\s+[a-zA-Z]+)*$", message = "Name should be a full name") String name,
				@NotBlank(message = "Phone number is required") @Size(min = 10, max = 10, message = "Phone number must be 10 digits") @Pattern(regexp = "\\d+", message = "Phone number must contain only digits") String phoneNumber,
				@NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email,
				@NotBlank(message = "Password is required") @Size(min = 8, message = "Password must be at least 8 characters long") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).*$", message = "Password must contain at least one digit, one special character, and one alphabet") String password,
				String bloodGroup, String marriageStatus, String designation, String department, String currentAddress,
				String permanentAddress, LocalDate dob, LocalDate doj) {
			super();
			this.id = id;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.password = password;
			this.bloodGroup = bloodGroup;
			this.marriageStatus = marriageStatus;
			this.designation = designation;
			this.department = department;
			this.currentAddress = currentAddress;
			this.permanentAddress = permanentAddress;
			this.dob = dob;
			this.doj = doj;
		}

	    
	}



