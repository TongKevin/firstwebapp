package com.kevin.firstwebapp.ssh.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.firstwebapp.ssh.dao.PersonDAO;
import com.kevin.firstwebapp.ssh.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO personDAO;
	
	public List<Person> getPersons() {
		return null;
	}

	public void addPerson(Person person) {

	}

	public void updatePerson(Person person) {

	}

	public void deletePerson(Person person) {

	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
}
