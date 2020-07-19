package com.demo.entity.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Animal {
	//@Column(name = "name")//optional - without it will create default name
	String animalName;
	String location;
}
