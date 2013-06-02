package com.esprit.market.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.esprit.market.domain.User;
import com.esprit.market.service.UserDao;
import com.esprit.market.serviceImpl.UserDaoImpl;

public class UserDaoTest {

	UserDao user;

	@Before
	public void setUp() {
		user = new UserDaoImpl();
	}

	@Test
	public void addUserTest() {
		User u = new User();

		u.setUsername("root");
		u.setPassword("root");

		user.addUser(u);
	}

}
