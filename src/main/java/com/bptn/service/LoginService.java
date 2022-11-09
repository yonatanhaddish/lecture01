package com.bptn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bptn.exceptions.InvalidStudentIdException;
import com.bptn.models.Students;
import com.bptn.repository.LoginRepository;

@Service
public class LoginService {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoginRepository loginRepository;
	
	public String validateStudentCredentials(Students studentCred) throws InvalidStudentIdException {
		
		List<Students> studententity = loginRepository.getUserByUserId(studentCred.getStudentName());
		
		for (Students st : studententity) {
			
			LOGGER.info("Retreiving studentName from the database");
			
			if (st.getStudentName().equals(studentCred.getStudentName()))
				
				return "Student Name Found";
				
		}
		return "student name issue!!!" + new InvalidStudentIdException("Student Name Not Found.");
		
	}

}
