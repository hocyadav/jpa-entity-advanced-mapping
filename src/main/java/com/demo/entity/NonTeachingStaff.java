package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@DiscriminatorValue(value = "NTS")//not required in case of join type
@PrimaryKeyJoinColumn(referencedColumnName = "staffId")//foreign key - column name of parent class
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class NonTeachingStaff extends Staff {
	private static final long serialVersionUID = -1442502093940576861L;
	String areaExpertise;
}
