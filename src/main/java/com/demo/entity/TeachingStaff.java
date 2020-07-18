package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@DiscriminatorValue(value = "TS")
//@PrimaryKeyJoinColumn(referencedColumnName = "staffId")//foreign colum name - parent PK
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class TeachingStaff extends Staff {
	
	private static final long serialVersionUID = -6196646585299577935L;
	
	String qualification;
	String subject;
	
}
