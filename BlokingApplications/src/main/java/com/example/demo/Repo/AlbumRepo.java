package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Album;

public interface AlbumRepo extends JpaRepository<Album, Long> {

}
