package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AttendanceManagement.Model.EmployeeExpense;
import com.AttendanceManagement.Repository.EmployeeExpenseRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee-expenses")
public class EmployeeExpenseController {

    private final EmployeeExpenseRepository employeeExpenseRepository;

    @Autowired
    public EmployeeExpenseController(EmployeeExpenseRepository employeeExpenseRepository) {
        this.employeeExpenseRepository = employeeExpenseRepository;
    }

    // Get all employee expenses
    @GetMapping
    public ResponseEntity<List<EmployeeExpense>> getAllEmployeeExpenses() {
        List<EmployeeExpense> employeeExpenses = employeeExpenseRepository.findAll();
        return ResponseEntity.ok(employeeExpenses);
    }

    // Get employee expense by ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeExpense> getEmployeeExpenseById(@PathVariable Long id) {
        Optional<EmployeeExpense> expenseOptional = employeeExpenseRepository.findById(id);
        return expenseOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new employee expense
    @PostMapping
    public ResponseEntity<EmployeeExpense> createEmployeeExpense(@RequestBody EmployeeExpense employeeExpense) {
        EmployeeExpense savedExpense = employeeExpenseRepository.save(employeeExpense);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedExpense);
    }

    // Update an existing employee expense
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeExpense> updateEmployeeExpense(@PathVariable Long id, @RequestBody EmployeeExpense updatedExpense) {
        if (!employeeExpenseRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedExpense.setId(id);
        EmployeeExpense savedExpense = employeeExpenseRepository.save(updatedExpense);
        return ResponseEntity.ok(savedExpense);
    }

    // Delete an employee expense by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeeExpense(@PathVariable Long id) {
        if (!employeeExpenseRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        employeeExpenseRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
