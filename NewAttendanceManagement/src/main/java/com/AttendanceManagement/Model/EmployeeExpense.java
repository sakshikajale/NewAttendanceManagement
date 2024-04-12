package com.AttendanceManagement.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_expense")
public class EmployeeExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String designation;
    private LocalDate eventDate;
    private BigDecimal travellingExpense;

    // Constructors, getters, and setters
    public EmployeeExpense() {}

    public EmployeeExpense(String name, String designation, LocalDate eventDate, BigDecimal travellingExpense) {
        this.name = name;
        this.designation = designation;
        this.eventDate = eventDate;
        this.travellingExpense = travellingExpense;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public BigDecimal getTravellingExpense() {
        return travellingExpense;
    }

    public void setTravellingExpense(BigDecimal travellingExpense) {
        this.travellingExpense = travellingExpense;
    }
}
