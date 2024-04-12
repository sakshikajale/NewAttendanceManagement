package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AttendanceManagement.Model.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

	Attendance findTopByEmailOrderByLoginTimeDesc(String email);
}
