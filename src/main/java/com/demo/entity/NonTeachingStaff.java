package com.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class NonTeachingStaff extends Staff {
	String areaExpertise;

	public NonTeachingStaff(String staffName, String areaExpertise) {
		super(staffName);
		this.areaExpertise = areaExpertise;
	}
	
}
