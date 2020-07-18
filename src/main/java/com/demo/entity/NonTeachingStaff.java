package com.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@DiscriminatorValue(value = "NTS")
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class NonTeachingStaff extends Staff {
	private static final long serialVersionUID = -1442502093940576861L;
	String areaExpertise;
}
