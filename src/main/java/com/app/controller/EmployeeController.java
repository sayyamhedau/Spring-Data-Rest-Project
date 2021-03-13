package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping(value = "/welcome")
	public ResponseEntity<String> sayWelcomeMessage(@Param(value = "name") String name) {
		log.info("username :: " + name);
		return ResponseEntity.ok("Welcome to My World ".concat(name));
	}
}
