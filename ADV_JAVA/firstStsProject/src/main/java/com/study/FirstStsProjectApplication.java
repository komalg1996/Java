package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.study.dao.UserRepository;
import com.study.entity.User;

@SpringBootApplication
public class FirstStsProjectApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(FirstStsProjectApplication.class, args);
	UserRepository userRepo= context.getBean(UserRepository.class);
	User user=new User();
	user.setName("Komal G");
	user.setCity("pune");
	user.setStatus("I am java programmer");
	
	User user1= userRepo.save(user);
	System.out.println(user1);
	
	
	
	}

}
