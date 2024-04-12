package com.AttendanceManagement.Service;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.Attendance;
import com.AttendanceManagement.Model.Employee;
import com.AttendanceManagement.Repository.AttendanceRepository;
import com.AttendanceManagement.Repository.RegistrationRepository;



@Service
public class loginService {

//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//    @Autowired
//    private loginRepository loginRepository;
////
//    //register
//    public Emp registerEmp(Emp emp) {
//     return loginRepository.save(emp);
//    }
//    
//    //login
//
//    public boolean authenticateEmp(String email, String password) {
//        Emp emp = loginRepository.findByEmail(email);
//        return emp != null && emp.getPassword().equals(password);
//    }

	//New Implementation
    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    public boolean authenticateEmployee(String email, String password){
        // Retrieve email and password from registration table based on credentials
        Employee employee = registrationRepository.findByEmailAndPassword(email, password);
        if (employee != null) {
            // Generate current login time
            LocalDateTime currentLoginDateTime = LocalDateTime.now();

            // Save login details in the attendance table
            Attendance attendance = new Attendance();
            attendance.setEmail(email);
            attendance.setLoginTime(currentLoginDateTime);
            attendanceRepository.save(attendance);
            
            // Authentication successful
            return true;
        }
        // Authentication failed
        return false;
    }

    public void logoutEmployee(String email) {
        // Retrieve the last login entry for the user
        Attendance lastLogin = attendanceRepository.findTopByEmailOrderByLoginTimeDesc(email);
        if (lastLogin != null && lastLogin.getLogoutTime() == null) {
            // Generate current logout time
            LocalDateTime currentLogoutDateTime = LocalDateTime.now();

            // Update the last login entry with the logout time
            lastLogin.setLogoutTime(currentLogoutDateTime);
            attendanceRepository.save(lastLogin);
        }
    }
}
