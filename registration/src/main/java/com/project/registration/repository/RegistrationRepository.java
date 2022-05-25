package com.project.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.registration.entity.User;

public interface RegistrationRepository extends JpaRepository<User,Integer>{
	
	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username,String password);

}
