package com.AttendanceManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.LeaveRequest;
import com.AttendanceManagement.Repository.LeaveRequestRepository;
import com.AttendanceManagement.dto.LeaveRequestDTO;
import com.AttendanceManagement.dto.LeaveResponseDTO;
import com.AttendanceManagement.exception.LeaveRequestNotFoundException;

import java.util.List;

@Service
public class LeaveRequestService {

    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveRequestRepository.findAll();
    }

    public LeaveRequest approveLeaveRequest(Long id) {
        LeaveRequest leaveRequest = leaveRequestRepository.findById(id)
                .orElseThrow(() -> new LeaveRequestNotFoundException("Leave request not found with id: " + id));
        leaveRequest.setStatus("Approved");
        return leaveRequestRepository.save(leaveRequest);
    }

    public LeaveRequest rejectLeaveRequest(Long id) {
        LeaveRequest leaveRequest = leaveRequestRepository.findById(id)
                .orElseThrow(() -> new LeaveRequestNotFoundException("Leave request not found with id: " + id));
        leaveRequest.setStatus("Rejected");
        return leaveRequestRepository.save(leaveRequest);
    }

    public LeaveRequest createLeaveRequest(LeaveRequest leaveRequest) {
        leaveRequest.setStatus("Pending");
        return leaveRequestRepository.save(leaveRequest);
    }   

	public LeaveResponseDTO createLeaveRequest(LeaveRequestDTO leaveRequestDTO) // Map LeaveRequestDTO to LeaveRequest entity
	{ 
		LeaveRequest leaveRequest = new LeaveRequest();
    leaveRequest.setEmployeeId(leaveRequestDTO.getEmployeeId());
    leaveRequest.setStartDate(leaveRequestDTO.getStartDate());
    leaveRequest.setEndDate(leaveRequestDTO.getEndDate());
    leaveRequest.setReason(leaveRequestDTO.getReason());
    leaveRequest.setStatus("Pending"); // Set default status to "Pending"

    // Save the leave request entity to the database
    LeaveRequest savedLeaveRequest = leaveRequestRepository.save(leaveRequest);

    // Map the saved LeaveRequest entity back to LeaveResponseDTO
    LeaveResponseDTO leaveResponseDTO = new LeaveResponseDTO();
    leaveResponseDTO.setId(savedLeaveRequest.getId());
    leaveResponseDTO.setEmployeeId(savedLeaveRequest.getEmployeeId());
    leaveResponseDTO.setStartDate(savedLeaveRequest.getStartDate());
    leaveResponseDTO.setEndDate(savedLeaveRequest.getEndDate());
    leaveResponseDTO.setReason(savedLeaveRequest.getReason());
    leaveResponseDTO.setStatus(savedLeaveRequest.getStatus());

    return leaveResponseDTO;
}
}