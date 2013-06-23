package com.esprit.market.service;

import java.util.HashSet;

import com.esprit.market.domain.User;

public interface UserDao {
	
	public void addUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);

	public User getUserById(int user);

	public HashSet<User> listUser();
	
	public void checkUser(String login,String password);

}
