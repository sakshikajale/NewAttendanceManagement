//package com.AttendanceManagement.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.AttendanceManagement.Model.EmployeeLogin;
//import com.AttendanceManagement.Service.EmployeeLoginService;
//
//@RestController
//@RequestMapping("/attendance")
//public class EmployeeLoginController {
//    
//    @Autowired
//    private EmployeeLoginService employeeLoginService;
//    
//    @PostMapping("/api/login")
//    public void login(@RequestBody Long employeeId) {
//        EmployeeLogin employeeLogin = new EmployeeLogin();
//        employeeLogin.setEmployeeId(employeeId);
//        employeeLogin.setLoginTime(employeeLoginService.getCurrentDateTime());
//        employeeLoginService.logEmployeeLogin(employeeLogin);
//    }
//}