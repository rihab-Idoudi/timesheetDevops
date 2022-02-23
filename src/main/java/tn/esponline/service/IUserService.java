package tn.esponline.service;

import java.util.List;

import tn.esponline.entities.User;


public interface IUserService { 
	 
	List<User> retrieveAllUsers(); 
	User addUser(User u);
	void deleteUser(String id);
	User updateUser(User u);
	User retrieveUser(String id);

} 
