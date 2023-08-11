package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {

	List<Rating> findByUserId(String userId);    
	List  <Rating> findByHotelId(String hotelId);
}
