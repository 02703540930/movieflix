package com.bds05.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bds05.movieflix.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
