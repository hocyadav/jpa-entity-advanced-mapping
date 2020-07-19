package com.demo.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class TeachingStaff extends Staff {
	String qualification;
	
	@NotEmpty(message = "teachind staff subject is null make is not null")
	String subject;

	
	public TeachingStaff(String staffName, String qualification,
			@NotEmpty(message = "teachind staff subject is null make is not null") String subject) {
		super(staffName);
		this.qualification = qualification;
		this.subject = subject;
	}
	
}
