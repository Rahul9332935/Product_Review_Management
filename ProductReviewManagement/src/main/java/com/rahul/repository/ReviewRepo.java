package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {

}
