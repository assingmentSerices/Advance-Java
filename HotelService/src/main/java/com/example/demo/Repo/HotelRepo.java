package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{

	
}
