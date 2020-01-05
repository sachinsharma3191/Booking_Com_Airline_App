package com.airline.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airline.config.HibernateSessionFactory;
import com.airline.model.User;

@Repository
public class UserDetailsDAOImpl implements UserDetailsDAO {

	@Autowired
	private HibernateSessionFactory sessionFactory;

	@Override
	public User findUserByUsername(String username) {
		
		return sessionFactory.getSessionFactory().openSession().get(User.class, username);
	}
}