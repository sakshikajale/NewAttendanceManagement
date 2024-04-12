package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AttendanceManagement.Model.Emp;

public interface loginRepository extends JpaRepository<Emp, Long> {

	Emp findByEmail(String email);
}
