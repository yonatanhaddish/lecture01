package com.bptn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lecture01Controller {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public ResponseEntity<String> ping() {
		
		logger.debug("Executing ping()");
		
		return new ResponseEntity<String>("lecture01 running and running", HttpStatus.OK);
	}

}