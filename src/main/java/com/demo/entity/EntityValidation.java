package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//java class should persist in database
@Data @NoArgsConstructor @AllArgsConstructor
public class EntityValidation {
	@Id //primary key of table 
	@GeneratedValue(strategy = GenerationType.AUTO)//PK id generation
	int id;
	@NotNull
	String name;
	
	@Email(message = "Invalid email id format")
	String email;

	@ElementCollection //one-to-many relation for Basic values like collection of String or Embeddable value
	List<String> mobileNumbers = new ArrayList<>();//working
	//List<@NotEmpty(message = "minimum 1 phone number required") String> mobileNumbers = new ArrayList<>();
	
	//@OneToOne //working - 1 new column added with name staff
	@ManyToOne //working - --"--
	Staff staff;
	
	public EntityValidation(@NotNull String name) {
		super();
		this.name = name;
	}
}
