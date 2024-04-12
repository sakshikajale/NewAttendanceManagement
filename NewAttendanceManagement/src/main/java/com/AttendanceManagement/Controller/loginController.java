package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.AttendanceManagement.Model.Emp;
import com.AttendanceManagement.Model.Employee;
import com.AttendanceManagement.Service.loginService;

@RestController
@RequestMapping("/Attendance")
public class loginController {
//	
//
//    @Autowired
//    private loginService loginService;
//
//    @PostMapping("/register")
//    public ResponseEntity<Emp> registerEmployee(@RequestBody Emp emp) {
//    Emp registeredEmp = loginService.registerEmp(emp);
//   	return ResponseEntity.status(HttpStatus.CREATED).body(registeredEmp);
//    }
//    
//    @PostMapping("/emp/login")
//    public ResponseEntity<String> loginEmployee(@RequestBody Emp emp) {
//        boolean isAuthenticated = loginService.authenticateEmp(emp.getEmail(),emp.getPassword());
//        if (isAuthenticated) {
//            return ResponseEntity.ok("Employee logged in successfully!");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//        }
//    }
	
	//New Implementation
	    @Autowired
	    private loginService loginService;

	    @PostMapping("/Employee/login")
	    public ResponseEntity<String> loginEmployee(@RequestBody Employee employee) {
	        boolean isAuthenticated = loginService.authenticateEmployee(employee.getEmail(),employee.getPassword());
	        if (isAuthenticated) {
	            return ResponseEntity.ok("Employee logged in successfully!");
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
	        }
	    }

	    @PutMapping("/employee/logout")
	    public ResponseEntity<String> logoutEmployee(@RequestBody Employee employee) {
	        loginService.logoutEmployee(employee.getEmail());
	        return ResponseEntity.ok("Logout successful!");
	    }
}
