package com.kevin.firstwebapp.ssh.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.kevin.firstwebapp.ssh.dao.PersonDAO;
import com.kevin.firstwebapp.ssh.entity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO{

	Logger log = Logger.getLogger(PersonDAOImpl.class);

	public List<Person> getPersons() {
		log.info("PersonDAOImpl getpersons");
		return null;
	}

	public void addPerson(Person person) {

	}

	public void updatePerson(Person person) {

	}

	public void deletePerson(Person person) {

	}
}
