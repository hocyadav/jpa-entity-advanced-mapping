package com.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.RelationDAO;
import com.demo.dao.StaffDAO;
import com.demo.dao.TStaffDAO;
import com.demo.entity.ForRelationTest;
import com.demo.entity.NonTeachingStaff;
import com.demo.entity.Staff;
import com.demo.entity.TeachingStaff;

@SpringBootApplication
public class JpaAdvancedMappingApplication implements CommandLineRunner{

	@Autowired StaffDAO staffDB;
	@Autowired TStaffDAO tstaffDB;
	@Autowired RelationDAO relationTestDB;
	
	@Override
	public void run(String... args) throws Exception {
		dummyStaffData();
		
		staffDB.findAll().stream().forEach(staff -> {
			ForRelationTest r = new ForRelationTest(staff);
			relationTestDB.save(r);
			});
		
//		Optional<Staff> findFirst = findAll.stream().findFirst();
//		ForRelationTest entity = new ForRelationTest(findFirst.get());
//		relationTestDB.save(entity);
//		
		staffDB.findAll().forEach(System.out::println);
		System.out.println("-------------------------");
		tstaffDB.findAll().forEach(System.out::println);
	}

	private void dummyStaffData() {
		staffDB.save(new TeachingStaff("M tech", "physics"));
		staffDB.save(new TeachingStaff("B Tech", "chemistry"));
		staffDB.save(new TeachingStaff("Phd", "maths"));
		staffDB.save(new TeachingStaff("M Sc", "science"));
		staffDB.save(new TeachingStaff("M Tech", "english"));

		staffDB.save(new NonTeachingStaff("expert in maths"));
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaAdvancedMappingApplication.class, args);
	}

}
