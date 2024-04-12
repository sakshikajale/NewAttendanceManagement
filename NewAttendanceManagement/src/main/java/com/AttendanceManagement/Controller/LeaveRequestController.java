package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AttendanceManagement.Model.LeaveRequest;
import com.AttendanceManagement.Repository.LeaveRequestRepository;
import com.AttendanceManagement.Service.LeaveRequestService;
import com.AttendanceManagement.dto.LeaveRequestDTO;
import com.AttendanceManagement.dto.LeaveResponseDTO;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/leave-requests")
public class LeaveRequestController {

	    @Autowired
	    private LeaveRequestService leaveRequestService;
	    
	    @PostMapping("/create")
	    public LeaveResponseDTO createLeaveRequest(@RequestBody LeaveRequestDTO leaveRequestDTO) {
	        return leaveRequestService.createLeaveRequest(leaveRequestDTO);
	    }

	    @GetMapping
	    public List<LeaveRequest> getAllLeaveRequests() {
	        return leaveRequestService.getAllLeaveRequests();
	    }

	    @PutMapping("/{id}/approve")
	    public LeaveRequest approveLeaveRequest(@PathVariable Long id) {
	        return leaveRequestService.approveLeaveRequest(id);
	    }

	    @PutMapping("/{id}/reject")
	    public LeaveRequest rejectLeaveRequest(@PathVariable Long id) {
	        return leaveRequestService.rejectLeaveRequest(id);
	    }

	    @PostMapping
	    public LeaveRequest createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
	        return leaveRequestService.createLeaveRequest(leaveRequest);
	    }
	    
//	    @GetMapping("/pending")
//	    public List<LeaveRequest> getPendingLeaveRequests() {
//	        return LeaveRequestRepository.findAll().stream()
//	                .filter(leaveRequest -> leaveRequest.getStatus().equals("Pending"))
//	                .collect(Collectors.toList());
//	    }
//
//	    // Endpoint to get approved leave requests
//	    @GetMapping("/approved")
//	    public List<LeaveRequest> getApprovedLeaveRequests() {
//	        return LeaveRequestRepository.findAll().stream()
//	                .filter(leaveRequest -> leaveRequest.getStatus().equals("Approved"))
//	                .collect(Collectors.toList());
//	    }
//
//	    // Endpoint to get rejected leave requests
//	    @GetMapping("/rejected")
//	    public List<LeaveRequest> getRejectedLeaveRequests() {
//	        return LeaveRequestRepository.findAll().stream()
//	                .filter(leaveRequest -> leaveRequest.getStatus().equals("Rejected"))
//	                .collect(Collectors.toList());
//	    }

	}
