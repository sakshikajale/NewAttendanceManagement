package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AttendanceManagement.Model.DateTimeLocation;
import com.AttendanceManagement.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmail(String email);

}
