package com.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.DogDAO;
import com.demo.dao.EntityVDAO;
import com.demo.dao.RelationDAO;
import com.demo.dao.StaffDAO;
import com.demo.dao.TStaffDAO;
import com.demo.entity.EntityValidation;
import com.demo.entity.NonTeachingStaff;
import com.demo.entity.RelationTest;
import com.demo.entity.TeachingStaff;
import com.demo.entity.embeddable.Animal;
import com.demo.entity.embeddable.Dog;

@SpringBootApplication
public class JpaAdvancedMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaAdvancedMappingApplication.class, args);
	}
	
	@Autowired StaffDAO staffDB;
	@Autowired TStaffDAO tstaffDB;
	@Autowired RelationDAO relationTestDB;
	
	@Autowired EntityVDAO entityValidationDB;
	@Autowired DogDAO dogDb;
	
	@Override
	public void run(String... args) throws Exception {
		dummyStaffData();
		dummyRelationData();
		entityValidation();
		entityEmbeddableTest();
		
		/** print db data **/
		staffDB.findAll().forEach(System.out::println);
		System.out.println("-------------------------");
		tstaffDB.findAll().forEach(System.out::println);
	}

	private void entityEmbeddableTest() {
		Dog d = new Dog();
		d.setAnimalObj(new Animal("type1", "bangalore"));//optional - without this null entry
		d.setDogCat("indian");
		dogDb.save(d);
	}

	private void entityValidation() {
		//EntityValidation e = new EntityValidation(1, "omprakash");//working interally it is saving different id
		//EntityValidation e = new EntityValidation(1, null);//testing null - working
		EntityValidation e = new EntityValidation("omprakash");//working
		//e.setEmail("hariomgmail.com");//testing - working
		e.setEmail("hariom@gmail.com");
		e.getMobileNumbers().add("9887700499");
		e.getMobileNumbers().add("9876543210");
		//e.setLocalDate(LocalDate.now());//testing local date entity field - working
//		e.setLocalDate(LocalDate.now().minusDays(1));//testing local date entity field - @past annotaion
		entityValidationDB.save(e);
	}

	private void dummyRelationData() {
		RelationTest r = new RelationTest();
		
		staffDB.findAll().stream().forEach(staff -> {
			r.getStaff().add(staff);
			relationTestDB.save(r);
			});
	}

	private void dummyStaffData() {
		staffDB.save(new TeachingStaff("hari", "M tech", "physics"));
		staffDB.save(new TeachingStaff("om", "B Tech", "chemistry"));
		staffDB.save(new TeachingStaff("yadav","Phd", "maths"));
		staffDB.save(new TeachingStaff("neha", "M Sc", "science"));
		staffDB.save(new TeachingStaff("chandan", "M Tech", "english"));
		//staffDB.save(new TeachingStaff("M Tech", null));//for testing null - working

		staffDB.save(new NonTeachingStaff("rajat","expert in maths"));
	}


}
