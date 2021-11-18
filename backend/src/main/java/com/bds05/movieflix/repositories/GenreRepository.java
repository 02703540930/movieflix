package com.bds05.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bds05.movieflix.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
