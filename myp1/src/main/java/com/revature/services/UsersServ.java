package com.revature.services;

import java.util.List;
import java.util.Optional;

import com.revature.beans.Users;

public interface UsersServ {
	
	public Users userLogin(String username, String password);
	public Users userLogout();
	
	public Users viewUser (String username);
	public Users updateUser(int id, Users users);
	
	public List<Users> findAll();
	public static Optional<Users> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Users save(Users item);
	public void deleteById(int id);

	
	
}
