package com.transamerica.research.spring.boot.jasypt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transamerica.research.spring.boot.jasypt.demo.model.Person;
import com.transamerica.research.spring.boot.jasypt.demo.service.PersonService;

@RestController
public class RestServiceController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value={"/person"}, method=RequestMethod.GET, produces="application/json")
	@ResponseStatus(HttpStatus.OK)
    public Person getPerson() {
		return personService.getPerson();
	}
    
}
