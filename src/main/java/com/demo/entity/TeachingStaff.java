package com.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class TeachingStaff extends Staff {
	String qualification;
	String subject;
}
