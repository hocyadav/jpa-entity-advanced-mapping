package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Validation2 {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@NotNull(message = "name is required")
	String name;
	
	@NotNull(message = "please add email id")//this is for when json field email is not present
	@Email(message = "Invalid email id format") //this is for when input string is not email
	String email;
}
