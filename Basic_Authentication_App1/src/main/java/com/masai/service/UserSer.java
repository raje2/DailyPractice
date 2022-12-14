package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.models.User;

@Service
public class UserSer {
	
	public List<User> getUser() {
		
		List<User> list = new ArrayList<>();
		
		list.add(new User(1,"user1"));
		list.add(new User(2,"user2"));
		list.add(new User(3,"user3"));
		list.add(new User(4,"user4"));
		
		return list;
		
	}

}
