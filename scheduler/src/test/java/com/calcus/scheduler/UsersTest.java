package com.calcus.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.UsersDAO;
import com.calcus.scheduler.model.Users;

public class UsersTest { 
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		UsersDAO usersDAO = (UsersDAO) context.getBean("usersDAO");
		Users users = (Users) context.getBean("users");
		// Create Operation
		users.setName("Admin");
		users.setPassword("admin");
		users.setEmail("admin@calcus.com");
		users.setMobile("8593800001");
	    usersDAO.saveOrUpdate(users);
	    
	    System.out.println("User Updated");
	}

}
