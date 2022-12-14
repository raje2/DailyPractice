package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")
public class HomeController {
	
	@GetMapping("/login")
	public ResponseEntity<String> login(){
		String ans = "In login page......";
		return new ResponseEntity<String>(ans,HttpStatus.OK);
	}
	
	@GetMapping("/home")
	public ResponseEntity<String> home(){
		String ans = "Wel Come To Home page......";
		return new ResponseEntity<String>(ans,HttpStatus.OK);
	}
	
	@PostMapping("/user")
	public ResponseEntity<String> register(){
		String ans = "Register successfully To Home page......";
		return new ResponseEntity<String>(ans,HttpStatus.OK);
	}
	

}
