package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Photos;

public interface PhotosRepo extends JpaRepository<Photos, Long> {

	Optional<Photos> findByName(String Name);
	
}
