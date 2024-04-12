package com.AttendanceManagement.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.DateTimeLocation;
import com.AttendanceManagement.Model.Employee;
import com.AttendanceManagement.Model.EmployeeLoginInfo;
import com.AttendanceManagement.Repository.EmployeeRepository;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeLoginInfo loginEmployee(String email) {
        Employee employee = repository.findByEmail(email);
        if (employee != null) {
        	 DateTimeLocation dateTimeLocation = new DateTimeLocation();
             dateTimeLocation.setTime(LocalTime.now());
             dateTimeLocation.setDate(LocalDate.now());
            repository.save(employee);
            return new EmployeeLoginInfo(email,dateTimeLocation);
        }
        return null;
    }
}
