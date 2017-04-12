package com.kevin.firstwebapp.ssh.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class AutoTask {


	public  AutoTask() {
		// TODO Auto-generated constructor stub
	}
	
	@Scheduled(fixedRate = 2000)
	public void printsomthing() {
		
		//context.get
		System.out.println("task exexuted");
	}
}
