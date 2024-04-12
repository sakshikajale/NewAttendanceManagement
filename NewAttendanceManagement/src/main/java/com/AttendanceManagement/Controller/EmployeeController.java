package com.AttendanceManagement.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceManagement.Model.EmployeeLoginInfo;
import com.AttendanceManagement.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public EmployeeLoginInfo loginEmployee(@RequestBody String email) {
        return employeeService.loginEmployee(email);
    }
}
