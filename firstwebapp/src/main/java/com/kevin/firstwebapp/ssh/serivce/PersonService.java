package com.kevin.firstwebapp.ssh.serivce;

import java.util.List;

import com.kevin.firstwebapp.ssh.entity.Person;

public interface PersonService {

	List<Person> getPersons();

	void addPerson(Person person);

	void updatePerson(Person person);

	void deletePerson(Person person);
}
