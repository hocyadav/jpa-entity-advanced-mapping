package com.demo.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.Valid2DAO;
import com.demo.entity.Validation2;

@RestController
@RequestMapping("/api")
public class Apis {
	
	@Autowired Valid2DAO validDB;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Validation2> viewAll() {
		return validDB.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void validateAndSave(@RequestBody @Valid Validation2 validObj) {//without @valid it will validate but throw exception + api error in postman
																	//with @valid annotaion it will only throw msg on postman
		System.out.println("input json : "+validObj);
		validDB.save(validObj);
	}
}
