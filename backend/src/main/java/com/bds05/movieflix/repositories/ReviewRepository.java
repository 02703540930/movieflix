package com.bds05.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bds05.movieflix.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
