package com.transamerica.research.spring.boot.jasypt.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transamerica.research.spring.boot.jasypt.demo.config.PersonConfig;
import com.transamerica.research.spring.boot.jasypt.demo.model.Person;

@Service
public class PersonService {
	
    @Autowired
    PersonConfig person;
	
	public Person getPerson() {
		return person.getPerson();
	}
	
}
