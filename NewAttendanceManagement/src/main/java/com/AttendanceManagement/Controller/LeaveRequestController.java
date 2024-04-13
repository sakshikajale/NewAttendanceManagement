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
	    // Approved, Rejected, Pending request List
	
	    @GetMapping("/pending")
	    public ResponseEntity<List<LeaveRequest>> getPendingLeaveRequests() {
	        List<LeaveRequest> pendingLeaveRequests = leaveRequestService.getPendingLeaveRequests();
	        return new ResponseEntity<>(pendingLeaveRequests, HttpStatus.OK);
	    }
	
	    @GetMapping("/approved")
	    public ResponseEntity<List<LeaveRequest>> getApprovedLeaveRequests() {
	        List<LeaveRequest> approvedLeaveRequests = leaveRequestService.getApprovedLeaveRequests();
	        return new ResponseEntity<>(approvedLeaveRequests, HttpStatus.OK);
	    }
	
	    @GetMapping("/rejected")
	    public ResponseEntity<List<LeaveRequest>> getRejectedLeaveRequests() {
	        List<LeaveRequest> rejectedLeaveRequests = leaveRequestService.getRejectedLeaveRequests();
	        return new ResponseEntity<>(rejectedLeaveRequests, HttpStatus.OK);
	    }
}

	}
