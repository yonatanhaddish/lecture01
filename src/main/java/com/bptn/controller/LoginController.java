package com.bptn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bptn.exceptions.InvalidStudentIdException;
import com.bptn.models.Students;
import com.bptn.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/user/login")
	public ResponseEntity<?> validateStudentCredentials(@RequestBody Students studentCred) throws InvalidStudentIdException {
		
		String loginDetails = loginService.validateStudentCredentials(studentCred);
		
		return new ResponseEntity<> (loginDetails, HttpStatus.OK);
	}

}
