package com.bds05.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bds05.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
