package com.example.demo.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Rating;
import com.example.demo.Repo.RatingRepo;
import com.example.demo.Service.RatingService;
@Service
public class RatingImpl implements RatingService{
@Autowired
private RatingRepo retingrepo;
	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		rating.setRatingId(UUID.randomUUID().toString());
		return this.retingrepo.save(rating);
	}

	@Override
	public List<Rating> getRating() {
		// TODO Auto-generated method stub
		return this.retingrepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String UserId) {
		// TODO Auto-generated method stub
		return this.retingrepo.findByUserId(UserId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return this.retingrepo.findByHotelId(hotelId);
	}

}
