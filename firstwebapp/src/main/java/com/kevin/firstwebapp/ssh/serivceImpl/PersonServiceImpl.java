package com.kevin.firstwebapp.ssh.serivceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.firstwebapp.ssh.dao.PersonDAO;
import com.kevin.firstwebapp.ssh.entity.Person;
import com.kevin.firstwebapp.ssh.serivce.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonDAO personDAO;
	
	Logger log = Logger.getLogger(PersonServiceImpl.class);
	
	public List<Person> getPersons() {
		personDAO.getPersons();
		log.info("PersonServiceImpl getperson");
		return null;
	}

	public void addPerson(Person person) {

	}

	public void updatePerson(Person person) {

	}

	public void deletePerson(Person person) {

	}
}
