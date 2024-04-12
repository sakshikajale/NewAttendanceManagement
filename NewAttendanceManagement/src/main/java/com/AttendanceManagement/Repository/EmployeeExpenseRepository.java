package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AttendanceManagement.Model.EmployeeExpense;

@Repository
public interface EmployeeExpenseRepository extends JpaRepository<EmployeeExpense, Long> {
    // You can add custom query methods if needed
}
