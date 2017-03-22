package com.kevin.firstwebapp.ssh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kevin.firstwebapp.ssh.entity.Person;
import com.kevin.firstwebapp.ssh.serivce.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	public List<Person> getPersons() {
		return null;
	}

	public void addPerson(Person person) {

	}

	public void updatePerson(Person person) {

	}

	public void deletePerson(Person person) {

	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
