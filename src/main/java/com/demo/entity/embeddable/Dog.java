package com.demo.entity.embeddable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Dog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String dogCat;
	
	//@Embedded//without annotation also working since we added @Embeddable on top of Animal class
	Animal animalObj;
}
