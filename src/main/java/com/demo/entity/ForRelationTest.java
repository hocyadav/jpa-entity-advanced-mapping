package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class ForRelationTest {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@ManyToOne
	Staff staff;
	
	public ForRelationTest(Staff staff) {
		super();
		this.staff = staff;
	}
	
}
