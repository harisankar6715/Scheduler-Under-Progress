package com.calcus.scheduler.junitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calcus.scheduler.dao.UsersDAO;
import com.calcus.scheduler.model.Users;

public class TestCaseUsers {

	@Autowired
	static UsersDAO usersDAO;
	@Autowired
	static Users users;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.calcus");
		context.refresh();
		usersDAO = (UsersDAO) context.getBean("usersDAO");
		users = (Users) context.getBean("users");
	}
	@Test
	public void usersNameTest() {
		users = usersDAO.get(1);
		String name = users.getName();
		System.out.println("******************----"+name);
		assertEquals("Users Name Test", "Admin", name);
	}
}

