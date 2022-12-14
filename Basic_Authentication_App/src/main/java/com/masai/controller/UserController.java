package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.User;
import com.masai.service.UserSer;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserSer uSer;
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/get")
	public ResponseEntity<List<User>> getUser(){
		
		List<User> list = uSer.getUser();
		
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}

}
