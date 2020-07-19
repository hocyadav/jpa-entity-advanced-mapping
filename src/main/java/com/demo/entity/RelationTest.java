package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class RelationTest {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	/** testing entity relation with inheritance **/
	
	//@OneToOne //working
	@ManyToOne //working
	TeachingStaff tstaff;
	
	//@OneToMany //working 
	@ManyToMany //working
	List<Staff> staff = new ArrayList<Staff>();
	
}
