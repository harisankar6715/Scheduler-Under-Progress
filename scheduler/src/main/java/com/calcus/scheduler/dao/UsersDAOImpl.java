package com.calcus.scheduler.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.calcus.scheduler.model.Users;

@Transactional
@Repository("usersDAO") 
public class UsersDAOImpl implements UsersDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public UsersDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Users users) {
		sessionFactory.getCurrentSession().saveOrUpdate(users);

	}

	@Transactional
	public void delete(int Id) {
		Users userToDelete = new Users();
		userToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(userToDelete);

	}

	@Transactional
	public Users get(int Id) {
		String hql = "from Users where Id=:Id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", Id);
		List<Users> gotUser = (List<Users>)query.list();
		if (gotUser != null && !gotUser.isEmpty())
			return gotUser.get(0);
		return null;
	}

	@Transactional
	public List<Users> listUsers() {
		String hql = "from Users";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Users> listOfUser = (List<Users>)query.list();
		return listOfUser;
	}
	@Transactional
	public boolean isValidUser(String Email, String password) {
		String hql = "from Users where Email= '" + Email + "' and " + " password ='" + password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return true;
		}
		return false;
	}
}
