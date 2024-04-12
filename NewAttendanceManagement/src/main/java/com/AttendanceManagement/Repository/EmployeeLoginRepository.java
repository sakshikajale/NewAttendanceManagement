package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AttendanceManagement.Model.EmployeeLogin;

public interface EmployeeLoginRepository extends JpaRepository<EmployeeLogin, Long> {
    // Custom queries or methods can be added here if needed
}