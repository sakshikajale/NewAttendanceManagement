    package com.AttendanceManagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceManagement.Model.Employee;
import com.AttendanceManagement.Service.RegistrationService;

@RestController
@RequestMapping("/Registration")
public class RegistrationController {

		@Autowired
	  private RegistrationService registrationService;
	    
    // Endpoint for validating user details
	    
    @PostMapping("/validate")
    public String validateEmployee(@RequestBody Employee employee) {
        if (registrationService.validateEmployee(employee)) {
            return "User details are valid.";
        } else {
            return "Invalid user details.";
        }
    } 
    
    //Crud Operations
    
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = registrationService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping("/emp")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = registrationService.createEmployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee updatedEmployee = registrationService.updateEmployee(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        registrationService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

}




