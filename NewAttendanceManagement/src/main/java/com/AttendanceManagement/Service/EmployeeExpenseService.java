package com.AttendanceManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.EmployeeExpense;
import com.AttendanceManagement.Repository.EmployeeExpenseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeExpenseService {

    private final EmployeeExpenseRepository employeeExpenseRepository;

    @Autowired
    public EmployeeExpenseService(EmployeeExpenseRepository employeeExpenseRepository) {
        this.employeeExpenseRepository = employeeExpenseRepository;
    }

    // Retrieve all employee expenses
    public List<EmployeeExpense> getAllEmployeeExpenses() {
        return employeeExpenseRepository.findAll();
    }

    // Retrieve an employee expense by ID
    public Optional<EmployeeExpense> getEmployeeExpenseById(Long id) {
        return employeeExpenseRepository.findById(id);
    }

    // Create a new employee expense
    public EmployeeExpense createEmployeeExpense(EmployeeExpense employeeExpense) {
        return employeeExpenseRepository.save(employeeExpense);
    }

    // Update an existing employee expense
    public Optional<EmployeeExpense> updateEmployeeExpense(Long id, EmployeeExpense updatedExpense) {
        if (!employeeExpenseRepository.existsById(id)) {
            return Optional.empty();
        }
        updatedExpense.setId(id);
        EmployeeExpense savedExpense = employeeExpenseRepository.save(updatedExpense);
        return Optional.of(savedExpense);
    }

    // Delete an employee expense by ID
    public boolean deleteEmployeeExpense(Long id) {
        if (!employeeExpenseRepository.existsById(id)) {
            return false;
        }
        employeeExpenseRepository.deleteById(id);
        return true;
    }
}
