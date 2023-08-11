package com.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.test.dao.UserReop;
import com.demo.test.entities.User;

@SpringBootApplication
public class DemoCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoCrudApplication.class, args);
	
		UserReop userrepo =context.getBean(UserReop.class);
		User user = new User();
		user.setName("Komal Ghorpade");
		user.setCity("Pune");
		user.setStatus("Developer");
		
		User user1=  userrepo.save(user);
		System.out.println(user1);
		
		
	}

}
