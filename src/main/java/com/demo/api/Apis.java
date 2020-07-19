package com.demo.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	//above post method return "MethodArgumentNotValidException" in case of invalid object
	
	
	//handleMethodArgumentNotValid method is decorated with two annotations
	@ResponseStatus(HttpStatus.BAD_REQUEST) //1st : specifies that a 400 Bad Request status will be returned in the response.
	@ExceptionHandler(MethodArgumentNotValidException.class) //2nd : mark this method to handle all MethodArgumentNotValidExceptions
	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		
		Map<String, String> errorsMap = new HashMap<>();

		ex.getBindingResult()
			.getFieldErrors()
			.forEach(error -> errorsMap.put(error.getField(), error.getDefaultMessage()));

		return errorsMap;//return map to client in json format
	}
}
