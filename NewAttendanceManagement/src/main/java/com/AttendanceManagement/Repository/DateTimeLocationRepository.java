package com.AttendanceManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AttendanceManagement.Model.DateTimeLocation;

public interface DateTimeLocationRepository extends JpaRepository<DateTimeLocation, Long> {
}
