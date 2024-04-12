package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceManagement.Model.DateTimeLocation;
import com.AttendanceManagement.Service.DateTimeLocationService;

@RestController
@RequestMapping("/api")
public class DateTimeLocationController {
    @Autowired
    private DateTimeLocationService service;

    @GetMapping("/datetime")
    public DateTimeLocation getCurrentDateTimeLocation() {
        // For simplicity, let's assume the location is fixed
        String location = "";
        return service.saveDateTimeLocation(location);
    }
}
