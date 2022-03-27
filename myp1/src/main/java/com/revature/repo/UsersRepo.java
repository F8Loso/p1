package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Users;



public interface UsersRepo extends JpaRepository<Users, Integer> {
	
	public Users getUserByUsernameAndPassword(String username,String password);
	
	public Users getUserByUsername(String username);

}