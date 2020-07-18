package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.StaffDAO;
import com.demo.dao.TStaffDAO;
import com.demo.entity.NonTeachingStaff;
import com.demo.entity.TeachingStaff;

@SpringBootApplication
public class JpaAdvancedMappingApplication implements CommandLineRunner{

	@Autowired StaffDAO staffDB;
	@Autowired TStaffDAO tstaffDB;
	
	@Override
	public void run(String... args) throws Exception {
		staffDB.save(new TeachingStaff("M tech", "physics"));
		staffDB.save(new TeachingStaff("B Tech", "chemistry"));
		staffDB.save(new TeachingStaff("Phd", "maths"));
		staffDB.save(new TeachingStaff("M Sc", "science"));
		staffDB.save(new TeachingStaff("M Tech", "english"));

		staffDB.save(new NonTeachingStaff("expert in maths"));
		
		staffDB.findAll().forEach(System.out::println);
		System.out.println("-------------------------");
		tstaffDB.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaAdvancedMappingApplication.class, args);
	}

}
