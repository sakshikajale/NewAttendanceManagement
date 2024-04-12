package com.AttendanceManagement.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AttendanceManagement.Model.Employee;

@Repository
public interface RegistrationRepository extends JpaRepository<Employee, Long> {

	   Employee findByEmail(String email);
	   
	      Employee findByEmailAndPassword(String email, String password);

}
