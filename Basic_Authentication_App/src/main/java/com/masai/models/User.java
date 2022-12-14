package com.masai.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	private Integer id;
	private String name;
	
	
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
