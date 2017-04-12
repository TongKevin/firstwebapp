package com.kevin.firstwebapp.ssh.controller;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonController {

	static ClassPathXmlApplicationContext applicationContext;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		applicationContext.destroy();
	}

	@Test
	public void testgetpersons() {
		PersonController p = (PersonController) applicationContext.getBean("personController");
		p.getPersons();
	}

}
