package com.kevin.firstwebapp.ssh.controller;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoTask {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		ApplicationContext c = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		Thread.sleep(1000*100);
	}

}
