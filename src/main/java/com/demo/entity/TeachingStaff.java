package com.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@DiscriminatorValue(value = "TS")
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class TeachingStaff extends Staff {
	
	private static final long serialVersionUID = -6196646585299577935L;
	
	String qualification;
	String subject;
	
}
