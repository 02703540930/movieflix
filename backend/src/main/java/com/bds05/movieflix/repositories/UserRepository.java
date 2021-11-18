package com.bds05.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bds05.movieflix.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
