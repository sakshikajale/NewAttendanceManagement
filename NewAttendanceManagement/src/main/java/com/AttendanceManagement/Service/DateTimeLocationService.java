package com.AttendanceManagement.Service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.DateTimeLocation;
import com.AttendanceManagement.Repository.DateTimeLocationRepository;

@Service
public class DateTimeLocationService {
    @Autowired
    private DateTimeLocationRepository repository;

    public DateTimeLocation saveDateTimeLocation(String location) {
        DateTimeLocation dateTimeLocation = new DateTimeLocation();
        dateTimeLocation.setTime(LocalTime.now());
        dateTimeLocation.setDate(LocalDate.now());
        dateTimeLocation.setLocation(location);
        return repository.save(dateTimeLocation);
    }
}
