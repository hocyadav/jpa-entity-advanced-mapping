package com.demo.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.NoArgsConstructor;

@DiscriminatorColumn(name = "type")//optional default table name is like dtype
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//if we remove by default it will work like single table
@Entity
@Data @NoArgsConstructor
public class Staff implements Serializable{

	private static final long serialVersionUID = 3727913075622171843L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffId;
	String staffName;

	public Staff(String staffName) {
		super();
		this.staffName = staffName;
	}

}
