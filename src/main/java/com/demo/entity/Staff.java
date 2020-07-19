package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)//making 2 table total - both for child class
@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Staff{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffId;
	String staffName;

	public Staff(String staffName) {
		super();
		this.staffName = staffName;
	}

}
