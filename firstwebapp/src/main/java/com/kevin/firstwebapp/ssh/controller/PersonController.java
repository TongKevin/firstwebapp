package com.kevin.firstwebapp.ssh.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kevin.firstwebapp.ssh.entity.Person;
import com.kevin.firstwebapp.ssh.serivce.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	Logger log = Logger.getLogger(PersonController.class);
	
	public List<Person> getPersons() {
		personService.getPersons();
		log.info("PersonController getpersons");
		return null;
	}

	public void addPerson(Person person) {

	}

	public void updatePerson(Person person) {

	}

	public void deletePerson(Person person) {

	}
}
