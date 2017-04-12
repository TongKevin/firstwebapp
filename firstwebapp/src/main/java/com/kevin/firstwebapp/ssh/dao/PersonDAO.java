package com.kevin.firstwebapp.ssh.dao;

import java.util.List;

import com.kevin.firstwebapp.ssh.entity.Person;

public interface PersonDAO {

	public List<Person> getPersons();

	public void addPerson(Person person);

	public void updatePerson(Person person);

	public void deletePerson(Person person);
}
