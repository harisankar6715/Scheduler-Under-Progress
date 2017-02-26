package com.calcus.scheduler.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.calcus.scheduler.model.Task;
import com.calcus.scheduler.model.Users;

@EnableTransactionManagement
@Configuration
@ComponentScan("com.calcus.scheduler")
public class ApplicationContextConfig {
	
	@Bean(name ="dataSource")
	public DataSource getH2DataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();

	dataSource.setDriverClassName("org.h2.Driver");

	dataSource.setUrl("jdbc:h2:tcp://localhost/~/scheduler_db");

	dataSource.setUsername("sdb");
	dataSource.setPassword("sdb");
	return dataSource;
	}
private Properties getHibernateProperties() {
		Properties properties=new Properties();
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		return properties;
	}
@Autowired
@Bean(name="sessionFactory")
public SessionFactory getSessionFactory(DataSource datasource) { 
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(datasource);
	sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.addAnnotatedClass(Users.class);
	sessionBuilder.addAnnotatedClass(Task.class);
	return sessionBuilder.buildSessionFactory();
	}
@Autowired
@Bean(name = "transactionMnager")
public HibernateTransactionManager getTransactionManager (SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
}



