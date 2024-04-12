package com.AttendanceManagement.Service;
import org.springframework.stereotype.Service;



import com.AttendanceManagement.Model.Employee;

import com.AttendanceManagement.Repository.RegistrationRepository;
import com.AttendanceManagement.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class RegistrationService  {

	    private static RegistrationRepository registrationRepository;

	    @Autowired
	    public RegistrationService(RegistrationRepository registrationRepository) {
	        RegistrationService.registrationRepository = registrationRepository;
	    }
   
    // Validate user details
    public boolean validateEmployee(Employee employee) {
        return validateName(employee.getName()) &&
               validatePhoneNumber(employee.getPhoneNumber()) &&
               validatePassword(employee.getPassword()) &&
               validateEmail(employee.getEmail());
    }

    // Validate full name
    private boolean validateName(String name) {
        return name.matches("^\\p{L}+\\s+\\p{L}+$");
    }

    // Validate phone number
    private boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\d{10}$");
    }

    // Validate email
    private boolean validateEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
    
    private boolean validatePassword(String password) {
        return password.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
    
    //Crud Operations
   
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employeeOptional = registrationRepository.findById(id);
        return employeeOptional.orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return registrationRepository.save(employee);
    }


    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        return registrationRepository.save(employee);
    }


    public void deleteEmployee(Long id) {
        registrationRepository.deleteById(id);
    }


	public static List<Employee> getAllEmployeess()  {
        return registrationRepository.findAll();
    }

}


	


  




