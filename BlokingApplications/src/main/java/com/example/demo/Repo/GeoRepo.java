package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Geo;

public interface GeoRepo extends JpaRepository<Geo, Long> {

}
